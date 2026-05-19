package com.eugene.mcp;

import com.eugene.mcp.model.Movie;
import com.eugene.mcp.repo.MovieRepository;
import com.eugene.mcp.service.MovieService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class MovieServiceIntegrationTest {

    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieRepository movieRepository;

    @Test
    void testGetAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        assertNotNull(movies);
        assertFalse(movies.isEmpty());
        assertEquals(12, movies.size());
    }

    @Test
    void testGetMovieByTitle_ExistingMovie() {
        Optional<Movie> movie = movieService.getMovieByTitle("Thunderbolts");
        assertTrue(movie.isPresent());
        assertEquals("Thunderbolts", movie.get().getTitle());
        assertEquals("A group of anti-heroes are recruited to go on a mission that could save the world.", movie.get().getDescription());
        assertEquals(7.5, movie.get().getRating().doubleValue());
    }

    @Test
    void testGetMovieByTitle_NonExistingMovie() {
        Optional<Movie> movie = movieService.getMovieByTitle("NonExistentMovie");
        assertFalse(movie.isPresent());
    }

    @Test
    void testSearchMovies_ExactMatch() {
        List<Movie> movies = movieService.searchMovies("Dune");
        assertNotNull(movies);
        assertFalse(movies.isEmpty());
        assertEquals(1, movies.size());
        assertEquals("Dune: Part Two", movies.get(0).getTitle());
    }

    @Test
    void testSearchMovies_PartialMatch() {
        List<Movie> movies = movieService.searchMovies("Movie");
        assertNotNull(movies);
        assertFalse(movies.isEmpty());
        // Should find movies with "Movie" in title
        assertTrue(movies.size() >= 1);
    }

    @Test
    void testSearchMovies_NoMatch() {
        List<Movie> movies = movieService.searchMovies("xyz123");
        assertNotNull(movies);
        assertTrue(movies.isEmpty());
    }

    @Test
    void testGetOldMovieByTitle() {
        Movie movie = movieService.getOldMovieByTitle("AnyTitle");
        assertNotNull(movie);
        assertEquals("Old movie title was here EB", movie.getTitle());
        assertEquals("This is a old movie", movie.getDescription());
        assertEquals(5, movie.getRating().intValue());
    }
}
package com.eugene.mcp.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;
import com.eugene.mcp.model.Movie;
import com.eugene.mcp.repo.MovieRepository;

@Service
public class MovieService {

    private static final Logger LOG = LoggerFactory.getLogger(MovieService.class);

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Tool(name = "eb_get_movies", description = "Get a list of all movies from library")
    public List<Movie> getAllMovies() {
        LOG.info("Fetching all movies");
        return movieRepository.findAll();
    }

    @Tool(name = "eb_get_movie_by_title", description = "Get a single movie from library by Title")
    public Optional<Movie> getMovieByTitle(String title) {
        LOG.info("Fetching movie with title: {}", title);
        return Optional.ofNullable(movieRepository.findByTitle(title));
    }

    @Tool(name = "eb_search_movies", description = "Search for movies containing keywords in title")
    public List<Movie> searchMovies(String query) {
        LOG.info("Searching for movies with query: {}", query);
        return movieRepository.findByTitleContainingIgnoreCase(query);
    }

    @Tool(name = "eb_get_old_movie_by_title", description = "Get a old single movie from library by Title")
    public Movie getOldMovieByTitle(String title) {
        LOG.info("Fetching old movie and mocking result for title: {}", title);
        // This is a placeholder for archived data; in a real app, this would query an archive table.
        Movie movie = new Movie();
        movie.setTitle("Old movie title was here EB");
        movie.setDescription("This is a old movie");
        movie.setRating(5);

        return movie;
    }

}
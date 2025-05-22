package com.eugene.mcp.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.ArrayList;
import com.eugene.mcp.model.Movie;
import com.eugene.mcp.repo.MovieRespository;

@Service
public class MovieService {

    private static final Logger LOG = LogManager.getLogger(MovieService.class);
    // private List<Movie> movies = new ArrayList<>();

    private MovieRespository movieRespository;

    @Autowired
    public void setMovieRespository(MovieRespository movieRespository) {
        this.movieRespository = movieRespository;
    }

    @Tool(name = "eb_get_movies", description = "Get a list of all movies from library")
    public List<Movie> getAllMovies() {
        LOG.info("Fetching all movies");
        return movieRespository.findAll();
    }

    @Tool(name = "eb_get_movie_by_title", description = "Get a single movie from library by Title")
    public Movie getMovieByTitle(String title) {
        LOG.info("Fetching movie with title: " + title);

        return movieRespository.findByTitle(title);
        // movies.stream().filter(movie ->
        // movie.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }

    @Tool(name = "eb_get_old_movie_by_title", description = "Get a old single movie from library by Title")
    public Movie getOldMovieByTitle(String title) {
        LOG.info("Fetching old movie with title: " + title);
        Movie movie = new Movie();
        movie.setTitle("Old movie title was here EB");
        movie.setDescription("This is a old movie");
        movie.setRating(5);

        return movie;
        // movies.stream().filter(movie ->
        // movie.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }

}

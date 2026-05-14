package com.eugene.mcp.repo;

import java.util.List;

import org.springframework.data.repository.*;
import com.eugene.mcp.model.Movie;

public interface MovieRepository extends Repository<Movie, Long> {

    List<Movie> findAll();

    Movie findByTitle(String title);

    List<Movie> findByTitleContainingIgnoreCase(String title);

    Movie save(Movie movie);

    void deleteById(Long id);
}
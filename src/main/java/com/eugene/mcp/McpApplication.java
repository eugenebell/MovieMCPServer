package com.eugene.mcp;

import java.util.List;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eugene.mcp.service.MovieService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class McpApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpApplication.class, args);
	}

	@PostConstruct
	public void setupData() {
		// Do stuff here to load database, for H2 using schema.sql and data.sql in the
		// Resources folder
	}

	/**
	 * This method is used to register the tools with the Spring AI framework.
	 * 
	 * @param movieService
	 * @return
	 */
	@Bean
	public List<ToolCallback> movieTools(MovieService movieService) {
		return List.of(ToolCallbacks.from(movieService));
	}
}

package com.ninoshka.movieinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninoshka.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movie")
public class MovieResource {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		return new Movie(movieId, "Kal Hona Ho", "A KJO Movie");
	}

}

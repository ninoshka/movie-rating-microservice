package com.ninoshka.ratingsdataservice.model;

public class Rating {

	String movieId;
	float rating;	
	
	public Rating(String movieId, float rating) {
		this.movieId = movieId;
		this.rating = rating;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
}

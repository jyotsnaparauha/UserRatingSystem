package com.rating.service;

import java.util.List;

import com.rating.entites.Rating;

public interface RatingService {

	public Rating create(Rating rating);
	
	public List<Rating> getAll();
	
	public Rating get(String id);
	
	//get all by userId
	public List<Rating> getRatingByUser(String userId);
	
	//get all by hotelId
	public List<Rating> getRatingByHotel(String hotelId);
}

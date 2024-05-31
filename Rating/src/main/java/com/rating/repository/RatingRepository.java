package com.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.entites.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>{
   //custome query
	
	//get ratings by user id
	public List<Rating> findByUserId(String userId);
	
	//get ratings by hotel id
	
	public List<Rating> findByHotelId(String hotelId);
	
}

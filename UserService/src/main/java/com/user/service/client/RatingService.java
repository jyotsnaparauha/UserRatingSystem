package com.user.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.user.service.entities.Rating;

@Service
@FeignClient(url="http://192.168.0.57:8083",name="RATING-SERVICE")
public interface RatingService {

	//post
	@PostMapping("/ratings")
	public ResponseEntity<Rating> createRating(Rating values); 
	
	//put
	@PutMapping("/ratings/{ratingId}")
	public Rating updateRating(@PathVariable String ratingId,Rating ratingx);
	
	//delete 
	
	@DeleteMapping("/ratings/{ratingId}")
	public Rating deleteRating(@PathVariable String ratingId);
}

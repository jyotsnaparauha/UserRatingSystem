package com.user.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.user.service.client.RatingService;
import com.user.service.entities.Rating;


@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private RatingService ratingService;
	
	@Test
	void contextLoads() {
	}
	
	/*
	 * @Test void createRating() { Rating rating=Rating.builder().rating(10).userId(
	 * "1b717e37-7a13-451e-953c-b0d37dcea4e7").hotelId(
	 * "693041ce-955b-45bf-9914-5376ab57265a").
	 * feeback("This is created using FeignClient").build(); ResponseEntity<Rating>
	 * createRating = ratingService.createRating(rating);
	 * System.out.println("rating feign :"+createRating); }
	 */

}

package com.user.service.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.service.client.HotelService;
import com.user.service.entities.Hotel;
import com.user.service.entities.Rating;
import com.user.service.entities.User;
import com.user.service.exceptions.ResourceNotFoundException;
import com.user.service.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	HotelService userClient;	

	@Override
	public User saveUser(User user) {
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		return userRepository.save(user);

	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> users = userRepository.findAll();
		for (User user : users) {
			 Rating[] ratingsOfUser = restTemplate
					.getForObject("http://localhost:8083/ratings/users/" + user.getUserId(), Rating[].class);
			 
			   List<Rating> listratings = Arrays.stream(ratingsOfUser).toList();
			
		 List ratings=listratings.stream().map(rating->{
				/*
				 * ResponseEntity<Hotel> forEntity
				 * =restTemplate.getForEntity("http://localhost:8082/hotels/"+rating.getHotelId(
				 * ), Hotel.class); Hotel body = forEntity.getBody();
				 */
			 //FeignClient
			 Hotel hotel = userClient.getHotel(rating.getHotelId());
			   rating.setHotel(hotel);
			   return rating;
				}).collect(Collectors.toList());
				
			user.setRatings(ratings);
		}
		return users;
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
	User user= userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("Uesr with id not found in server !!"+userId));
	 Rating[] ratings = restTemplate.getForObject("http://localhost:8083/ratings/users/"+user.getUserId(), Rating[].class);
		
	        List<Rating> list = Arrays.stream(ratings).toList();
	      //  System.out.println( userClient.getHotel()+ " list");
		
		  List<Rating> ratingList= list.stream().map(rating -> {
		  //ResponseEntity<Hotel> forEntity =restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"+rating.getHotelId(), Hotel.class); 
		  //ResponseEntity<Hotel> forEntity =restTemplate.getForEntity("http://localhost:8082/hotels/"+rating.getHotelId(), Hotel.class);
			Hotel hotel = userClient.getHotel(rating.getHotelId());
		//  Hotel body = forEntity.getBody();
		 // Hotel body=hotel.getBody();
		  rating.setHotel(hotel); 
		  return rating; 
		  }).collect(Collectors.toList());
		 
	    
	   user.setRatings(ratingList);
	  return user;
	}

}

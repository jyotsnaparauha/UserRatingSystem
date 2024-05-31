package com.hotel.service;

import java.util.List;

import com.hotel.entites.Hotel;

public interface HotelService {
	public Hotel create(Hotel hotel);
	
	 public Hotel get(String id);
	public List<Hotel> getAll();

}

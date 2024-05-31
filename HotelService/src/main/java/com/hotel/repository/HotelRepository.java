package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entites.Hotel;

public interface HotelRepository  extends JpaRepository<Hotel, String>{

}

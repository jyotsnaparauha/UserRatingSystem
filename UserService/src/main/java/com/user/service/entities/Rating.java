package com.user.service.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {

	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feeback;
	private Hotel hotel;
}

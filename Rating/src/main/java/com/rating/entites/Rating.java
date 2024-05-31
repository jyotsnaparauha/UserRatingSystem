package com.rating.entites;
 import jakarta.persistence.*;
/*import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@jakarta.persistence.Entity
@Table(name = "ratings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

	@Id
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feeback;
	
}

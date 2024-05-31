package com.user.service.entities;

import java.util.ArrayList;
import java.util.List;

/*mport javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;*/
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@jakarta.persistence.Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	@Id
	@Column(name = "ID")
  private String userId;
	
	@Column(name = "NAME")
  private String name;
	
	@Column(name = "EMAIL")
  private String email;
	
	@Column(name = "ABOUT")
   private String about;
	
   @Transient
   private List<Rating> ratings=new ArrayList<>();	
}
  

package com.sample_projects.ecom.entities;

import enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Role")
	private UserRole role;
	
	@Lob
	@Column(name = "Image", columnDefinition = "LONGBLOB")
	private byte[] img;

}

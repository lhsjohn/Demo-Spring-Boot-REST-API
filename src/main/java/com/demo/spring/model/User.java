package com.demo.spring.model;
// Generated May 28, 2015 9:05:46 AM by Hibernate Tools 3.1.0.beta4

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * WpUsers generated by hbm2java
 */

@Entity
@Table(name="user")
public class User {


    // Fields    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

	@Column(name = "user_email", nullable = false)
    private String userEmail;
    
    @Column(name = "user_pass", nullable = false)
     private String userPass;
    
    @Column(name = "FIRST_name", nullable = false)
     private String firstName;
     
    @Column(name = "LAST_name", nullable = false)
     private String LastName;
    
    @Column(name = "region", nullable = false)
    private String region;
    
    @Column(name = "country", nullable = false)
    private String country;
    
    
    
    
    
	public User() {
	}



   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }


    public String getUserPass() {
        return this.userPass;
    }
    
    public void setUserPass(String userPass) {
    	
		//PasswordEncoder crypto = new BCryptPasswordEncoder(); 
		//this.userPass = crypto.encode(userPass); 
    	this.userPass = userPass;
    }


    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return LastName;
	}




	public void setLastName(String lastName) {
		LastName = lastName;
	}




	public String getRegion() {
		return region;
	}




	public void setRegion(String region) {
		this.region = region;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result
				+ ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result
				+ ((userPass == null) ? 0 : userPass.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userPass == null) {
			if (other.userPass != null)
				return false;
		} else if (!userPass.equals(other.userPass))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", userEmail=" + userEmail + ", userPass="
				+ userPass + ", firstName=" + firstName + ", LastName="
				+ LastName + ", region=" + region + ", country=" + country
				+ "]";
	}




}
package com.arjun.videocall.user;

//import lombok.Builder;
import lombok.Data;

@Data
public class User {
	
	private String username;
	private String email;
	private String password;
	private String status;
	
	
	 public User(String username, String email, String password) {
	        this.username = username;
	        this.email = email;
	        this.password = password;
	    }

	    // Static factory method
	    public static User createUser(String username, String email, String password) {
	        return new User(username, email, password);
	    }

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	
	
	
//	public static Object builder() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	
	

	
	
	
	
	

}

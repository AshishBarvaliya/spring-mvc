package com.lambton.project;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Name cannot be blank")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 10, message = "Message must be at least 10 characters")
    private String message;
    
    public Contact() {
    }
    
    public Contact(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }
    
    public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getMessage() {
		return message;
	}

	public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

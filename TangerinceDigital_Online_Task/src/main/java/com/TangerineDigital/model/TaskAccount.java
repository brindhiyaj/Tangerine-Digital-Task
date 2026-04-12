package com.TangerineDigital.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class TaskAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int value;
  
    public TaskAccount() {}

    public TaskAccount(int value) {
        this.value = value;
        
    }
    
    // getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

    
   
}
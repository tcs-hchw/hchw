package com.hchw.management.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String status; // Ongoing, Upcoming, Completed
    private LocalDate startDate;
    private LocalDate endDate;
    private Double currentFunding;
    private Double requiredFunding;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Double getCurrentFunding() {
		return currentFunding;
	}
	public void setCurrentFunding(Double currentFunding) {
		this.currentFunding = currentFunding;
	}
	public Double getRequiredFunding() {
		return requiredFunding;
	}
	public void setRequiredFunding(Double requiredFunding) {
		this.requiredFunding = requiredFunding;
	}

    // Getters and setters...
    
    
}

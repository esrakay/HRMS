package com.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
@Entity 
public class Employer {

	@Id
	@Column(name = "id")
	private int id; 
	
	@Column(name = "company_name")
	private String companyName; 
	
	@Column(name = "web_address")
	private String webAddress; 
	
	@Column(name = "phone_number")
	private String phoneNumber; 
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "id")
	private User user; 
}

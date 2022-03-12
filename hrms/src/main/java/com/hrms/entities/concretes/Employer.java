package com.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hrms.core.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Table(name = "employers")
@Entity 
public class Employer extends User{

	
	@Column(name = "company_name")
	private String companyName; 
	
	@Column(name = "web_address")
	private String webAddress; 
	
	@Column(name = "phone_number")
	private String phoneNumber; 
	
	/*@OneToOne
	@MapsId
	@JoinColumn(name = "id")
	private User user; */
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer")
	private List<VerificationCodeEmployer> verificationCodeEmployer; 
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer")
	private List<EmployeeConfirmEmployer> employeeConfirmEmployer;
}

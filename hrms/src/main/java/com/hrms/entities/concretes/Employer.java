package com.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.hrms.core.entities.User;

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
	
	/*@OneToMany(mappedBy = "employer")
	private List<VerificationCodeEmployer> verificationCodeEmployer; 
	
	@OneToMany(mappedBy = "employer")
	private List<EmployeeConfirmEmployer> employeeConfirmEmployer; */
}

package com.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "verification_code_employers")
@Entity
public class VerificationCodeEmployer {
	
	@Id
	@Column(name = "id")
	private int id;
	
	/*@Column(name = "employer_id")
	private int employerId; */
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "id")
	private VerificationCode verificationCode; 
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer; 
	
}

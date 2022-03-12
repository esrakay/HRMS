package com.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "verification_code")
@Entity
public class VerificationCode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id; 
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "is_verified")
	private boolean isVerified;
	
	@Column(name = "verified_date")
	private Date verifiedDate; 
	
	/*@OneToOne(mappedBy = "verificationCode", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private VerificationCodeCandidate verificationCodeCandidate; 
	
	@OneToOne(mappedBy = "verificationCode", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private VerificationCodeEmployer verificationCodeEmployer; */
}

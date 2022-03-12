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
@Table(name = "verification_code_candidates")
@Entity
public class VerificationCodeCandidate {
	
	@Id
	@Column(name = "id")
	private int id;
	
	/*@Column(name = "candidate_id")
	private int candidateId;*/
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "id")
	private VerificationCode verificationCode;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate; 
}

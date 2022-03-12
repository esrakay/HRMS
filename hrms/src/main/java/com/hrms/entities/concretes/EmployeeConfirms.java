package com.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_confirms")
@Entity
public class EmployeeConfirms {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	/*@Column(name = "employee_id")
	private int employeeId; */
	
	@Column(name = "is_confirmed")
	private boolean isConfirmed;
	
	@Column(name = "confirm_date")
	private Date confirmDate;
	
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	/*@OneToOne(mappedBy = "employeeConfirms", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private EmployeeConfirmEmployer employeeConfirmEmployer; */
}

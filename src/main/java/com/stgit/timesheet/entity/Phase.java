package com.stgit.timesheet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Phase")
public class Phase {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer phaseId;
	
	private String phaseName;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;

}

package com.sgic.defecttracker.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "defects")
public class Defect implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String defect_id;
	
	private String module;
    
	@Column(columnDefinition = "text")
	private String description;

	private String stepstorecreate;
	private String severity;
	private String priority;
	private String defecttype;
	private String status;
	private String comments;
	private String availablein;
	private String enteredby;
	private String assignedto;
	private String fixedby;
	
	//dates
	 @JsonFormat(pattern="yyyy-MM-dd")
     private Date entereddate;
	 
	 @JsonFormat(pattern="yyyy-MM-dd")
     private Date fixeddate;
	
	
	public String getAvailablein() {
		return availablein;
	}
	public void setAvailablein(String availablein) {
		this.availablein = availablein;
	}
	public String getEnteredby() {
		return enteredby;
	}
	public void setEnteredby(String enteredby) {
		this.enteredby = enteredby;
	}
	public String getAssignedto() {
		return assignedto;
	}
	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}
	public String getFixedby() {
		return fixedby;
	}
	public void setFixedby(String fixedby) {
		this.fixedby = fixedby;
	}
	public Date getEntereddate() {
		return entereddate;
	}
	public void setEntereddate(Date entereddate) {
		this.entereddate = entereddate;
	}
	public Date getFixeddate() {
		return fixeddate;
	}
	public void setFixeddate(Date fixeddate) {
		this.fixeddate = fixeddate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getDefectType() {
		return defecttype;
	}
	public void setDefectType(String defectType) {
		this.defecttype = defectType;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getDefect_id() {
		return defect_id;
	}
	public void setDefect_id(String defect_id) {
		this.defect_id = defect_id;
	}
	public String getStepstorecreate() {
		return stepstorecreate;
	}
	public void setStepstorecreate(String stepstorecreate) {
		this.stepstorecreate = stepstorecreate;
	}
	
	

}

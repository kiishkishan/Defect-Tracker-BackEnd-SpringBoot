package com.sgic.defecttracker.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
@Table(name = "developer")
public class Developer {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long developerId;
	private String name;

	 @ManyToOne
		@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
		@JoinColumn(name="moduleId", nullable=false)
		private Module module;

	public long getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(long developerId) {
		this.developerId = developerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}


	 
	
	

}

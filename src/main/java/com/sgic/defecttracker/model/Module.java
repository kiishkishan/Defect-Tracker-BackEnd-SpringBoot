package com.sgic.defecttracker.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "module")
public class Module {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long moduleId;
	    
	    private String name;
	    
	    @ManyToOne
	    @JoinColumn(name="project_id", nullable=false)
		private Project project;

	    @OneToOne
		@JoinColumn(name="user_id", nullable=false)
	    private User user;

		

		public Long getModuleId() {
			return moduleId;
		}

		public void setModuleId(Long moduleId) {
			this.moduleId = moduleId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Project getProject() {
			return project;
		}

		public void setProject(Project project) {
			this.project = project;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		

	

	    
	    
	

    
	    
	    
	    
	    
	

}

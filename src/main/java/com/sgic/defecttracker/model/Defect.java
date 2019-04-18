package com.sgic.defecttracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "defect")
public class Defect {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(columnDefinition = "text")
	    private String name;
	    
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "project_id", nullable = false)
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    @JsonIgnore
	    private Project project;
	    
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "module_id", nullable = false)
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    @JsonIgnore
	    private Module module;
	    
	    
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "user_id", nullable = false)
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    @JsonIgnore
	    private User user;


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
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


		public Module getModule() {
			return module;
		}


		public void setModule(Module module) {
			this.module = module;
		}


		public User getUser() {
			return user;
		}


		public void setUser(User user) {
			this.user = user;
		}
	    
	    
	    
	    

}

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
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "module")
public class Module {
	    @Id
	    private Long id;
	    
	    @Column(columnDefinition = "text")
	    private String name;
	    
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "project_id", nullable = false)
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    private Project project;

	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "developer_id", nullable = false)
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    private Developer developer;

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

		public Developer getDeveloper() {
			return developer;
		}

		public void setDeveloper(Developer developer) {
			this.developer = developer;
		}

	    
	    
	

    
	    
	    
	    
	    
	

}

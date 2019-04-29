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

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "module")
public class Module {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long moduleId;
	    
	    @Column(columnDefinition = "text")
	    private String name;
	    
	    @ManyToOne
		@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
		@JoinColumn(name="id", nullable=false)
		private Project project;

	    @OneToMany(mappedBy="module",cascade = {CascadeType.ALL})
	    private List<Developer> developer;

		

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

		public List<Developer> getDeveloper() {
			return developer;
		}

		public void setDeveloper(List<Developer> developer) {
			this.developer = developer;
		}


	    
	    
	

    
	    
	    
	    
	    
	

}

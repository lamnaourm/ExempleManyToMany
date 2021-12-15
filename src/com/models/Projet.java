package com.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_project")
public class Projet {

	@Id
	@GeneratedValue
	@Column(name="id_proj")
	private int id;
	
	@Column
	private String description;
	
	@Column
	private int duree;
	
	@ManyToMany
	@JoinTable(name="emp_proj", 
		joinColumns=@JoinColumn(name="id_proj"),
		inverseJoinColumns=@JoinColumn(name="id_emp")
		)
	private List<Employe> employes;
	
	public Projet() {
	
	}
		
	public Projet(int id, String description, int duree) {
		super();
		this.id = id;
		this.description = description;
		this.duree = duree;
	}
	
	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "Projet [id=" + id + ", description=" + description + ", duree=" + duree + "]";
	}

}

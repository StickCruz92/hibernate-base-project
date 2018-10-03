package com.profesores.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="medio_social")
public class MedioSocial implements Serializable  {
	
	@Id
	@Column(name="id_medio_social")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMedioSocial;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="icono")
	private String icono;
	
	@OneToMany
	@JoinColumn(name="id_medio_social")
	private Set<ProfesorMedioSocial> profesorMedioSociales;
	
	public MedioSocial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedioSocial(String nombre, String icono) {
		super();
		this.nombre = nombre;
		this.icono = icono;
	}
	
	public Long getIdMedioSocial() {
		return idMedioSocial;
	}
	
	public void setIdMedioSocial(Long idMedioSocial) {
		this.idMedioSocial = idMedioSocial;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getIcono() {
		return icono;
	}
	
	public void setIcono(String icono) {
		this.icono = icono;
	}

	public Set<ProfesorMedioSocial> getProfesorMedioSociales() {
		return profesorMedioSociales;
	}

	public void setProfesorMedioSociales(Set<ProfesorMedioSocial> profesorMedioSociales) {
		this.profesorMedioSociales = profesorMedioSociales;
	}
	
}

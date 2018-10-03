package com.profesores.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="profesor_medio_social")
public class ProfesorMedioSocial implements Serializable{

	@Id
	@Column(name="id_profesor_medio_social")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProfesorMedioSocial;
		
	@Column(name="nickname")
	private String nickName;
		
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_profesor")
	private Profesor profesor;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_medio_social")
	private MedioSocial medioSocial;
	

	
	
	public ProfesorMedioSocial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfesorMedioSocial(Profesor profesor, MedioSocial medioSocial, String nickName) {
		super();
		this.profesor = profesor;
		this.medioSocial = medioSocial;
		this.nickName = nickName;
	}
	
	public Long getIdProfesorMedioSocial() {
		return idProfesorMedioSocial;
	}
	public void setIdProfesorMedioSocial(Long idProfesorMedioSocial) {
		this.idProfesorMedioSocial = idProfesorMedioSocial;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public MedioSocial getMedioSocial() {
		return medioSocial;
	}
	public void setMedioSocial(MedioSocial medioSocial) {
		this.medioSocial = medioSocial;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
}

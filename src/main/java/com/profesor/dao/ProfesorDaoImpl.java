package com.profesor.dao;

import java.util.List;

import org.hibernate.cfg.SecondaryTableSecondPass;

import com.profesores.model.Profesor;

public class ProfesorDaoImpl extends SessionProyecto implements ProfesorDao {

	
private SessionProyecto sessionProyecto;	
	
	public ProfesorDaoImpl() {
		sessionProyecto = new SessionProyecto();
	}

	public void saveProfesor(Profesor profesor) {
		sessionProyecto.getSession().persist(profesor);
		sessionProyecto.getSession().getTransaction().commit();
		
	}

	public void deleteProfesorById(Long idProfesor) {

		
	}

	public void updateProfesor(Profesor profesor) {
		sessionProyecto.getSession().update(profesor);
		sessionProyecto.getSession().getTransaction().commit();
	}

	public Profesor findProfesorById(Long idProfesor) {
		return null;
	}

	public Profesor findProfesorByNOmbre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Profesor> findAllProfesor() {
		return sessionProyecto.getSession().createQuery("from Profesor").list();
	}

}

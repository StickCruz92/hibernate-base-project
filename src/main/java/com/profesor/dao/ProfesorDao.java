package com.profesor.dao;

import java.util.List;

import com.profesores.model.Profesor;

public interface ProfesorDao {
	
	void saveProfesor(Profesor profesor);
	void deleteProfesorById(Long idProfesor);
	void updateProfesor(Profesor profesor);
	Profesor findProfesorById(Long idProfesor);
	Profesor findProfesorByNOmbre(String nombre);
    List<Profesor> findAllProfesor();

}

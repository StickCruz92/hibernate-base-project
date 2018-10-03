package com.profesores.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.profesor.dao.ProfesorDaoImpl;
import com.profesores.model.Curso;
import com.profesores.model.Profesor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /*
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Profesor profesor = new Profesor("Stick Cruz", "Avatar1");
        /*Curso curso = new Curso("Java basico", "tema 1", "Introducción");
        session.beginTransaction();
        session.save(profesor);
        session.getTransaction().commit();*/
        
        //Profesor profesor = new Profesor("Mario", "Avatar1");
        ProfesorDaoImpl profesorDaoImpl = new ProfesorDaoImpl();
        //profesorDaoImpl.saveProfesor(profesor);
        
        List<Profesor> profesores = profesorDaoImpl.findAllProfesor();
        
        for (Profesor pro : profesores) {
			System.out.println("Nombre: "+ pro.getNombre());
		}
        

        
        
    }
}

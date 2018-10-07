package com.profesor.dao;

import java.util.List;

import com.profesores.model.CategoriaProducto;


public class CatalogoProductoDaoImpl extends SessionProyecto implements CategoriaProductoDao{

	private SessionProyecto sessionProyecto;	
	
	public CatalogoProductoDaoImpl() {
		sessionProyecto = new SessionProyecto();
	}
	
	public void saveCategoriaProducto(CategoriaProducto categoriaProducto) {
		// TODO Auto-generated method stub
		sessionProyecto.getSession().persist(categoriaProducto);
		sessionProyecto.getSession().getTransaction().commit();
		
	}

	public void deleteCategoriaProductoById(Long idCategoriaProducto) {
		// TODO Auto-generated method stub
		
	}

	public void updateCategoriaProducto(com.profesores.model.CategoriaProducto categoriaProducto) {
		// TODO Auto-generated method stub
		
	}

	public List<com.profesores.model.CategoriaProducto> findAllCategoriaProductos() {
		// TODO Auto-generated method stub
		return  sessionProyecto.getSession().createQuery("from CategoriaProducto").list();
	}

	public com.profesores.model.CategoriaProducto findById(Long idCategoriaProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	public com.profesores.model.CategoriaProducto findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

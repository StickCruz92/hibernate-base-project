package com.profesor.dao;

import java.util.List;

import com.profesores.model.CategoriaProducto;


public interface CategoriaProductoDao {
	
	void saveCategoriaProducto(CategoriaProducto categoriaProducto);
	
	void deleteCategoriaProductoById(Long idCategoriaProducto);
	
	void updateCategoriaProducto(CategoriaProducto categoriaProducto);
	
	List<CategoriaProducto> findAllCategoriaProductos();
	
	CategoriaProducto findById(Long idCategoriaProducto);
	
	CategoriaProducto findByName(String name);
	
}

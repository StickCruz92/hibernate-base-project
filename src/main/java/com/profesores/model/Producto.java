package com.profesores.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="producto")

public class Producto implements Serializable{

	@Id
	@Column(name="id_producto")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="estado")
	private int estado;
	
	/*
	@OneToMany(mappedBy="producto", cascade =CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Venta> venta = new ArrayList<Venta>();
	
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}
	
	public List<Venta> getVenta() {
		return venta;
	}
	*/

	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_categoria_producto")
	private CategoriaProducto categoriaProducto;
	
	/*
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_detalle_producto")
	@JsonIgnore
	private DetalleProducto detalleProducto;
	*/
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Producto(String nombre, int estado) {
		super();
		this.nombre = nombre;
		this.estado = estado;
	}


	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	/*
	public CategoriaProducto getCategoriaProducto() {
		return categoriaProducto;
	}
	public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}
	public DetalleProducto getDetalleProducto() {
		return detalleProducto;
	}
	public void setDetalleProducto(DetalleProducto detalleProducto) {
		this.detalleProducto = detalleProducto;
	}
	*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}

package com.profesores.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//import com.fasterxml.jackson.annotation.JsonIgnore;

public class Venta implements Serializable{

	@Id
	@Column(name="id_venta")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVenta;
	
	@Column(name="nombre_columna")
	private String NombreUsuario;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name ="precio")
	private double precio;
	
	@Column(name ="estado")
	private int estado;	
	
	/*
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="id_producto")
	@JsonIgnore
	private Producto producto;
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	*/
	
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(Long idVenta, String nombreUsuario, Date fecha, int cantidad, double precio, int estado) {
		super();
		this.idVenta = idVenta;
		NombreUsuario = nombreUsuario;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.precio = precio;
		this.estado = estado;
	}

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

    
	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}

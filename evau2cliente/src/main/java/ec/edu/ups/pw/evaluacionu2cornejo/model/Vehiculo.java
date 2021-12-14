package ec.edu.ups.pw.evaluacionu2cornejo.model;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int codigo;
	
	private String marca;
	
	private String modelo;
	
	private String color;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}

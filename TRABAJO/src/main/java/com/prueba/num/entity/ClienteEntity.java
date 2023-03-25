package com.prueba.num.entity;

public class ClienteEntity {
	
	private long cod;
	private String nom,ape,dni,telefono,numH;
	private int dia;
	
	public ClienteEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteEntity(String nom, String ape, String dni, String telefono, String numH, int dia) {
		super();
		this.cod = (int)(Math.random()*(999999-100000+1)+100000);
		this.nom = nom;
		this.ape = ape;
		this.dni = dni;
		this.telefono = telefono;
		this.numH = numH;
		this.dia = dia;
	}

	public long getCod() {
		return cod;
	}

	public void setCod(long cod) {
		this.cod = cod;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNumH() {
		return numH;
	}

	public void setNumH(String numH) {
		this.numH = numH;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
}

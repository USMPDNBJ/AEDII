package com.prueba.num.entity;

public class PersonEntity {
	
	private long cod;
	private String cor,nom,ape,dni,tel,con,fec;	
	
	public PersonEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonEntity(long cod, String cor, String nom, String ape, String dni, String tel, String fec,String con) {
		super();
		this.cod = cod;
		this.cor = cor;
		this.nom = nom;
		this.ape = ape;
		this.dni = dni;
		this.tel = tel;
		this.fec = fec;
		this.con=con;
	}
	public long getCod() {
		return cod;
	}
	public void setCod(long cod) {
		this.cod = cod;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFec() {
		return fec;
	}
	public void setFec(String fec) {
		this.fec = fec;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}

	
}

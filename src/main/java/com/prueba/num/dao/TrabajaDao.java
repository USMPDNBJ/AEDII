package com.prueba.num.dao;

import java.util.ArrayList;

import com.prueba.num.entity.ClienteEntity;

public class TrabajaDao {
	
	
	ArrayList<ClienteEntity> listCli=new ArrayList<>();
	private int indTra=0;
	
	public void registrar(ClienteEntity cli) {
		listCli.add(cli);
		cli.setCod(100000+indTra);
		indTra++;
	}
	
	public ArrayList<ClienteEntity> getList(){
		return listCli;
	}
		

}

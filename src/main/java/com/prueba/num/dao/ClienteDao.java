package com.prueba.num.dao;

import java.util.ArrayList;

import com.prueba.num.entity.ClienteEntity;

public class ClienteDao {
	
	ArrayList<ClienteEntity> listCli=new ArrayList<>();
	private int indPer=0;
	
	public void registrar(ClienteEntity cli) {
		cli.setCod(100000+indPer);
		indPer++;
		listCli.add(cli);		
	}
	
	public ArrayList<ClienteEntity> getList(){
		return listCli;
	}
		
}

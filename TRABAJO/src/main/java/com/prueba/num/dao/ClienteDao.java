package com.prueba.num.dao;

import java.util.ArrayList;

import com.prueba.num.entity.ClienteEntity;

public class ClienteDao {
	
	ArrayList<ClienteEntity> listCli=new ArrayList<>();
	
	public void registrar(ClienteEntity cli) {
		listCli.add(cli);	
	}
	
	public ArrayList<ClienteEntity> getList(){
		return listCli;
	}
}

package com.prueba.num.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.prueba.num.dao.ClienteDao;
import com.prueba.num.entity.ClienteEntity;

@Controller
public class ClienteController {
	
	ClienteDao objDao=new ClienteDao();
	
	@GetMapping("/")
	public String index(Model model) {
		return "Index";
	}
	
	@PostMapping("/Login")
	public String login() {
		return "Login";
	}
	
	@PostMapping("/Registro")
	public String registro(@Validated ClienteEntity cliente) {
		
		if(cliente!=null) {
			objDao.registrar(cliente);
		}
		return "Registro";
	}
	
	@GetMapping("/Lista")
	public String lista(Model model) {
		
		ArrayList<ClienteEntity> listC=new ArrayList<>();
		listC=objDao.getList();
		model.addAttribute("listC", listC);
		return "Lista";
	}
	
	
}

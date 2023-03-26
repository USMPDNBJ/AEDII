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
	
	@GetMapping("/LoginCli")
	public String loginCli() {
		return "LoginCli";
	}
	
	@GetMapping("/LoginTra")
	public String loginTra() {
		return "LoginTra";
	}
	
	@GetMapping("/IndexCli")
	public String IndexCli() {
		return "IndexCli";
	}
	
	@GetMapping("/IndexTra")
	public String IndexTra() {
		return "IndexTra";
	}
	
	@GetMapping("/Registro")
	public String registro(){
		return "Registro";
	}
	
	@PostMapping("/RegistroP")
	public String registroP(@Validated ClienteEntity cliente) {
				
		objDao.registrar(cliente);		
		return "Registro";
	}
	
	@GetMapping("/Login1")
	public String Login1(Model model) {
		return "Login1";
	}
	
	@GetMapping("/Lista")
	public String lista(Model model) {
		
		ArrayList<ClienteEntity> listC=new ArrayList<>();
		listC=objDao.getList();
		model.addAttribute("listC", listC);
		return "Lista";
	}
	
	
}

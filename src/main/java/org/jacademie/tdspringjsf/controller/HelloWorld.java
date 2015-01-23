package org.jacademie.tdspringjsf.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.jacademie.tdspringjsf.domain.Equipe;
import org.jacademie.tdspringjsf.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("helloWorld")
@Scope("request")
public class HelloWorld implements Serializable{
	
	@Autowired
	private EquipeService equipeService;
	
	
	public HelloWorld() {	
	}
	
	public EquipeService getEquipeService() {
		return equipeService;
	}

	public void setEquipeService(EquipeService equipeService) {
		this.equipeService = equipeService;
	}
	
	public Equipe getEquipe() {
		
		return this.equipeService.findEquipe(1);
	}
	
	

}

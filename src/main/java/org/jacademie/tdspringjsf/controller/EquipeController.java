package org.jacademie.tdspringjsf.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.jacademie.tdspringjsf.domain.Equipe;
import org.jacademie.tdspringjsf.service.EquipeService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

@ManagedBean
@RequestScoped
public class EquipeController {

	private Integer equipeId;
	
	private Equipe equipe;
	
	
	public EquipeController() {
		super();
	}
		
	public void findEquipe() {
		
		// recuperation contexte spring
		ApplicationContext ctx = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
		
		// recuperation bean service dans le contexte spring
		EquipeService equipeService = ctx.getBean("equipeService", EquipeService.class);
		
		// appel d'une methode sur mon service
		this.equipe = equipeService.findEquipe(this.equipeId);		
	}

	
	public Integer getEquipeId() {
		return equipeId;
	}

	public void setEquipeId(Integer equipeId) {
		this.equipeId = equipeId;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	
	
}

package org.jacademie.tdspringjsf.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.jacademie.tdspringjsf.domain.Equipe;
import org.springframework.stereotype.Service;

@Service(value="equipeService")
public class EquipeServiceImpl implements EquipeService{

	private Map<Integer, Equipe> equipes;
	
	@PostConstruct
	public void init() {
		
		this.equipes = new HashMap<Integer, Equipe>();
		
		this.equipes.put(1, new Equipe("Saint-Etienne", "Vert/Blanc"));
		this.equipes.put(2, new Equipe("Lyon", "Bleu/Blanc/Rouge"));
		this.equipes.put(3, new Equipe("Marseille", "Bleu/Blanc"));
	}
	
	public Equipe findEquipe(Integer id) {
		
		Equipe result = null;
		
		if (id == null) {
			
			result = new Equipe("Unknown", "-");
		}
		else {		
			result = this.equipes.get(id);
			
			if (result == null) {
				
				result = new Equipe("Unknown", "-");
			}
		}
		
		return result;
	}

}

package org.jacademie.tdspringjsf.domain;

public class Equipe {

	private String name;
	private String colors;
	
	
	public Equipe() {
		
	}

	
	
	public Equipe(String name, String colors) {
		super();
		this.name = name;
		this.colors = colors;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColors() {
		return colors;
	}


	public void setColors(String colors) {
		this.colors = colors;
	}
	
}

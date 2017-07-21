package com.Main;

public abstract class Item {
	public Item (String n){
		this.nome=n;
	}
	
	public String getName(){
		return this.nome;
		
	}
	private String nome;
}

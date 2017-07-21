package com.Main;

import java.util.ArrayList;

/**
 * Created by filipebraida on 31/05/16.
 */
public class Player extends Character implements IInventory{
	private ArrayList<Item> inventario;
    public Player(int life, int attack) {
        super(life, attack);
        inventario=new ArrayList<Item>();
    }

	@Override
	public ArrayList<Item> getInventory() {
		return inventario;
	}

	@Override
	public void AddItem(Item i) {
		inventario.add(i);
	}

	@Override
	public Item getItem(int id) {
		Item i = inventario.get(id);
		return i;
	}
}

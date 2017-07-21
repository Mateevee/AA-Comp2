package com.Main;

import java.util.ArrayList;

public interface IInventory 
{
	public ArrayList<Item> getInventory();
	public void AddItem(Item i);
	public Item getItem(int id);
	
}

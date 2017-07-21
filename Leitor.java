package com.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Leitor 
{
	private Path path;
	private ArrayList<Instrucao>result; 
	public Leitor(String p)
	{
		path=Paths.get(p);
	}
	public ArrayList<Instrucao> Restultados()
	{
		return result;
	}
	public String readNext()
	{
		Path file = this.path;
		result=new ArrayList<Instrucao>();
		try (InputStream in = Files.newInputStream(file);
		    BufferedReader reader =
		      new BufferedReader(new InputStreamReader(in))) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		       result.add(new Instrucao(line));
		    }
		    
		} catch (IOException x) {
		    System.err.println(x);
		}
		return "";
	}
}

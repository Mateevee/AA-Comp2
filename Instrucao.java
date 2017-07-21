package com.Main;

public class Instrucao 
{
	public Instrucao(String s)
	{
		this.s=s;
		this.inst=Integer.parseInt(s.substring(0,1));
		link=0;
		if(inst!=9)
		{
			this.id=Integer.parseInt(s.substring(2,s.indexOf("#")));
			this.desc=s.substring(s.indexOf("#")+2);
		}
		if(inst==2)
		{
			this.link=Integer.parseInt(s.substring(s.indexOf("#")+2,s.indexOf("$")));
			this.desc=s.substring(s.indexOf("$")+2);
		}
		if(inst==3)
		{
			this.link=Integer.parseInt(s.substring(s.indexOf("#")+2,s.indexOf("$")));
			this.linkOut =Integer.parseInt(s.substring(s.indexOf("$")+2));
		}
		if(inst==4)
		{
			this.link=Integer.parseInt(s.substring(s.indexOf("#")+2,s.indexOf("$")));
			this.linkOut =Integer.parseInt(s.substring(s.indexOf("$")+2));
		}
	}
	public String s;
	public int inst;
	public int id;
	public int link;
	public int linkOut;
	public String desc;
}

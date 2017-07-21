
package com.Main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by filipebraida on 31/05/16.
 */
public class Engine {
    public static void main(String[] args) throws IOException {
        Book book = Engine.createBook();

        System.out.println(book.showHistoryBook());

        Scanner in = new Scanner(System.in);

        do {
            System.out.println(book.showHistory());

            System.out.println("Escolha:  ");

            for(Choice choice:book.nextEvents()) {
                System.out.println(choice.getDescription());
            }

            int i;
            do {
                i = in.nextInt();
            } while(!book.nextEvent(i));
        } while(!book.isTheEnd());

        System.out.println(book.showHistory());
        in.close();
       }
    //1 evento contem n escolhas e uma escolha contem um evento = 1 evento resulta em n eventos baseados na escolha
    public static Book createBook() {
    	Leitor l =new Leitor("C:\\Users\\matee_000\\Desktop\\link.txt");				
    	l.readNext();
        ArrayList<Instrucao>historia = l.Restultados();
        ArrayList<Object>objetos = new ArrayList<Object>();
        objetos.add(historia.get(0).desc);
        int i =1;
        while(historia.get(i).inst!= 9)
        {
        	Instrucao inst = historia.get(i);
        	switch (inst.inst) {
			case 1:
				Event ev = new BlankEvent(inst.desc, new ArrayList<Choice>());
				objetos.add(inst.id, ev);;
				break;
			case 2:
				
				Event e =inst.link==0?null:(Event) objetos.get(inst.link);
				Choice choice = new BlankChoice(inst.desc,e);
				objetos.add(inst.id,choice);
					
				break;
			case 3:
				((Event) objetos.get(inst.link)).addChoice((Choice)objetos.get(inst.linkOut));
				break;
			case 4:
				((Choice) objetos.get(inst.link)).setEvent((Event) objetos.get(inst.linkOut));
				break;

			default:
				break;
			}
        	i++;
        }
        
    	Book livro = new Book(historia.get(0).desc,((Event) objetos.get(1)), new Player(10, 10));
        return livro;
    }
}

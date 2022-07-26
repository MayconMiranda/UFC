package com.maycon.projeto.teste;

import com.maycon.projeto.Vetor;

public class aula02 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);
		
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

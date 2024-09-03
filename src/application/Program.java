package application;

import java.util.Scanner;
// Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar 
//a quantidade de vezes em que ela ocorre.
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = sc.nextLine();
		int quant = Verificar(frase);
		if(quant == 0) {
			System.out.println("Não há o caracter A na frase");
		}
		else {
			System.out.println("Há "+quant+" caracteres A na frase");
		}
		
		sc.close();
	}
	
	public static int Verificar(String frase) {
		int quantidade = 0;
		for(int i=0; i<frase.length();i++) {
			char caractere = Character.toLowerCase(frase.charAt(i));
			if(caractere== 'a' || caractere== 'A' ) {
				quantidade++;
			}
		}
		return quantidade;
	}

}

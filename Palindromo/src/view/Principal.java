package view;

import controller.PalindromoController;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		PalindromoController pc = new PalindromoController();
		String txt;

		System.out.print("Digite um texto: ");
		txt = s.nextLine();
		s.close();
		String inverso = pc.invertePalavra(txt);
		System.out.println("Inverso: " + inverso);
		System.out.println("É palíndromo: " + pc.comparaPalavras(txt, inverso));
	}	
}
package controller;

import lib.model.PilhaString;

public class PalindromoController
{
	public PalindromoController()
	{
		super();
	}

	public String invertePalavra(String palavra)
	{
		PilhaString ps = new PilhaString();
		String inverso = "";
		int tam = palavra.length();

		for (int i = 0; i < tam; i++) {
			ps.push(palavra.substring(i, i + 1));
		}
		while (true) {
			try {
				inverso += ps.pop();
			} catch (Exception e) {
				break;
			}
		}
		return inverso;
	}

	public boolean comparaPalavras(String palavra, String inverso)
	{
		return palavra.equals(inverso);
	}
}
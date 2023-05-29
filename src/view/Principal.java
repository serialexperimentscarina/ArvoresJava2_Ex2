package view;

import br.com.serialexperimentscarina.arvoreint.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {12, 4, 16, 2, 8, 6};
		ArvoreInt arvore = new ArvoreInt();
		
		for (int valor : vetor) {
			arvore.insert(valor);
		}
		
		try {
			arvore.search(6);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

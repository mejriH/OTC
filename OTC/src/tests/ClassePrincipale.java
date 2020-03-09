package tests;

import java.util.List;

import entities.Constantes;

public class ClassePrincipale {

	public static void main(String[] args) {
		Constantes cs = new Constantes();
		cs.init();
		
		List<String> listeNoms = cs.getListeEtds();
		
		listeNoms.sort(null);
		
		for(String str : listeNoms){
			System.out.println(str);
		}

	}

}

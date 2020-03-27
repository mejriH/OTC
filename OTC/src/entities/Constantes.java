package entities;

import java.util.ArrayList;
import java.util.List;

public class Constantes {
	
	/*
	 * Pour ajouter un NOM il suffit d'ajouter une ligne dans la méthode init :
	 * listeEtds.add("NOM Prenom");
	 */
	
	public static List<String> listeEtds = new ArrayList<String>();
	
	public void init(){
		listeEtds.add("MEJRI Houssem");
		listeEtds.add("NOM Prenom STD");
								
	}

	public List<String> getListeEtds() {
		return listeEtds;
	}

	
	
	

}

package Partie3;

import java.util.Scanner;

public class Listeproduit {
	Produit produit;
	Listeproduit suivant;

	public Listeproduit(Produit p, Listeproduit suiv) {
		produit=p;
		suivant=suiv;
	}
public 	 static Listeproduit ajouterProduit(Listeproduit nouvelle, Listeproduit tete)
		{
		 Listeproduit tempo=tete;
		 if(tete==null){
			tete= nouvelle;
			return tete;
		 }
			while(tempo.suivant!=null){
				tempo=tempo.suivant;
			}
			tempo.suivant=nouvelle;
			//tete=tempo;
			return tete;
		}
	public static Listeproduit ajouterDebut(Listeproduit nouvelle, Listeproduit tete)
	{
		if(tete==null){
			tete=nouvelle;
			return tete;
		}
		nouvelle.suivant=tete;
		tete=nouvelle;
//		System.out.println("ajout ");
		return tete;
		 
	}

	public	static void affichage(Listeproduit lp) {
	
		Listeproduit temp = lp;
		
		while(temp != null) {
			System.out.println("\n identifiant : " +temp.produit.getIdentifiant()+" libelle : " +temp.produit.getLibelle()+" quantite : " +temp.produit.getQuantite()+ " prix : "+temp.produit.getPrix()+"type:"+temp.produit.getType()+"saison:"+temp.produit.getSaison()+"dateExpiration:"+temp.produit.dateExpiration.getJour()+"/"+temp.produit.dateExpiration.getMois()+"/"+temp.produit.dateExpiration.getAnnee() );
			
			temp=temp.suivant;
		}
	}
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Listeproduit getSuivant() {
		return suivant;
	}

	public void setSuivant(Listeproduit suivant) {
		this.suivant = suivant;
	}
}

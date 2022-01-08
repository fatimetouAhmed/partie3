package Partie3;
import java.util.Scanner;

public class Produit implements  Critere{

	 int identifiant;
	 String libelle;
	 double quantite;
	 double prix;
	 String saison;
	 String type;
	Date dateExpiration;
	String tab[]={"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"};
	public Produit(int identifiant, String libelle, double quantite , double prix,String saison,String type,Date dateExpiration)  {
		
		this.identifiant=identifiant;
		this.libelle=libelle;
		this.quantite=quantite;
	this.prix=prix;
	
		this.saison=saison;
		this.type=type;
		this.dateExpiration=dateExpiration;
	}
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}
	public void setPrix(double d) {
		this.prix = d;
	}
	public String getSaison() {
		return saison;
	}
	public void setSaison(String saison) {
		this.saison = saison;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	
	
	 static void AfficherProduit(Produit p) {
		
		System.out.println("identifiant :"+p.identifiant);
		System.out.println("libelle :"+p.libelle);
		System.out.println("marque :"+p.quantite);		
		System.out.println("prix :"+p.prix);
		System.out.println("prix :"+p.saison);
		System.out.println("prix :"+p.type);
	}
	@Override
	public boolean estFrais(String saison){
		// TODO Auto-generated method stub
		if(this.type=="Fruit"){
			if(saison==this.saison){
				return true;
			}
		}
		else if(this.type=="Legume"){
			int j=0;
			for(int i=0;i<tab.length;i++){	
			if(this.saison==tab[i]){
				j=i;
			}
			}
			if(j==(tab.length-1)){
				if(saison==tab[j] || saison==tab[0]){
					return true;
				}

			}
			else{
			if(saison==tab[j] || saison==tab[j+1]){
				return true;
			}
			}
		}
		return false;
	}




	
}

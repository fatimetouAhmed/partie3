package Partie3;

public class Magasin {
	private int identifiant;
	private String adresse;
	private float capacite;
	Listeproduit Listeproduit;

	
	public Magasin(int identifiant,String adresse,float capacite,Listeproduit listeproduit){
		
		
		this.identifiant=identifiant;
		this.adresse=adresse;
		this.capacite=capacite;
		this.Listeproduit=listeproduit;
			
	}

	public int getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public float getCapacite() {
		return capacite;
	}


	public void setCapacite(float capacite) {
		this.capacite = capacite;
	}


	public Listeproduit getlisteproduits() {
		return Listeproduit;
	}

	public void setlisteproduits(Listeproduit Listeproduit) {
		this.Listeproduit = Listeproduit;
	}
	

	public Listeproduit getListeproduit() {
		return Listeproduit;
	}

	public void setListeproduit(Listeproduit listeproduit) {
		Listeproduit = listeproduit;
	}

	void afficherMagsin() {
		
		System.out.println("\n l''identifiant est : "+this.identifiant);
		System.out.println("\n l''adresse est : "+this.adresse);
		System.out.println("\n la capacite est : "+this.capacite);
		
		System.out.println("\n ---Liste des produits---");
		System.out.println("\n les produit sont : \n");
		//Listeproduit.affichage(Listeproduit);	
	}


}

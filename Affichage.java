package Partie3;
public class Affichage {
	static void determinerTypeProduit(Produit p){
		if(p.type=="Fruit" || p.type=="fruit"){
			System.out.println("le type du produit est "+p.type);
		}
		if(p.type=="Legume"){
			System.out.println("le type du produit est "+p.type);
		}
	}
	 static double calculStock(Magasin m){
		 double j = 0,qt=0;
		 while(m.Listeproduit.suivant!=null){
			 if(m.Listeproduit.produit.type=="Fruit"){
				 j= m.Listeproduit.produit.quantite;
				 qt=qt+j;
			 }
			 m.Listeproduit=m.Listeproduit.suivant;
		 }			
		 return qt;
	 }
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Affichage a=new Affichage();
		Date d=new Date(02,07,2000);
		ProduitFruit p1=new ProduitFruit(1254,"fraise",12.3,0.0,"Mars","Fruit",d);
		ProduitFruit p2=new ProduitFruit(1224,"pasteque",50,0.0,"Janvier","Fruit",d);
		ProduitFruit p3=new ProduitFruit(7896,"mandarine",25.5,0.0,"Décembre","Fruit",d);
		ProduitLegume p4=new ProduitLegume(8521,"Artichauts",25.5,0.0,"Janvier","Legume",d);
		 System.out.println("\n---------------affichage du Frais pour les deux type du produit-------------\n");
		String s="Février",s1="Décembre";
		boolean b=false;
		boolean b1=false;
	    b=p2.estFrais(s1);
	    System.out.println("estFrais pour un produit Fruit \n"+b);
        b1=p4.estFrais(s);
    System.out.println("estFrais pour un produit Legume \n"+b1);
	 Listeproduit lp1=null;
	lp1 =new Listeproduit(p1,lp1);
	Listeproduit lp2=null;
	lp2 =new Listeproduit(p2,lp2);
	Listeproduit lp3=null;
	lp3 =new Listeproduit(p3,lp3);
	Listeproduit lp4=null;
	lp4 =new Listeproduit(p4,lp4);
	
	lp1=lp1.ajouterDebut(lp2, lp1);
	lp1=lp1.ajouterDebut(lp3, lp1);
	lp1=lp1.ajouterDebut(lp4, lp1);;
	 Magasin m=new Magasin(1,"hhjji",6,lp1);
	 System.out.println("\n---------------affichage du magasin-------------\n");
	 m.afficherMagsin();
	// lp1.affichage(lp1);
	// lp2.affichage(lp2);
		//System.out.println();
	 double f;
		f=calculStock(m);
		System.out.println("le stock de cet magasin est"+f);
		System.out.println("\n---------------le type du produit-------------\n");
		determinerTypeProduit(p4);
		Produit p=new Produit();
		 Produit pn1=new Produit(1021,"lait",0.0,0.0,"delice",null,d);
		 Produit pn2=new Produit(2510,"yaourt",0.0,0.0,"vitalet",null,d);
		 Produit pn3=new Produit(3250,"tomat",0.0,0.0,"sicam",null,d);
		 pn1.setPrix(0.700);
		 System.out.println("\n---------------affichage du produit-------------\n");
		 pn1.AfficherProduit(pn1);
			
	}

}

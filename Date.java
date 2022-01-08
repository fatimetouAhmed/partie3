package Partie3;
import java.util.Scanner;
public class Date {
 private int jour;
 private int mois;
 private int annee;
 
  
  public Date(int i, int j, int k) {
	  
	  this.annee=k;
	  this.mois=j;
	  this.jour=i;
	// TODO Auto-generated constructor stub
	  
}


public int getJour() {
		return jour;
	}
public int getMois() {
	return mois;
}
public int getAnnee() {
	return annee;
}
}
package employee;

public class Employee {
private int id,nbheur,conge,prix_heure;
private double prime;
private String decision;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNbheur() {
	return nbheur;
}
public void setNbheur(int nbheur) {
	this.nbheur = nbheur;
}
public int getConge() {
	return conge;
}
public void setConge(int conge) {
	this.conge = conge;
}
public int getPrix_heure() {
	return prix_heure;
}
public void setPrix_heure(int prix_heure) {
	this.prix_heure = prix_heure;
}
public double getPrime() {
	return prime;
}
public void setPrime(double prime) {
	this.prime = prime;
}
public String getDecision() {
	return decision;
}
public void setDecision(String decision) {
	this.decision = decision;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", nbheur=" + nbheur + ", conge=" + conge + ", prix_heure=" + prix_heure + ", prime="
			+ prime + ", decision=" + decision + "]";
}



}

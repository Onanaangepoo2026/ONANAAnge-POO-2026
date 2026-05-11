/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipplanmanager;

/**
 *
 * @author USER
 */
public class adressesIP {
    private String valeur;    
  public adressesIP(String valeur) {       
      setValeur(valeur); 
    } 
    public String getValeur() {       
        return valeur; 
    } 
    public void setValeur(String valeur) {         if (valeur == null || valeur.isEmpty()) { 
            System.out.println("Erreur : adresse IP invalide."); 
            this.valeur = "0.0.0.0"; 
        } else { 
            this.valeur = valeur; 
        } 
    } 
    public void afficher() { 
        System.out.println("adresse IP : " + valeur); 
    } 
    public boolean estAdresseLocale() {
    if (this.valeur != null && this.valeur.startsWith("192.")) {
        return true;
    } else{
    return false;
    }
    }
    
    
}

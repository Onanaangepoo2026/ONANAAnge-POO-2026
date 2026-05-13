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
public class SousReseau {
    private String nom;     private reseauIP reseau; 
 
    public SousReseau(String nom, reseauIP reseau) {         setNom(nom);         this.reseau = reseau; 
    } 
 
    public String getNom() {         return nom; 
    } 
 
    public void setNom(String nom) {         if (nom == null || nom.isEmpty()) {             this.nom = "Sous-reseau_inconnu"; 
        } else { 
            this.nom = nom; 
        } 
    } 
 
    public reseauIP getReseau() { 
        return reseau; 
    } 
 
    public void setReseau(reseauIP reseau) {         this.reseau = reseau; 
    } 
 
    public void afficher() { 
        System.out.println("Sous-réseau : " + nom);         if (reseau != null) {             reseau.afficher(); 
        } 
    } 

    
}

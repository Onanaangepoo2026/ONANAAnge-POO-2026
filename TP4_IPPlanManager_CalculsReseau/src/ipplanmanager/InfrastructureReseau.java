/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipplanmanager;
import java.util.ArrayList; 

/**
 *
 * @author USER
 */
import java.util.ArrayList;

public class InfrastructureReseau {
    private String nom; 
    private ArrayList<Equipement> equipements;     
    private ArrayList<SousReseau> sousReseaux; 

    public InfrastructureReseau(String nom) {         
        this.nom = nom; 
        equipements = new ArrayList<>();         
        sousReseaux = new ArrayList<>(); 
    } 

    public void ajouterEquipement(Equipement equipement) { 
        equipements.add(equipement); 
    } 

    public void ajouterSousReseau(SousReseau sousReseau) { 
        sousReseaux.add(sousReseau); 
    } 
    public void rechercherEquipement(String nomRecherche) {
        boolean trouve = false;
        for (Equipement equipement : equipements) {
       
            if (equipement.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("\n--- Résultat de recherche ---");
                equipement.afficher();
                trouve = true;
                break; 
            }
        }
        if (!trouve) {
            System.out.println("\nErreur : L'équipement '" + nomRecherche + "' est introuvable.");
        }
    }

    public void afficherEquipements() {         
        for (Equipement equipement : equipements) { 
            equipement.afficher();             
            System.out.println(); 
        } 
    } 

    public void afficherSousReseaux() {         
        for (SousReseau sousReseau : sousReseaux) { 
            sousReseau.afficher();             
            System.out.println(); 
        } 
    } 

    public void afficher() { 
        System.out.println("Infrastructure : " + nom); 
        System.out.println("\n===== SOUS-RÉSEAUX =====");         
        afficherSousReseaux(); 
        System.out.println("\n===== ÉQUIPEMENTS =====");         
        afficherEquipements(); 
    } 
} 
    


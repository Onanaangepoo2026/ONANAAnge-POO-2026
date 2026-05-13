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
public class Main {
    public static void main(String[] args) throws ConflictVLANException { 
        System.out.println("===== IPPlan-Manager : TP7 - Validations avancées ====="); 
 
        ArrayList<BesoinReseau> besoins = new ArrayList<>();         besoins.add(new BesoinReseau("ADMINISTRATION", 50));        besoins.add(new BesoinReseau("TECHNIQUE", 120));         besoins.add(new BesoinReseau("WIFI", 80));         besoins.add(new BesoinReseau("SERVEURS", 20)); 
 
        MoteurVLSM moteur = new MoteurVLSM(); 
        ArrayList<ResutatVLSM> resultats = moteur.genererPlan("192.168.1.0", besoins); 
 
        System.out.println(); 
        System.out.println("Plan généré :");         for (ResutatVLSM resultat : resultats) {             resultat.afficher(); 
        } 
 
        ValidateurPlanAdressage validateur = new 
ValidateurPlanAdressage(); 
 
        
        validateur.afficherValidationReussie(); 
 
        System.out.println(); 
        System.out.println("Test de conflit VLAN :"); 
 
        GestionnaireVLAN gestionnaire = new GestionnaireVLAN(); 
 
        try { 
            VLAN vlan10 = new VLAN(10, "ADMINISTRATION", 
resultats.get(0), "VLAN Administration"); 
            VLAN vlan20 = new VLAN(20, "TECHNIQUE", resultats.get(1), "VLAN Technique"); 
            VLAN vlan10Erreur = new VLAN(10, "WIFI", resultats.get(2), "VLAN WiFi avec ID déjà utilisé"); 
 
            gestionnaire.ajouterVLAN(vlan10);             gestionnaire.ajouterVLAN(vlan20);             gestionnaire.ajouterVLAN(vlan10Erreur); 
 
            gestionnaire.afficherTousLesVLANs(); 
        } catch (ConflitVLANException e) { 
            System.out.println("Erreur VLAN : " + e.getMessage()); 
        } 
    } 

    
    
}

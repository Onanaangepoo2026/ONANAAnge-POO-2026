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
public class GestionnaireVLAN {
    private ArrayList<VLAN> vlans;

    public GestionnaireVLAN() {
        vlans = new ArrayList<>();
    }

    public void ajouterVLAN(VLAN vlan) throws ConflitVLANException, ConflictVLANException {     if (vlan == null) {         return; 
    } 
    for (VLAN v : vlans) { 
        if (v.getId() == vlan.getId()) { 
            throw new ConflictVLANException("Conflit VLAN : l'identifiant " + vlan.getId() + " est déjà utilisé."); 
        } 
    } 
    vlans.add(vlan); 
} 


    public void afficherTousLesVLANS() {
        for (VLAN vlan : vlans) {
            vlan.afficher();
            System.out.println();
        }
    }

    public VLAN rechercherVLAN(int id) {
        for (VLAN vlan : vlans) {
            if (vlan.getId() == id) {
                return vlan;
            }
        }
        return null;
    }

    public int obtenirNombreVLANs() {
        return vlans.size();
    }

    // --- TRAVAIL SUPPLÉMENTAIRE (Point 16) ---
    public void afficherVLANsCritiques() {
        System.out.println("===== DÉTECTION DES VLANS CRITIQUES (> 100 hôtes) =====");
        for (VLAN vlan : vlans) {
            // On vérifie si la capacité du réseau associé dépasse 100
            if (vlan.getReseauAssocie() != null && vlan.getReseauAssocie().getCapacite() > 100) {
                System.out.println("VLAN critique détecté : VLAN " + vlan.getId() + " " + vlan.getNom() 
                                   + " (" + vlan.getReseauAssocie().getCapacite() + " hôtes)");
            }
        }
    }

    // Pour le point 15 : Trouver le VLAN avec la plus grande capacité
    public void afficherVLANPlusGrandeCapacite() {
        VLAN maxVlan = null;
        int maxCapacite = -1;

        for (VLAN vlan : vlans) {
            if (vlan.getReseauAssocie() != null && vlan.getReseauAssocie().getCapacite() > maxCapacite) {
                maxCapacite = vlan.getReseauAssocie().getCapacite();
                maxVlan = vlan;
            }
        }

        if (maxVlan != null) {
            System.out.println("VLAN possédant la plus grande capacité : " + maxVlan.getNom() 
                               + " avec " + maxCapacite + " hôtes.");
        }
    }

    void afficherTousLesVLANs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

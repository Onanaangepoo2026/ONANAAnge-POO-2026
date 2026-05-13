/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipplanmanager;
import java.util.ArrayList; import java.util.Collections; import java.util.Comparator; 

/**
 *
 * @author USER
 */
public class MoteurVLSM {
    public ArrayList<ResutatVLSM> genererPlan(String adresseDepart, 
ArrayList<BesoinReseau> besoins) { 
        ArrayList<ResutatVLSM> resultats = new ArrayList<>();  
        Collections.sort(besoins, new Comparator<BesoinReseau>() { 
            @Override 
            public int compare(BesoinReseau b1, BesoinReseau b2) {                 return b2.getNombreHotes() - b1.getNombreHotes(); 
            } 
        }); 
 
        int adresseCourante = 
CalculateurReseau.convertirIpEnEntier(adresseDepart); 
 
        for (BesoinReseau besoin : besoins) { 
            int cidr = 
CalculateurReseau.calculerCidrPourHotes(besoin.getNombreHotes());             int capacite = CalculateurReseau.calculerNombreHotes(cidr); 
            String masque = 
CalculateurReseau.obtenirMasqueDecimal(cidr); 
            String adresseReseau = 
CalculateurReseau.convertirEntierEnIp(adresseCourante); 
            ResutatVLSM resultat = new ResutatVLSM(besoin.getNom(), adresseReseau, cidr, masque, capacite);             resultats.add(resultat); 
            int tailleBloc = CalculateurReseau.calculerTailleBloc(cidr); 
            adresseCourante = adresseCourante + tailleBloc; 
        } 
        return resultats; 
    } 

   }


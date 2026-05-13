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
public class ResutatVLSM {

 private String nomBesoin;     private String adresseReseau;     private int cidr;     private String masqueDecimal;     private int capacite; 
 
    public ResutatVLSM(String nomBesoin, String adresseReseau, int cidr, String masqueDecimal, int capacite) {         this.nomBesoin = nomBesoin;         this.adresseReseau = adresseReseau;         this.cidr = cidr; 
        this.masqueDecimal = masqueDecimal;         this.capacite = capacite; 
    } 
    public String getNomBesoin() { 
        return nomBesoin; 
    } 
    public String getAdresseReseau() {         return adresseReseau; 
    } 
    public int getCidr() {         return cidr; 
    } 
    public int getCapacite() {         return capacite; 
    } 
    public void afficher() { 
        System.out.println(nomBesoin + " -> " + adresseReseau + "/" + cidr 
                + " | Masque : " + masqueDecimal 
                + " | Capacité : " + capacite + " hôtes");  

    }
     }
    

 

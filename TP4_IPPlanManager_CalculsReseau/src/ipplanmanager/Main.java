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
public class Main {
 
       public static void main(String[] args) {         InfrastructureReseau infrastructure = 
                new InfrastructureReseau("Infrastructure YFY");         reseauIP reseauAdmin = 
                new reseauIP("192.168.1.0",24,"Réseau Administration" 
                ); 
 
        reseauIP reseauTechnique = new reseauIP( 
                        "172.16.0.0", 
                        16, 
                        "Réseau Technique" 
                ); 
 
        reseauIP reseauWifi =                 new reseauIP( 
                        "10.0.0.0", 
                        8, 
                        "Réseau WiFi" 
                ); 
 
        SousReseau admin =                 new SousReseau(                         "ADMIN",                         reseauAdmin                 ); 
 
        SousReseau tech =                 new SousReseau(                         "TECH",                         reseauTechnique 
                ); 
 
        SousReseau wifi =                 new SousReseau(                         "WIFI",                         reseauWifi 
                ); 
 
        infrastructure.ajouterSousReseau(admin);         infrastructure.ajouterSousReseau(tech);         infrastructure.ajouterSousReseau(wifi); 
 
        infrastructure.afficher(); 
        
        String[] adressesATester = {
    "10.0.0.5",      // Privée (Classe A)
    "172.20.10.1",   // Privée (Classe B)
    "192.168.1.100", // Privée (Classe C)
    "8.8.8.8",       // Publique (Google)
    "172.45.0.1"     // Publique (Hors plage 16-31)
};
System.out.println("\n--- Tests de la méthode estReseauPrive ---");
for (String ip : adressesATester) {
    boolean resultat = CalculateurReseau.estReseauPrive(ip);
    String statut = resultat ? "TRUE" : "FALSE_";
    System.out.println("L'adresse " + ip + " est : " + statut);


    } 
      
}
}





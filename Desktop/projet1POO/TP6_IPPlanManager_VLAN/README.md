**TP6:VLAN**



**Objectif** : Mise en place de la gestion des VLANs et association automatique des sous-réseaux générés par le moteur VLSM.


&nbsp;**Notions étudiées :** 

Segmentation logique, standard IEEE 802.1Q, gestionnaires métier et architecture logicielle modulaire.
 

**Scénario Université :** 

Test réalisé avec les besoins spécifiques (Étudiants 500, Enseignants 120, Laboratoires 60, WiFi 200, Serveurs 30).



**Résultats obtenus**

* Le programme remplit les objectifs suivants pour le scénario "Université" :

Génération automatique :Création de 5 VLANs avec des IDs incrémentés de 10 (10, 20, 30, 40, 50).

* Segmentation logique : Chaque besoin (Étudiants, Enseignants, etc.) est isolé dans son propre domaine de broadcast.
* Analyse de capacité : Le système identifie correctement les VLANs critiques (ceux dépassant 100 hôtes, comme le VLAN ETUDIANTS et WIFI PUBLIC).
* le programme affiche dynamiquement le VLAN ayant la plus grande capacité d'accueil.
* Architecture logicielle : Mise en place d'une séparation nette entre la logique de calcul (MoteurVLSM) et la gestion d'inventaire (GestionnaireVLAN).



**Difficultés rencontrées**



Durant le développement de ce TP, les points suivants ont nécessité une attention particulière :

* L'association d'objets : La principale difficulté a été de lier correctement l'objet `ResultatVLSM` (issu du TP5) comme attribut de la classe `VLAN`. Il a fallu s'assurer que les données calculées par le moteur soient bien transmises au gestionnaire de VLAN.
* La gestion des boucles :L'automatisation de la création des VLANs dans la classe `Main` a demandé de bien manipuler les listes (`ArrayList`) pour parcourir les résultats VLSM tout en générant des IDs de VLAN uniques.
* Encapsulation et Typage : Respecter les contraintes de typage pour que le `GestionnaireVLAN` puisse filtrer les réseaux en fonction de leur capacité sans créer d'erreurs de pointeur nul (NullPointerException).



**Réponses aux questions de compréhension**



1.Importance des VLANs : Ils améliorent la sécurité, réduisent les tempêtes de broadcast et permettent une gestion plus souple des politiques réseau.



2\. Association VLAN/Sous-réseau : Un VLAN définit une limite logique au niveau 2 (Liaison), tandis que le sous-réseau définit l'adressage au niveau 3 (Réseau). L'association est indispensable pour le routage.



3\. Sécurité : La segmentation empêche un utilisateur d'un réseau (ex: invité) d'accéder aux ressources critiques (ex: serveurs) sans passer par une règle de filtrage explicite.



4\. Classe GestionnaireVLAN : Son rôle est de centraliser la collection des VLANs et d'offrir des méthodes de recherche et d'affichage.



5\. VLAN et ResultatVLSM : Cette relation permet au VLAN de connaître sa "carte d'identité" réseau (adresse IP, masque, passerelle).



6\. Utilisation d'ArrayList : C'est la structure la plus adaptée pour gérer une liste dynamique dont la taille dépend du nombre de besoins saisis par l'utilisateur.



7\. Séparation des responsabilités : Cela rend le code plus facile à maintenir et à tester. Si on modifie le calcul VLSM, le gestionnaire de VLAN n'a pas besoin d'être réécrit.



8\. Application professionnelle : Le passage de simples variables à des classes "Manager" et des associations d'objets transforme le script en une véritable application métier.



 


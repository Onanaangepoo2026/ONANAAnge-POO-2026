**TP4 - Calculs réseau** 



**Objectif** 



L'objectif de ce TP est l'introduction des calculs réseau automatiques au sein de l'application IPPlan-Manager. Il s'agit de passer d'une saisie manuelle à une logique algorithmique permettant de déterminer automatiquement le masque, la capacité et la classe d'un réseau.



* **Notions étudiées** 



Méthodes statiques : Utilisation du mot-clé `static` pour créer des fonctions appartenant à la classe elle-même sans nécessiter d'instanciation.





Classes utilitaires: Création de la classe `CalculateurReseau` pour centraliser les opérations techniques.





Calculs réseau \& CIDR: Automatisation du calcul du nombre d'hôtes ($2^{(32-CIDR)} - 2$) et conversion du CIDR en masque décimal.





Logique métier : Séparation des traitements de calcul des objets de données (équipements, réseaux).







* **Tests réalisés** 



Validation des classes : Test des adresses pour vérifier la détection des Classes A, B et C.





Calcul de capacité: Vérification que le `/24` donne bien 254 hôtes.





Adresses privées (Point 15): Vérification de la méthode `estReseauPrive` avec les plages `10.x.x.x`, `172.16.x.x` à `172.31.x.x` et 192.168.x.x. la methode fonctionne bien







* **Difficultés rencontrées** 



Exemple : Gestion des erreurs de syntaxe lors de l'insertion du code de test dans la classe Main (problème d'accolades). 



Exemple : Découpage de l'adresse IP avec `split("\\\\.")` pour récupérer les octets.\* 







* **Réponses aux questions** 



1\. 

Pourquoi une classe utilitaire ? Pour organiser le code, éviter les répétitions et centraliser les calculs techniques.





2\. 

Rôle du mot-clé `static` ? Il permet d'appeler une méthode directement via le nom de la classe sans créer d'objet.





3\. 

Importance des calculs automatisés ? Pour éviter les erreurs humaines, accélérer les déploiements et aider les techniciens moins expérimentés.





4\. 

Utilité du CIDR ?Il permet de définir la taille d'un réseau de manière simplifiée et flexible.





5\. 

Pourquoi le nombre d'hôtes dépend du masque ? Car le masque détermine combien de bits sont réservés aux machines par rapport à la partie réseau.





6\. 

Pourquoi des adresses privées ?Pour permettre une utilisation interne sans consommer d'adresses IP publiques limitées.





7\. 

Séparation logique métier/calcul ? Cela améliore la maintenance et la clarté du projet.





8\. 

Pourquoi automatiser dans un outil IPAM ? Pour garantir l'optimisation des ressources IP et la fiabilité des données.










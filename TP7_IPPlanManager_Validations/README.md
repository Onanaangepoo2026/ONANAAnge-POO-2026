&nbsp;IPPlan-Manager - TP7 : Détection des conflits et incohérences



1**. Objectif du TP**



L'objectif de ce TP est de transformer l'application IPPlan-Manager en un outil de planification réseau fiable et professionnel. Il s'agit de mettre en place des mécanismes de \*\*validation avancée\*\* pour détecter les erreurs de configuration avant qu'elles ne soient déployées, en utilisant les exceptions personnalisées en Java.



2\. **Notions étudiées**



* Gestion des Exceptions :Utilisation des mots-clés `throw`, `try` et `catch`.
* Exceptions personnalisées :Création de classes d'erreur spécifiques au métier du réseau.
* Expressions régulières (Regex) : Validation rigoureuse du format des adresses IPv4.
* Algorithmique de détection :Vérification des doublons (VLAN IDs) et des chevauchements de plages IP (Overlapping).
* Robustesse logicielle :Séparation du code fonctionnel et de la gestion des erreurs.



3\. **Résultats obtenus**



Grâce aux validations implémentées :

* Validation IP :Le programme rejette désormais toute adresse invalide (ex: "192.168.1.300").
* Intégrité des VLANs :Il est désormais impossible de créer deux VLANs avec le même identifiant. Une exception `ConflitVlanException` est levée.
* Sécurité des sous-réseaux :La méthode de détection de chevauchement bloque la création de réseaux dont les plages d'adresses se superposent, évitant ainsi des conflits de routage.
* Interface utilisateur : Les erreurs ne font plus "crasher" le programme ; elles affichent un message d'alerte clair pour l'administrateur réseau.



&nbsp;4. **Difficultés rencontrées**

* Logique de chevauchement (Overlapping) :La comparaison des plages d'adresses IP pour détecter si un réseau empiète sur un autre a été l'étape la plus complexe techniquement.
* Syntaxe des Regex : La rédaction de l'expression régulière pour valider précisément une IPv4 (chaque octet entre 0 et 255) a demandé plusieurs tests de précision.
* Structure du Try-Catch : Organiser le code pour que les exceptions soient lancées dans le `Validateur` mais capturées proprement dans le `Main`.



5\. **Réponses aux questions de compréhension** 

1\.  Importance de la validation : Elle est cruciale pour éviter des pannes réelles. Un plan d'adressage incohérent (doublon d'IP) peut paralyser une infrastructure entière.



2\.  Rôle des exceptions personnalisées : Elles permettent d'identifier précisément l'origine du problème (ex: faire la distinction entre une erreur de format IP et un conflit de VLAN).



3\.  Avantage du bloc try-catch : Il permet au programme de continuer à fonctionner ou de s'arrêter proprement en informant l'utilisateur, au lieu de générer une erreur système incompréhensible.



4\.  Détection de conflit VLAN : On vérifie l'unicité de l'ID dans la liste globale du `GestionnaireVLAN` avant toute nouvelle insertion.



5\.  Robustesse :Une application robuste est capable de gérer les saisies incorrectes de l'utilisateur sans s'arrêter brutalement.



6\.  Évolution professionnelle :L'ajout de ces contrôles fait passer IPPlan-Manager d'un simple calculateur à un véritable logiciel d'ingénierie réseau.


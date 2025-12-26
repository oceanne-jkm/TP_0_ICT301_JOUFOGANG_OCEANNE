 TP 0 ICT301 - JOUFOGANG KOUDAZEM OCEANNE MEGANE
 MATRICULE : 23U2343

EXPLICATIONS DES PRINCIPES SOLID

  1- SRP (Single Responsibility Principle) : Une classe ne doit avoir qu'une seule responsabilité (une seule raison de changer). Dans l'exemple du livre, la classe Book faisait trop de choses (gérer données, afficher, sauvegarder, logique métier) ; on sépare en plusieurs classes pour plus de maintenabilité.

  2- OCP (Open/Closed Principle) : Les classes doivent être ouvertes à l'extension (ajouter de nouvelles formes sans modifier le calculateur) mais fermées à la modification (pas de if/switch à changer).

  3- LSP (Liskov Substitution Principle) : Une classe dérivée doit pouvoir remplacer sa classe de base sans casser le programme. L'exemple Square héritant de Rectangle viole ça car setWidth/Height change le comportement attendu ; solution : interface commune Shape.

  4- ISP (Interface Segregation Principle) : Pas d'interfaces "fat" avec des méthodes inutiles. L'interface Worker forçait le Robot à implémenter eat() ; on sépare en Workable et Eatable.

  5- DIP (Dependency Inversion Principle) : Les classes de haut niveau (OrderProcessor) ne doivent pas dépendre directement des classes de bas niveau (MySQLDatabase), mais des abstractions (interface Database) pour faciliter les changements (ex. passer à MongoDB).

Les exemples de code "Avant" (violation) et "Après" (correction) sont dans les dossiers correspondants.  
Les diagrammes UML Avant/Après pour chaque principe sont dans le fichier diagrammes.pdf.
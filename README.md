HallOfGame

Notes pour les ajouts et tests:

- Privilégiez la création de .jsp au lieu de .html, ça laisse plus de libertés au dev

- Tout les frameworks ont été téléchargés et devraient avoir leur dossier dans le WebContent, donc aucun lien externe à l'application ne devrait être nécessaire.

AngularJS:

- AngularJS: il est très possible que certains attributs ne soient pas reconnus par l'interpréteur HTML d'Eclipse. Ajoutez "data-" devant si ça arrive : ng-app -> data-ng-app / ng-model -> data-ng-model / etc...

Jquery:

-JqueryUI n'inclut pas Jquery, donc n'oubliez pas de l'importer aussi en plus des modules de JqueryUI.






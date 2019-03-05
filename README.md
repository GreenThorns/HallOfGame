HallOfGame

Notes pour les ajouts et tests:

- Tout les frameworks ont été téléchargés et devraient avoir leur dossier dans le WebContent, donc aucun lien externe ne devrait être nécessaire.

- AngularJS: il est très possible que certains attributs ne soient pas reconnus par l'interpréteur HTML d'Eclipse. Ajoutez "data-" devant si ça arrive : ng-app -> data-ng-app / ng-model -> data-ng-model / etc...

- Privilégiez la création de .jsp au lieu de .html, ça laisse plus de libertés au dev

package tn.esprit.zoomanagement.main;

import tn.esprit.zoomanagement.entities.*;

/**
 * @author nadab
 */

public class ZooManagement {

    public static void main(String[] args) {

        // Instruction 1
        /* int nbrCages = 20;
         String zooName = "my zoo";

         System.out.println(zooName + " comporte " + nbrCages + " cages.");
         */

        //Instruction 2
      /* Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        while (zooName.isEmpty()) {
            System.out.println("ERREUR: Veuillez entrer un nom !");
            System.out.print("Entrez le nom du zoo: ");
            zooName = scanner.nextLine();
        }

        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = scanner.nextInt();

        while (nbrCages <= 0) {
            System.out.println("ERREUR : Veuillez entrer un nombre de cages positif !");
            System.out.print("Entrez le nombre de cages : ");
            nbrCages = scanner.nextInt();

        }

        //Instruction 3
        System.out.println(zooName + " comporte " + nbrCages + " cages"); */

        //PROSIT 2
        //INSTRUCTION 5

     /*   Animal lion = new Animal("Félin", "Lion", 5, true);

        Zoo myZoo = new Zoo("My Zoo", "Monastir", 25);

        myZoo.getAnimals()[0] = lion;

        System.out.println("Nom du zoo : " + myZoo.getName());
        System.out.println("Ville du zoo : " + myZoo.getCity());
        System.out.println("Nombre de cages du zoo : " + myZoo.getNbrCages());
        System.out.println("Nom de l'animal : " + myZoo.getAnimals()[0].getName());
        System.out.println("Famille de l'animal : " + myZoo.getAnimals()[0].getFamily());
        System.out.println("Âge de l'animal : " + myZoo.getAnimals()[0].getAge());
        System.out.println("Est un mammifère : " + myZoo.getAnimals()[0].isMammal());

    } */

        //INSTRUCTION 6

        // on utilise les costructeurs: Cela permet d'initialiser les attributs des objets en utilisant le constructeur
        // au lieu de définir chaque attribut individuellement dans la méthode main.

        //INSTRUCTION 7

      /*
        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Éléphant", 10, true);
        Animal giraffe = new Animal("Girafidé", "Girafe", 7, true);

        // Créez un tableau d'animaux
        Animal[] zooAnimals = new Animal[25];

        zooAnimals[0] = lion;
        zooAnimals[1] = elephant;
        zooAnimals[2] = giraffe;

        Zoo myZoo = new Zoo("My Zoo", "Aryanah", 20, zooAnimals); // Vous avez spécifié un maximum de 50 cages, mais nous allons en utiliser seulement 25

        // Accédez aux attributs du zoo et des animaux
        System.out.println("Nom du zoo : " + myZoo.getName());
        System.out.println("Ville du zoo : " + myZoo.getCity());
        System.out.println("Nombre de cages du zoo : " + myZoo.getNbrCages());

        // Accédez aux attributs des animaux dans le zoo
        for (int i = 0; i < myZoo.getAnimals().length; i++) {
            Animal animal = myZoo.getAnimals()[i];
            if (animal != null) {
                System.out.println("Animal " + (i + 1) + " : " + animal.getName() + " (Âge : " + animal.getAge() + ")");
            }
        }*/

        //INSTRUCTION 8

       /* Zoo myZoo = new Zoo("Belvedère", "Tunis", 20, null);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        //Rq: Les trois instructions d'affichage donneront le même résultat, en affichant les informations du zoo

        //INSTRUCTION 9
        Animal lion = new Animal("Félin", "Lion", 5, true);
        System.out.println(lion); */

        //INSTRUCTION 10
        //Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville"); // Capacité du zoo de 3 animaux
        // Créez des animaux
        // Animal lion = new Animal("Félin", "Lion", 5, true);
        /*Animal elephant = new Animal("Éléphantidé", "Éléphant", 10, true);
        Animal giraffe = new Animal("Girafidé", "Girafe", 7, true);
        Animal tiger = new Animal("Félin", "Tigre", 6, true);

        // Ajoutez les animaux au zoo en utilisant la méthode addAnimal
        System.out.println("Ajout de Lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout d'Éléphant : " + myZoo.addAnimal(elephant));
        System.out.println("Ajout de Girafe : " + myZoo.addAnimal(giraffe));
        System.out.println("Ajout de Tigre : " + myZoo.addAnimal(tiger)); // Cette ligne ajoutera un animal de plus que la capacité

        // Affichez le nombre d'animaux dans le zoo
        System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getAnimalCount()); */
        //boolean ajoutLion = myZoo.addAnimal(lion);

        // Affichez les animaux dans le zoo en utilisant la méthode displayAnimals
        // myZoo.displayAnimals();

        // Cherchez l'animal "Lion" dans le zoo en utilisant la méthode searchAnimal
        // int foundIndex = myZoo.searchAnimal("Lion");
       /* if (ajoutLion) {
            System.out.println("Lion ajouté au zoo.");
        } else {
            System.out.println("Lion non ajouté au zoo, le zoo est plein.");
        }
        if (foundIndex != -1) {
            System.out.println("Animal trouvé à l'indice " + foundIndex);
        } else {
            System.out.println("Animal non trouvé.");
        }*/
        //INSTRUCTION 13
     /*   boolean suppressionLion = myZoo.removeAnimal(lion);
        if (ajoutLion) {
            System.out.println("Lion ajouté au zoo.");
        } else {
            System.out.println("Lion non ajouté au zoo, le zoo est plein.");
        }

        if (suppressionLion) {
            System.out.println("Lion supprimé du zoo.");
        } else {
            System.out.println("Lion non trouvé dans le zoo.");
        }

        // Affichez à nouveau les animaux dans le zoo pour vérifier la suppression
        myZoo.displayAnimals();
    }*/
       /* Zoo zoo1 = new Zoo("Zoo 1", "Ville 1", 30); // Zoo avec 30 cages
        Zoo zoo2 = new Zoo("Zoo 2", "Ville 2", 10); // Zoo avec 10 cages

        // Ajoutez des animaux à zoo1 et zoo2 ici...

        if (Zoo.isZooFull(zoo1)) {
            System.out.println(zoo1.name + " est plein.");
        } else {
            System.out.println(zoo1.name + " n'est pas plein.");
        }

        if (Zoo.isZooFull(zoo2)) {
            System.out.println(zoo2.name + " est plein.");
        } else {
            System.out.println(zoo2.name + " n'est pas plein.");
        } */
        Animal animal = new Animal("Félin", "n", 5, true);

        Zoo myZoo = new Zoo("My Zoo", "Monastir", 5);

        myZoo.addAnimal(animal, myZoo);

        // Créez une instance de AnimalAquatique (constructeur par défaut)
        AnimalAquatique animalAquatique = new AnimalAquatique("Océan", "bear", 15, true, "mountain");

        // Créez une instance de AnimalTerrestre avec le constructeur paramétré
        AnimalTerrestre animalTerrestre = new AnimalTerrestre(4);

        // Créez une instance de Dolphin (Dauphin) avec le constructeur paramétré
        Dolphin dolphin = new Dolphin("Océan", "dolphin", 5, true, "ocean", 50.0f);

        // Créez une instance de Penguin (Pingouin) avec le constructeur paramétré
        Penguin penguin = new Penguin("Antarctique", "penguin", 10, true, "antarctique", 50.0f);

        // Vous avez maintenant créé une instance de chaque classe avec les constructeurs paramétrés

        // Affichez les objets en utilisant la méthode toString()
        System.out.println("Animal Aquatique: " + animalAquatique);
        System.out.println("Animal Terrestre: " + animalTerrestre);
        System.out.println("Dauphin: " + dolphin);
        System.out.println("Pingouin: " + penguin);

        animalAquatique.swim();
        dolphin.swim();
        penguin.swim();
    }
}

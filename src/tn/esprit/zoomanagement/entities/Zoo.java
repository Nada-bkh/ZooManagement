package tn.esprit.zoomanagement.entities;

import java.util.HashSet;
import java.util.Set;

public class Zoo {
    public Set<Animal> animals = new HashSet<>();
    public String name;
    public String city;
    public int age;
    public int maxCages;
    public static final int MAX_ANIMALS = 25; // Constante pour le nombre maximal d'animaux

   /* public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new HashSet<>();
    }*/

    public Zoo(String name, String city, int maxCages) {
        this.name = name;
        this.city = city;
        this.maxCages = maxCages;
    }

    private int animalCount = 0; // Compteur d'animaux dans le zoo

    // Constructeur paramétré pour initialiser les attributs sans avoir à les définir individuellement
  /*  public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }*/

  /*  public void displayZoo() {
        System.out.println("Nom du zoo : " + this.name);
        System.out.println("Ville du zoo : " + this.city);
        System.out.println("Nombre de cages du zoo : " + this.nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Nombre de cages=" + nbrCages + "]";
    }*/

    /* public boolean addAnimal(Animal animal) {
         // Vérifiez si le nombre d'animaux dans le zoo est inférieur à la capacité
         if (animalCount < animals.length) {
             animals[animalCount] = animal;
             animalCount++; // Incrémente le compteur d'animaux
             return true;
         } else {
             return false;
         }
     }*/
    /*public boolean addAnimal(Animal animal) {
        if (animals.size() < MAX_ANIMALS) {
            return animals.add(animal); // Ajout réussi
        } else {
            return false; // Le zoo est plein, ajout échoué
        }
    }*/


    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal); // Supprime l'animal et renvoie true si la suppression réussit, sinon false
    }

    // Méthode pour obtenir le nombre d'animaux actuellement dans le zoo
    public int getAnimalCount() {

        return animalCount;
    }

    /* public void displayAnimals() {
         System.out.println("Animaux dans le zoo " + name + ":");
         for (int i = 0; i < animalCount; i++) {
             System.out.println("Animal " + (i + 1) + ": " + animals[i].getName());
         }
     }*/
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (Animal animal : animals) {
            System.out.println("Animal : " + animal.getName());
        }
    }

    // Méthode pour chercher un animal par son nom
   /* public int searchAnimal(String animalName) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animalName)) {
                return i; // Retourne l'indice de l'animal trouvé
            }
        }
        return -1; // Retourne -1 si l'animal n'est pas trouvé
    }*/
    public int searchAnimal(String animalName) {
        int index = 0;
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                return index; // Retourne l'indice de l'animal trouvé
            }
            index++;
        }
        return -1; // Retourne -1 si l'animal n'est pas trouvé
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int sizeZoo1 = z1.animals.size();
        int sizeZoo2 = z2.animals.size();

        if (sizeZoo1 > sizeZoo2) {
            return z1; // Retourne z1 s'il a plus d'animaux
        } else if (sizeZoo2 > sizeZoo1) {
            return z2; // Retourne z2 s'il a plus d'animaux
        } else {
            System.out.println("Les deux zoos ont le meme nombre d'animaux.");

        }
        return null;
    }


    public static boolean isZooFull(Zoo zoo) {
        int numAnimals = zoo.animals.size();
        return (zoo.maxCages >= MAX_ANIMALS);
    }

    public boolean addAnimal(Animal animal, Zoo zoo) {

        if (isZooFull(zoo)) {
            System.out.println("Le zoo est plein.");
        } else if (animal.age <= 0) {
            System.out.println("L'âge doit être positif.");
        } else if (animal.name.isEmpty()) {
            System.out.println("Veuillez entrer un nom.");
        } else {
            System.out.println("Votre animal est ajouter avec succés.");
            return animals.add(animal); // Ajout réussi
        }
        return false;
    }
}

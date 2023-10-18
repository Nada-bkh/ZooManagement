package tn.esprit.zoomanagement.entities;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {

        return family;
    }

    public void setFamily(String family) {

        this.family = family;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Veuillez entrez un nom valide.");
        } else {
            this.name = name;
        }
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge doit être positif.");
        }

    }

    public boolean isMammal() {

        return isMammal;
    }

    public void setMammal(boolean mammal) {

        isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Animal [Famille=" + family + ", Nom=" + name + ", Âge=" + age + ", Mammifère=" + isMammal + "]";
    }
}

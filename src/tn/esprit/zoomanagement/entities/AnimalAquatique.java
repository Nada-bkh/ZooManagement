package tn.esprit.zoomanagement.entities;

import java.util.Objects;

public class AnimalAquatique extends Animal {
    private String habitat;

    public AnimalAquatique(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + "Habitat: " + habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnimalAquatique other = (AnimalAquatique) obj;
        return Objects.equals(getName(), other.getName()) &&
                Objects.equals(getAge(), other.getAge()) &&
                Objects.equals(getHabitat(), other.getHabitat());
    }
}


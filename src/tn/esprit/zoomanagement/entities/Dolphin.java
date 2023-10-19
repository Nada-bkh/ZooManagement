package tn.esprit.zoomanagement.entities;

public class Dolphin extends AnimalAquatique {
    private float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vitesse de nage: " + swimmingSpeed;
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}

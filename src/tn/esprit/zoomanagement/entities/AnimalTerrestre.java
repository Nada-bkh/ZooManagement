package tn.esprit.zoomanagement.entities;

public class AnimalTerrestre {
    private int nbrLegs;

    public AnimalTerrestre(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + "Nombre de pattes: " + nbrLegs;
    }
}

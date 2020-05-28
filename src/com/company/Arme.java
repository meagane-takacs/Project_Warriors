package com.company;

import com.company.personnages.Guerrier;
import com.company.personnages.Magicien;



public class Arme extends Case implements iMateriel {
    protected int forceArme;

    public Arme(){

        super("");
        this.forceArme = 0;
    }

    /**
     * @param pNomArme
     * @param pForceArme :
     *
     */
    public Arme(String pNomArme, int pForceArme) {
        super(pNomArme);
        this.forceArme = pForceArme;
    }

    public int getForceArme() {
        return forceArme;
    }

    public void setForceArme(int forceArme) {
        this.forceArme = forceArme;
    }

    public void interactionMateriel(Personnage personnage) {

        if (personnage instanceof Guerrier) {
            personnage.addForceAttaque(forceArme);
            System.out.println("Votre " + personnage + "récupère " + forceArme + " points d'attaque");
        } else if ( personnage instanceof Magicien){
            System.out.println("Votre " + personnage + "ne peut pas récupérer d'armes");
        }

    }

    @Override
    public String toString() {
        return "Case Arme{" +
                "forceArme=" + forceArme +
                '}';
    }
}



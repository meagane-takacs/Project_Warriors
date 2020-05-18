package com.company;

import com.company.personnages.Guerrier;
import com.company.personnages.Magicien;


public class Arme extends Case {
    protected int forceArme;

    public Arme(){

        super("");
        this.forceArme = 0;
    }

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

    public void interaction(Personnage personnage) {

        if (personnage instanceof Guerrier) {
            personnage.addAttaque(forceArme);
            System.out.println("Votre Guerrier récupère " + forceArme + " points d'attaque");
        } else if ( personnage instanceof Magicien){
            System.out.println("Votre magicien ne peut pas récupérer d'armes");
        }

    }

    @Override
    public String toString() {
        return "Case Arme{" +
                "forceArme=" + forceArme +
                '}';
    }
}



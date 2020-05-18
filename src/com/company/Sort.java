package com.company;

import com.company.personnages.Guerrier;
import com.company.personnages.Magicien;

public class Sort extends Case {
    protected int forceSort;


    public Sort(){

        super("");
        this.forceSort = 0;
    }

    public Sort(String pNomSort, int pForceSort) {
        super(pNomSort);
        this.forceSort = pForceSort;
    }

    public int getForceSort() {
        return forceSort;
    }

    public void setForceSort(int forceSort) {
        this.forceSort = forceSort;
    }

    public void interaction(Personnage personnage) {

        if (personnage instanceof Magicien) {
            personnage.addAttaque(forceSort);
            System.out.println("Votre magicien récupère " + forceSort + " points d'attaque");
        } else if ( personnage instanceof Guerrier ){
            System.out.println("Votre guerrier ne peut pas récupérer de sort");
        }

    }

    @Override
    public String toString() {
        return "Case Sort{" +
                "forceSort=" + forceSort +
                '}';
    }
}

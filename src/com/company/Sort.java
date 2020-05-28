package com.company;

import com.company.personnages.Guerrier;
import com.company.personnages.Magicien;

public class Sort extends Case implements iMateriel{
    protected int forceSort;


    public Sort(){

        super("");
        this.forceSort = 0;
    }

    /**
     * @param pNomSort
     * @param pForceSort
     */
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

    public void interactionMateriel(Personnage personnage) {

        if (personnage instanceof Magicien) {
            personnage.addForceAttaque(forceSort);
            System.out.println("Votre " + personnage + " récupère " + forceSort + " points d'attaque");
        } else if ( personnage instanceof Guerrier ){
            System.out.println("Votre " + personnage + "ne peut pas récupérer de sort");
        }

    }

    @Override
    public String toString() {
        return "Case Sort {" +
                "forceSort=" + forceSort +
                '}';
    }
}

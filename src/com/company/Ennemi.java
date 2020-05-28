package com.company;

public class Ennemi extends Case {
    protected String nomEnnemi;
    protected int pointVieEnnemi;
    protected int pointAttaqueEnnemi;

    public Ennemi(String pNomEnnemi, int pPointVieEnnemi, int pPointAttaqueEnnemi) {
        nomEnnemi = pNomEnnemi;
        pointVieEnnemi = pPointVieEnnemi;
        pointAttaqueEnnemi = pPointAttaqueEnnemi;
    }

    /**
     * @param personnage
     * @return
     */
    public int interactionEnnemi(Personnage personnage) {
        //0 = personnen 'est mort, 1 perso mort, 2 ennemi mort
        int quiEstMort = 0;
        // tant que l'un des deux n'est pas mort
        while (personnage.getNiveauVieMin() > 0 && this.pointVieEnnemi > 0)
        {
            System.out.println("Mon personnage tape");
            this.pointVieEnnemi = this.pointVieEnnemi - personnage.getForceMin();

            if (this.pointVieEnnemi > 0)
            {
                // L'ennemi tape sur mon personnage
                System.out.println("L'ennemi tape");
                personnage.setNiveauVieMin(personnage.getNiveauVieMin() - this.pointAttaqueEnnemi);
            }

            if (this.pointVieEnnemi <= 0)
            {
                quiEstMort = 2;
            }
            else if (personnage.getForceMin() <= 0)
            {
                quiEstMort = 1;
            }
        }
        return quiEstMort;
    }


// * Setters * \\

    public void setNomEnnemi(String pNomEnnemi) {
        nomEnnemi = pNomEnnemi;
    }

    public void setPointVieEnnemi(int pPointDeVie) {
        pointVieEnnemi = pPointDeVie;
    }

    public void setPointAttaqueEnnemi(int pPointAttaqueEnnemi) {
        pointAttaqueEnnemi = pPointAttaqueEnnemi;
    }


// * Getters * \\

    public String getNomEnnemi() {
        return nomEnnemi;
    }

    public int getPointVieEnnemi() {
        return pointVieEnnemi;
    }

    public int getPointAttaqueEnnemi() {
        return pointAttaqueEnnemi;
    }


    @Override
    public String toString() {
        return "Case Ennemi {" +
                "nomEnnemi='" + nomEnnemi + '\'' +
                ", pointVieEnnemi=" + pointVieEnnemi +
                ", pointAttaqueEnnemi=" + pointAttaqueEnnemi +
                '}';
    }
}
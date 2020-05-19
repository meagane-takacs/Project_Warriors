package com.company;

public class Ennemi extends Case{
    protected String nomEnnemi;
    protected int pointVieEnnemi;
    protected int pointAttaqueEnnemi;

    public Ennemi(String pNomEnnemi, int pPointVieEnnemi, int pPointAttaqueEnnemi ){
        nomEnnemi = pNomEnnemi;
        pointVieEnnemi = pPointVieEnnemi;
        pointAttaqueEnnemi = pPointAttaqueEnnemi;
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
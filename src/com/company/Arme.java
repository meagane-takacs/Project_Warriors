package com.company;

public class Arme extends Case {
    protected String nomArme;
    protected int forceArme;

    public Arme (String pNomArme, int pForceArme) {
        nomArme = pNomArme;
        forceArme = pForceArme;
    }

    public void setNomArme(String pNomArme) {
        nomArme = pNomArme;
    }
    public void setForceArme(int pForceArme) {
        forceArme = pForceArme;
    }

    public String getNomArme() {
        return nomArme;
    }
    public int getForceArme() {
        return forceArme;
    }

    public String toString() {
        return "nom: " + this.nomArme + " force: " + this.forceArme;

    }


}


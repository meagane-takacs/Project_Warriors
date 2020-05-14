package com.company;

abstract class Personnage {
    //Stocke le nom de notre personnage
    protected String nomPerso;
    //Stocke l'img de notre personnage
    protected String imgPerso;
    //Stocke le niveau de vie du personnage
    protected int niveauViePerso;
    // Stocke la force de l'attaque du personnage
    protected int forceAttaquePerso;

    public String toString() {
        return "nom: " + this.nomPerso + " image: " + this.imgPerso + " niveau de vie: "+ this.niveauViePerso + " force du perso: " + this.forceAttaquePerso;

    }

    // * Setters * \\

    public void setNomPerso(String pNomPerso) {
        nomPerso = pNomPerso;
    }

    public void setImgPerso(String pImgPerso) {
        imgPerso = pImgPerso;
    }

    abstract void setNiveauViePerso(int pNiveauVie ) ;

    abstract void setForceAttaquePerso(int pForceAttaque ) ;

    // * Getters * \\

    public String getNomPerso() {
        return nomPerso;
    }

    public String getImgPerso() {
        return imgPerso;
    }

    public int getNiveauViePerso() {
        return niveauViePerso;
    }

    public int getForceAttaquePerso() {
        return forceAttaquePerso;
    }

}





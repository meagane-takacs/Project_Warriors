package com.company;

public abstract class Personnage {
    //Stocke le nom de notre personnage
    private String nomPerso;
    //Stocke l'img de notre personnage
    private String imgPerso;
    //Stocke le niveau de vie du personnage
    private int niveauVieMin;
    private int niveauVieMax;
    // Stocke la force de l'attaque du personnage
    private int forceMax;
    private int forceMin;

    @Override
    public String toString() {
        return "Personnage{" +
                "nomPerso='" + nomPerso + '\'' +
                ", imgPerso='" + imgPerso + '\'' +
                ", niveauVieMin=" + niveauVieMin +
                ", niveauVieMax=" + niveauVieMax +
                ", forceMin=" + forceMin +
                ", forceMax=" + forceMax +
                '}';
    }

    public void addForceAttaque(int forceAttaque) {
        if (forceAttaque + forceMin >= forceMax) {
            forceMin = forceMax;
        } else {
            forceMin = forceAttaque + forceMin;
        }
    }

    public void addVie(int niveauVie) {
        if (niveauVie + niveauVieMin >= niveauVieMax) {
            niveauVieMin = niveauVieMax;
        } else {
            niveauVieMin = niveauVie + niveauVieMin;
        }
    }

    public String getNomPerso() {
        return nomPerso;
    }

    public void setNomPerso(String nomPerso) {
        this.nomPerso = nomPerso;
    }

    public String getImgPerso() {
        return imgPerso;
    }

    public void setImgPerso(String imgPerso) {
        this.imgPerso = imgPerso;
    }

    public int getNiveauVieMin() {
        return niveauVieMin;
    }

    public void setNiveauVieMin(int niveauVieMin) {
        this.niveauVieMin = niveauVieMin;
    }

    public int getNiveauVieMax() {
        return niveauVieMax;
    }

    public void setNiveauVieMax(int niveauVieMax) {
        this.niveauVieMax = niveauVieMax;
    }

    public int getForceMax() {
        return forceMax;
    }

    public void setForceMax(int forceMax) {
        this.forceMax = forceMax;
    }

    public int getForceMin() {
        return forceMin;
    }

    public void setForceMin(int forceMin) {
        this.forceMin = forceMin;
    }
}

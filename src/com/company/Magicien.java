package com.company;

public class Magicien {
    //Stocke le nom de notre guerrier
    private String nomMagicien;
    //Stocke l'img de notre guerrier
    private String imgMagicien;
    //Stocke le niveau de vie du guerrier
    private int niveauVieMagicien;
    // Stocke la force de l'attaque du guerrier
    private int forceAttaqueMagicien;

    public String toString() {
        return "nom magicien:" + this.nomMagicien + ", image du magicien : " + this.imgMagicien;
    }



    // * Getters * \\

    public String getNomMagicien() {
        return nomMagicien;
    }

    public String getImgMagicien(){
        return imgMagicien;
    }

    public int getNiveauVieMagicien() {
        return niveauVieMagicien;
    }

    public int getForceAttaqueMagicien() {
        return forceAttaqueMagicien;
    }



    // * Setters * \\

    public void setNomMagicien(String pNomMagicien) {
        nomMagicien = pNomMagicien;
    }

    public void setImgMagicien(String pImgMagicien) {
        imgMagicien = pImgMagicien;
    }

    public void setNiveauVieMagicien(int pNiveauVieMagicien) {
        if (pNiveauVieMagicien < 3) {
            niveauVieMagicien = 3;
        } else if (pNiveauVieMagicien > 6) {
            niveauVieMagicien = 6;
        } else {
            niveauVieMagicien = pNiveauVieMagicien;
        }
    }

    public void setForceAttaqueMagicien(int pForceAttaqueMagicien) {
        forceAttaqueMagicien = pForceAttaqueMagicien;
    }



    // * Constructeur sans paramètre * \\

    public Magicien () {
        System.out.println("Creation d'un magicien!");
        nomMagicien = "Iconnu";
        imgMagicien = "Inconnu";
        niveauVieMagicien = 0;
        forceAttaqueMagicien = 0;
    }



    // * Constructeur avec paramètre Nom * \\

    public Magicien (String pNomMagicien){
        System.out.println("Creation d'un magicien avec un paramètre nom!");
        nomMagicien = pNomMagicien;
        imgMagicien = "Inconnu";
        niveauVieMagicien = 0;
        forceAttaqueMagicien = 0;
    }



    // * Constructeur avec paramètre Nom, Img, Niveau, Force Attaque * \\

    public Magicien (String pNomMagicien, String pImgMagicien, int pNiveauVieMagicien, int pForceAttaqueMagicien){
        System.out.println("Creation d'un magicien avec un paramètre nom, image, niveau de vie et force d'attaque!");
        nomMagicien = pNomMagicien;
        imgMagicien = pImgMagicien;
        niveauVieMagicien = pNiveauVieMagicien;
        forceAttaqueMagicien = pForceAttaqueMagicien;
    }


}


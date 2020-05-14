package com.company;

public class Magicien extends Personnage {


    // * Setters * \\

    public void setNiveauViePerso(int pNiveauVieMagicien) {
        if (pNiveauVieMagicien < 3) {
            niveauViePerso = 3;
        } else if (pNiveauVieMagicien > 6) {
            niveauViePerso = 6;
        } else {
            niveauViePerso = pNiveauVieMagicien;
        }
    }

    public void setForceAttaquePerso(int pForceAttaqueMagicien) {
        if (pForceAttaqueMagicien < 5) {
            forceAttaquePerso= 10;
        } else if (pForceAttaqueMagicien> 10) {
            forceAttaquePerso = 10;
        } else {
            forceAttaquePerso = pForceAttaqueMagicien;
        }
    }


    // * Constructeur sans paramètre * \\

    public Magicien () {
        System.out.println("Creation d'un magicien!");
        nomPerso="Inconnu";
        imgPerso = "Inconnu";
        niveauViePerso=0;
        forceAttaquePerso=0;
    }



    // * Constructeur avec paramètre Nom * \\

    public Magicien (String pNomMagicien){
        System.out.println("Creation d'un magicien avec un paramètre nom!");
        nomPerso= pNomMagicien;
        imgPerso = "Inconnu";
        setNiveauViePerso(0);
        setForceAttaquePerso(0);
    }



    // * Constructeur avec paramètre Nom, Img, Niveau, Force Attaque * \\

    public Magicien (String pNomMagicien, String pImgMagicien, int pNiveauVieMagicien, int pForceAttaqueMagicien){
        System.out.println("Creation d'un magicien avec un paramètre nom, image, niveau de vie et force d'attaque!");
        nomPerso= pNomMagicien;
        imgPerso = pImgMagicien;
        setNiveauViePerso(pNiveauVieMagicien);
        setForceAttaquePerso(pForceAttaqueMagicien);
    }


}


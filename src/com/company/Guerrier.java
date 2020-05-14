package com.company;

public class Guerrier extends Personnage {
    
    // * Setters * \\

    public void setNiveauViePerso(int pNiveauVieGuerrier){
        if (pNiveauVieGuerrier < 3) {
            niveauViePerso = 3;
        } else if (pNiveauVieGuerrier > 6) {
            niveauViePerso = 6;
        } else {
            niveauViePerso = pNiveauVieGuerrier;
        }
    }

    public void setForceAttaquePerso(int pForceAttaqueGuerrier) {
        if (pForceAttaqueGuerrier < 5) {
            forceAttaquePerso= 10;
        } else if (pForceAttaqueGuerrier> 10) {
            forceAttaquePerso = 10;
        } else {
            forceAttaquePerso = pForceAttaqueGuerrier;
        }
    }



    // * Constructeur sans paramètre * \\

    public Guerrier () {
        System.out.println("Creation d'un guerrier!");
        nomPerso="Inconnu";
        imgPerso = "Inconnu";
        niveauViePerso=0;
        forceAttaquePerso=0;
    }



    // * Constructeur avec paramètre Nom * \\

    public Guerrier (String pNomGuerrier){
        System.out.println("Creation d'un guerrier avec un paramètre nom!");
        nomPerso= pNomGuerrier;
        imgPerso = "Inconnu";
        setNiveauViePerso(0);
        setForceAttaquePerso(0);
    }



    // * Constructeur avec paramètre Nom, image, niveau de vie, force attaque * \\

    public Guerrier (String pNomGuerrier, String pImgGuerrier, int pNiveauVieGuerrier,int pForceAttaqueGuerrier){
        System.out.println("Creation d'un guerrier avec un paramètre nom, image, niveau de vie et force d'attaque!");
        nomPerso= pNomGuerrier;
        imgPerso = pImgGuerrier;
        setNiveauViePerso(pNiveauVieGuerrier);
        setForceAttaquePerso(pForceAttaqueGuerrier);
    }
}
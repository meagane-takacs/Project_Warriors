package com.company;

import java.util.Scanner;

public class Game {

    // * Attributs de la class Game *
    private Guerrier monGuerrier;
    private Magicien monMagicien;
    private Menu monMenu;
    private Plateau monPlateau;
    private int typePersonnage; // 1 - magicien / 2 - guerrier

    // * Constructeur de la class Game *
    public Game() {
        monMenu = new Menu();
        monPlateau = new Plateau();
    }

    // * method start *
    public void start() {

        // * Affiche le menu principal
        monMenu.showMenuPrincipal();
        // * Recupère la réponse de l'utilisateur
        int choix = monMenu.reponseMenuInt();
        // {Choix 1:Creation d'un personnage / Choix 0:Quitter le jeu}
        if (choix == 1) {
            // Afficher le menu de creation perso
            monMenu.showMenuCreationPerso();
            // on récupère le choix de l'utilisateur
            choix = monMenu.reponseMenuInt();
            // {Choix 1:Creation magicien}
            if (choix == 1) {
                //on appelle le menu entrée nom
                monMenu.entrerNom();
                // On stocke le choix de l'utilisateur dans l'attribut nom donnee
                String nomDonnee = monMenu.reponseEntrerNom();
                //on instancie un nouvel objet
                monMagicien = new Magicien(nomDonnee);
                //le type de personnage est 1
                typePersonnage = 1;
                // {Creation guerrier}
            } else if (choix == 2) {
                monMenu.entrerNom();
                String nomDonnee = monMenu.reponseEntrerNom();
                monGuerrier = new Guerrier(nomDonnee);
                typePersonnage = 2;
                // {choix 0:quitter le jeu}
            } else if (choix == 0) {
                return;
            }
            //* Boolean demarre qui sert à boucler sur le demarrer jeu
            boolean demarre = false;
            //Tant que demarre est faux
            while (!demarre) {
                //montrer le menu des détails
                monMenu.showMenuDetailsPerso();
                //récupérer les entrées clavier
                choix = monMenu.reponseMenuInt();
                //{Choix 1: afficher détails personnage}
                if (choix == 1) {
                    //type de personnage 1=magicien
                    if (typePersonnage == 1) {
                        //affiche les détails du magicien
                        System.out.println(monMagicien.toString());
                    }
                    //type de personnage 2=guerrier
                    else if (typePersonnage == 2) {
                        //affiche les détails du guerrier
                        System.out.println(monGuerrier.toString());
                    }
                }
                //{choix 2:modifier détails du personnage}
                else if (choix == 2) {
                    //type de personnage 1: magicien
                    if (typePersonnage == 1) {
                        //modifier les détails du magicien
                        monMenu.modifierDetailsMagicien(monMagicien);
                    }
                    //type de personnage 2: guerrier
                    else if (typePersonnage == 2) {
                        //modifier les détails du guerrier
                        monMenu.modifierDetailsGuerrier(monGuerrier);
                    }
                }
                //{choix 3: demarrer jeu}
                else if (choix == 3) {
                    //on declare un boolean demarre sur true => le jeu se lance, tant que ce boolean est true
                    demarre = true;
                }
            }

            //si demarre est vrai
            if (demarre) {
                //alors le boolean quitter est vrai
                boolean quitter = false;
                //tant que quitter est faux
                while (!quitter) {
                    //on lance demarrerJeu();
                    demarrerJeu();
                    //on montre le menu Continuer ou Quitter
                    monMenu.showMenuContinuerOuQuitter();
                    // on recupère l'entrée de l'utilisateur
                    choix = monMenu.reponseMenuInt();
                    //{Si choix 2: Quitter}
                    if (choix == 2) {
                        // On passe le booleen quitter à true
                        quitter = true;
                    }
                }
                //Si demarre est faux
            } else {
                //on quitte le jeu
                return;
            }
        }

    // {Choix 1: creation de personnage, Choix 0: Quitter le jeu}
        return;
}


    public void demarrerJeu() {
        // * Je creer un nouveau plateau *
        Plateau monPlateau = new Plateau();
        // * Tant que la case de mon joueur est inférieur aux cases totales du plateau, je continue des tours de jeu (jeu étant une méthode dans Plateau.java)
        monPlateau.jeu(typePersonnage);
    }
}





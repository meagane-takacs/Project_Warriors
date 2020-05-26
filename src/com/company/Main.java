package com.company;

import com.company.equipement_magicien.BouleDeFeu;
import com.company.equipement_magicien.Eclair;
import com.company.personnages.Guerrier;
import com.company.personnages.Magicien;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConnectionBase connection = new ConnectionBase();
        connection.connect();

        //getHeroes
        //connection.getHeroes();

        //getHero
        //connection.getHero(2);

        //createPerso
//        Magicien magicien = new Magicien();
//        connection.createHero(magicien);

        //update
//        Magicien magicien = new Magicien();
//        connection.updateHero(magicien, 1);
//        System.out.println(magicien.getNomPerso());


        //delete
        connection.deleteHero(8);


        Game game = new Game();
        game.start();


    }

}





package com.company;
import com.company.Benutzer.Benutzer;
import com.company.Sport.Leichtathletik.Hindernislauf;
import com.company.Sport.Leichtathletik.Hochsprung;
import com.company.Sport.Mannschaftssport.Basketball;
import com.company.Sport.Mannschaftssport.Fussbal;
import com.company.Sport.Sport;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //cream sporturi
        Sport football = new Fussbal();
        Sport basketball = new Basketball();
        Sport highjJump = new Hochsprung();
        Sport obstacleRace = new Hindernislauf();

        //cream benutzeri
        Benutzer b1 = new Benutzer("Sergiu", "Campeanu",  List.of(football, basketball, basketball, obstacleRace, football));
        Benutzer b2 = new Benutzer("Sergiu", "Campeanu", List.of());

        //afisam rezultatele
        System.out.println(football.KalkuliereZeit());
        System.out.println(basketball.KalkuliereZeit());
        System.out.println(highjJump.KalkuliereZeit());
        System.out.println(obstacleRace.KalkuliereZeit());
        System.out.println(football.KalkuliereZeit());
        System.out.println(b1.KalkuliereZeit());
        System.out.println(b1.KalkuliereZeitDurchschnittzeit());
        System.out.println(b2.KalkuliereZeitDurchschnittzeit());

    }
}
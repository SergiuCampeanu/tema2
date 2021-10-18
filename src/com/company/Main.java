package com.company;
import com.company.Sport.Leichtathletik.Hindernislauf;
import com.company.Sport.Leichtathletik.Hochsprung;
import com.company.Sport.Mannschaftssport.Basketball;
import com.company.Sport.Mannschaftssport.Fussbal;
import com.company.Sport.Sport;

public class Main {

    public static void main(String[] args) {

        Sport football = new Fussbal();
        Sport basketball = new Basketball();
        Sport highjJump = new Hochsprung();
        Sport obstacleRace = new Hindernislauf();

        football.KalkuliereZeit();
        basketball.KalkuliereZeit();
        highjJump.KalkuliereZeit();
        obstacleRace.KalkuliereZeit();
    }
}
package com.company.Benutzer;
import com.company.Sport.Leichtathletik.Hindernislauf;
import com.company.Sport.Leichtathletik.Hochsprung;
import com.company.Sport.Mannschaftssport.Basketball;
import com.company.Sport.Mannschaftssport.Fussbal;
import com.company.Sport.Sport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * clasa de teste pentru Benutzer
 *
 * @author sncam
 * @see Benutzer
 */
class BenutzerTest {

    private Benutzer b1;
    private Benutzer b2;
    private Benutzer b3;

    @org.junit.jupiter.api.BeforeEach  //cu before all imi cere ca create sa fie static sa fie statica
    void create(){
        Sport f = new Fussbal(); //65
        Sport b = new Basketball();  //55
        Sport o = new Hindernislauf(); //30
        Sport h = new Hochsprung();  //20

        b1 = new Benutzer("vorName1", "nachName1", List.of(f,b,o,h,b));  //cream benutzeri noi
        b2 = new Benutzer("vorName2", "nachName2", List.of(f,b,b,f));
        b3 = new Benutzer("vorName3", "nachName3", List.of());

    }

    @org.junit.jupiter.api.Test
    void kalkuliereZeit() { //testam functia de calcul a timpului total pentru fiecare benutzer
        Assertions.assertEquals(225, b1.kalkuliereZeit());
        Assertions.assertEquals(240, b2.kalkuliereZeit());
        Assertions.assertEquals(0, b3.kalkuliereZeit());

    }

    @org.junit.jupiter.api.Test
    void testKalkuliereZeit() { //testam functia de calcul a timpului pentru fiecare sport imparte
        Sport f = new Fussbal(); //65
        Sport b = new Basketball();  //55
        Sport o = new Hindernislauf(); //30
        Sport h = new Hochsprung();  //20

        Assertions.assertEquals(65, b1.kalkuliereZeit(f));
        Assertions.assertEquals(55, b1.kalkuliereZeit(b));
        Assertions.assertEquals(30, b1.kalkuliereZeit(o));
        Assertions.assertEquals(20, b1.kalkuliereZeit(h));
    }

    @org.junit.jupiter.api.Test
    void kalkuliereZeitDurchschnittzeit() {  //testam timpul mediu
        Assertions.assertEquals(45, b1.kalkuliereZeitDurchschnittzeit()); // 225/5=45
        Assertions.assertEquals(60, b2.kalkuliereZeitDurchschnittzeit()); // 240/4 = 60
        Assertions.assertEquals(0, b3.kalkuliereZeitDurchschnittzeit());  // list.of este gol deci 0

    }

    @Test
    void getVorName() {  //testam functia de getvorname care returneaza vorname a benutzer
        Benutzer b1 = new Benutzer("VorName1","NachName1", List.of());
        Benutzer b2 = new Benutzer("VorName2","NachName2", List.of());

        Assertions.assertEquals(b1.getVorName(), "VorName1");
        Assertions.assertEquals(b2.getVorName(), "VorName2");

    }

    @Test
    void setVorName() { //testam functia de setvorname care schimba vorname a benutzerului
        Benutzer b1 = new Benutzer("VorName1","NachName1", List.of());
        Benutzer b2 = new Benutzer("VorName2","NachName2", List.of());

        b1.setVorName("VorName1Test");
        b2.setVorName("VorName2Test");

        Assertions.assertEquals(b1.getVorName(), "VorName1Test");
        Assertions.assertEquals(b2.getVorName(), "VorName2Test");

    }
}
package com.company.Benutzer;
import com.company.Benutzer.Benutzer;
import com.company.Sport.Leichtathletik.Hindernislauf;
import com.company.Sport.Leichtathletik.Hochsprung;
import com.company.Sport.Mannschaftssport.Basketball;
import com.company.Sport.Mannschaftssport.Fussbal;
import com.company.Sport.Sport;
import org.junit.jupiter.api.Assertions;
import java.util.List;


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

        b1 = new Benutzer("vorName1", "nachName1", List.of(f,b,o,h,b));
        b2 = new Benutzer("vorName2", "nachName2", List.of(f,b,b,f));
        b3 = new Benutzer("vorName3", "nachName3", List.of());

    }

    @org.junit.jupiter.api.Test
    void kalkuliereZeit() {
        Assertions.assertEquals(225, b1.KalkuliereZeit());
        Assertions.assertEquals(240, b2.KalkuliereZeit());
        Assertions.assertEquals(0, b3.KalkuliereZeit());

    }

    @org.junit.jupiter.api.Test
    void testKalkuliereZeit() {
        Sport f = new Fussbal(); //65
        Sport b = new Basketball();  //55
        Sport o = new Hindernislauf(); //30
        Sport h = new Hochsprung();  //20

        Assertions.assertEquals(65, b1.KalkuliereZeit(f));
        Assertions.assertEquals(55, b1.KalkuliereZeit(b));
        Assertions.assertEquals(30, b1.KalkuliereZeit(o));
        Assertions.assertEquals(20, b1.KalkuliereZeit(h));
    }

    @org.junit.jupiter.api.Test
    void kalkuliereZeitDurchschnittzeit() {
        Assertions.assertEquals(45, b1.KalkuliereZeitDurchschnittzeit()); // 225/5=45
        Assertions.assertEquals(60, b2.KalkuliereZeitDurchschnittzeit()); // 240/4 = 60
        Assertions.assertEquals(0, b3.KalkuliereZeitDurchschnittzeit());  // list.of este gol deci 0

    }
}
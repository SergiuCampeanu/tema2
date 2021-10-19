package com.company.Benutzer;
import com.company.Sport.Sport;
import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport){ //constructor
        this.vorName=vorName;
        this.nachName=nachName;
        this.sport=sport;
    }

    public double KalkuliereZeit(){
        double sum = 0;
        for (Sport x:sport) {  //un foreach care parcurge toata lista
            sum=sum+x.KalkuliereZeit(); //toate sporturile se aduna la sum
        }
        return sum;  //returnam suma
    }

    public double KalkuliereZeit(Sport x){
        double sum = 0;
        sum = x.KalkuliereZeit(); //suma ia valoarea la fiecare return din fiecare class
        return sum;//returnam suma
    }

    public double KalkuliereZeitDurchschnittzeit(){
        double sum = 0;
        sum=KalkuliereZeit();
        if(sport.isEmpty()) //verificam daca lista este goala
        {
            return 0;  //daca da returnam 0
        }
        else
        {
            return sum / sport.size(); //returnam suma impartita la size
        }
    }

    //getter si setter
    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

}

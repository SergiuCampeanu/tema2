package com.company.Benutzer;
import com.company.Sport.Sport;
import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport){
        this.vorName=vorName;
        this.nachName=nachName;
        this.sport=sport;
    }

    public double KalkuliereZeit(){
        double sum = 0;
        for (Sport x:sport) {
            sum=sum+x.KalkuliereZeit();
        }
        return sum;
    }

    public double KalkuliereZeit(Sport x){
        double sum = 0;
        sum = x.KalkuliereZeit();
        return sum;
    }

    public double KalkuliereZeitDurchschnittzeit(){
        double sum = 0;
        sum=KalkuliereZeit();
        if(sport.isEmpty())
        {
            return 0;
        }
        else
        {
            return sum / sport.size();
        }
    }

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

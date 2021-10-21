package com.company.Benutzer;
import com.company.Sport.Sport;
import java.util.List;

/**
 * Benutzer este o interfata ca si un user in care putem apela functiile de kaluliereZeite a unui sport individual sau cu o lista de sporturi
 *
 * @author sncam
 */
public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    /**
     * Aceasta este Constructorul
     *
     * @param vorName
     * @param nachName
     * @param sport
     */
    public Benutzer(String vorName, String nachName, List<Sport> sport){
        this.vorName=vorName;
        this.nachName=nachName;
        this.sport=sport;
    }

    /**
     * Aceasta metoda calculeaza suma totala a sporturilor  diin lista
     *
     * @return
     */
    public double kalkuliereZeit(){
        double sum = 0;
        for (Sport x:sport) //un foreach care parcurge toata lista
        {
            sum=sum+x.kalkuliereZeit(); //toate sporturile se aduna la sum
        }
        return sum;  //returnam suma
    }

    /**
     * Aceasta metoda calculeaza timpul pentru fiecare sport in parte
     *
     * @param x
     * @return
     */

    public double kalkuliereZeit(Sport x){
        double sum = 0;
        sum = x.kalkuliereZeit(); //suma ia valoarea la fiecare return din fiecare class
        return sum;//returnam suma
    }

    /**
     * Aceasta metoda calculeaza media aritmetica a sporturilor din lista
     *
     * @return
     */
    public double kalkuliereZeitDurchschnittzeit(){
        double sum = 0;
        sum=kalkuliereZeit();
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

    /**
     * getter
     *
     * @return
     */
    public String getVorName() {
        return vorName;
    }

    /**
     * setter
     *
     * @param vorName
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    /**
     * getter
     *
     * @return
     */
    public String getNachName() {
        return nachName;
    }

    /**
     * setter
     *
     * @param nachName
     */
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    /**
     * getter
     *
     * @return
     */
    public List<Sport> getSport() {
        return sport;
    }

    /**
     * setter
     *
     * @param sport
     */
    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

}

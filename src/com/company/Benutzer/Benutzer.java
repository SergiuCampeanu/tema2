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
    private List<Sport> sports;

    /**
     * Aceasta este Constructorul
     *
     * @param vorName
     * @param nachName
     * @param sports
     */
    public Benutzer(String vorName, String nachName, List<Sport> sports){
        this.vorName=vorName;
        this.nachName=nachName;
        this.sports=sports;
    }

    /**
     * Aceasta metoda calculeaza suma totala a sporturilor  diin lista
     *
     * @return suma
     */
    public double kalkuliereZeit(){
        double sum = 0;
        for (Sport sport:sports) //un foreach care parcurge toata lista
        {
            sum=sum+sport.kalkuliereZeit(); //toate sporturile se aduna la sum
        }
        return sum;  //returnam suma
    }

    /**
     * Aceasta metoda calculeaza timpul pentru fiecare sport in parte
     *
     * @param sport object sport
     * @return suma
     */

    public double kalkuliereZeit(Sport sport){
        double sum = 0;
        sum = sport.kalkuliereZeit(); //suma ia valoarea la fiecare return din fiecare class
        return sum;//returnam suma
    }

    /**
     * Aceasta metoda calculeaza media aritmetica a sporturilor din lista
     *
     * @return suma imaprtita la nr de sporturi
     */
    public double kalkuliereZeitDurchschnittzeit(){
        double sum = 0;
        sum=kalkuliereZeit();
        if(sports.isEmpty()) //verificam daca lista este goala
        {
            return 0;  //daca da returnam 0
        }
        else
        {
            return sum / sports.size(); //returnam suma impartita la size
        }
    }

    //getter si setter

    /**
     * getter
     *
     * @return vorname
     */
    public String getVorName() {
        return vorName;
    }

    /**
     * setter
     *
     * @param vorName name of the benutzer
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    /**
     * getter
     *
     * @return nach name
     */
    public String getNachName() {
        return nachName;
    }

    /**
     * setter
     *
     * @param nachName of the benutzer
     */
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    /**
     * getter
     *
     * @return sports
     */
    public List<Sport> getSport() {
        return sports;
    }

    /**
     * setter
     *
     * @param sport sport of the benutzer
     */
    public void setSport(List<Sport> sport) {
        this.sports = sport;
    }

}

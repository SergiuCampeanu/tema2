package com.company.Sport.Mannschaftssport;
import com.company.Sport.Sport;

/**
 * clasa Mannschaftssport este abstracta deoarece nu este instantiata
 *
 * @author sncam
 * @see Sport
 */
abstract class  Mannschaftssport implements Sport {

    /**
     * Metoda de kalkuliereZeit
     *
     */
    @Override
    public abstract double kalkuliereZeit(); //doar declaram metoda astract deoarece nu are implementare
}

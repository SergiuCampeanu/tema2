package com.company.Sport.Leichtathletik;
import com.company.Sport.Sport;

/**
 * clasa Leichtathletik este abstracta deoarece nu este instantiata
 *
 * @author sncam
 * @see Sport
 */
abstract class Leichtathletik implements Sport {

    /**
     * Metoda de kalkuliereZeit
     *
     * @return
     */
    @Override
    public abstract double kalkuliereZeit(); //doar declaram metoda astract deoarece nu are implementare
}

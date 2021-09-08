package com.gluegun.kata8;

/**
 * Nathan loves cycling.
 * <p>
 * Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
 * <p>
 * You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
 * <p>
 * For example:
 * <p>
 * time = 3 ----> litres = 1
 * <p>
 * time = 6.7---> litres = 3
 * <p>
 * time = 11.8--> litres = 5
 */
public class KeepHydrated {

    public int Liters(double time) {
        return (int) (time * 0.5);
    }

}

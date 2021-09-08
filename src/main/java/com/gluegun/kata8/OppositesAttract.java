package com.gluegun.kata8;

/**
 * Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
 * <p>
 * Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
 */
public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        boolean firstFlower = flower1 % 2 == 0;
        boolean secondFlower = flower2 % 2 == 0;
        return firstFlower ^ secondFlower;
    }


}

package com.company;
import java.util.*;
/**
 * Created by fv799 on 10/9/18.
 */
public class NumberGen {

    public int number;
    public NumberGen (int r){ number = r;}
    public static int RandomNumber ()
    {
        Random rand = new Random ();
        int n = rand.nextInt(100)+1;
        int h = (int)Math.pow(n,2);
            return h;
    }
}

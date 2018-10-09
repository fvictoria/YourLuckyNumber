package com.company;
import java.util.*;
/**
 * Created by fv799 on 10/9/18.
 */
public class NumberGen {

    public int number;
    public NumberGen (int r){ number = r;}
    public int RandomNumber ()
    {
        Random rand = new Random ();
        int n = rand.nextInt(10)+5;
        return n;
    }
}

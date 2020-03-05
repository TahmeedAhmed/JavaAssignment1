package com.nttdata.ta.task1;

public class TestIfElse {

    private int x = 10;

    public void testIfElse(int a){
        if (a > x) System.out.println(a + " is more than x (10)");
        else System.out.println(a + " isn't more than x (10)");
    }
}

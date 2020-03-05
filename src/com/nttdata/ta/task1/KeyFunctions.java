package com.nttdata.ta.task1;

public class KeyFunctions {
    private int x = 10;

    public void testForLoop(){
        int local = 5;
        for(int i=0; i<x; i++ ){
            local ++;
        }
        System.out.println(local);
    }

    public void testWhileLoop(){
        int local = 5;
        int i = 0;
        while (i < x){
            local ++;
            i++;
        }
        System.out.println(local);
    }

    public void testDoWhile(){
        int local = 5;
        int i=0;
        do {
            local++;
            i++;
        }while (i < x);
        System.out.println(local);
    }
}

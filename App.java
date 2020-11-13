package com.cimpa;

public class App {
    private final int lower;
    private final int upper;

    public App(final int lower, final int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public int evaluate(final int where) {

        if(where<lower && where>0){
            return -1;
        }
        if(where>upper){
            return 1;
        }
        if(where==lower || where==upper){
            return where;
        }

        if(where>lower && where<upper){
            return 0;
        }

        return 0;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        int[] tab;
        tab = new int[11];

        int i = 1;
        do {
            tab[i] = 10*i;
            i++;
            System.out.println(tab[i-1]);
        }
        while (i <= tab.length-1);
    }
}

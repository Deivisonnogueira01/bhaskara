package com.ifms.raiz.model;

public class Bhaskara {
    
    public double delta(int a, int b , int c){
        return Math.pow(b, 2)-(4*a*c);
    }

    public double denomidador(int a){
        return 2*a;
    }

    public double numeradorX1(int a , int b , int c){
        return -b+ Math.sqrt(delta(a, b, c));
    }

    public double numeradorx2(int a, int b, int c){
        return -b+ Math.sqrt(delta(a, b, c));
    }

    public double x1(int a, int b, int c){
        return numeradorX1(a, b, c)/denomidador(a);
    }

    public double x2(int a , int b, int c ){
        return numeradorx2(a, b, c)/denomidador(a);
    }

     public void print(int a, int b , int c){
        if(delta(a, b, c) == 0){
            System.out.println("x1 = x2 = "+ x1(a, b, c));
        }

      
    }
}

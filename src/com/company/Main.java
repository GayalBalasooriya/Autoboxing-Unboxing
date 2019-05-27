package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strArraylist = new ArrayList<>();
        strArraylist.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(56);

        Double doubleValue = new Double(12.25);



        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }
        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }



        Integer myValue = 56; //Integer.valueOf(56);



        ArrayList<Double> dbl = new ArrayList<Double>();
        for (double i=0; i<=10; i++) {
            dbl.add(i); //dbl.add(Double.valueOf(i));
        }
        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + dbl.get(i));
            //System.out.println(i + " --> " + dbl.get(i).doubleValue());
        }

    }
}

package com.java.homework.bit;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> anythingAtAll = new ArrayList<>();

        anythingAtAll.add(7);
        anythingAtAll.add("katinukas");
        anythingAtAll.add("ar");
        anythingAtAll.add(new Object());
        anythingAtAll.add("raibas");
        anythingAtAll.add("fazanas");
        anythingAtAll.add(new ArrayList<>());
        anythingAtAll.add("moki");
        anythingAtAll.add(-5);
        anythingAtAll.add("septyni");
        anythingAtAll.add("java");
        anythingAtAll.add(Math.random());
        anythingAtAll.add(null);
        anythingAtAll.add(5);

//        HelperCLass.tryCatchNumbers(anythingAtAll);
//        HelperCLass.numbersSum(anythingAtAll);
//        int result = HelperCLass.numbersSum(anythingAtAll);
//        System.out.println(result);

        HelperCLass.stringOnly(anythingAtAll);
        HelperCLass.hwoIsHwo(anythingAtAll);

        ///test after commit


        }

    }



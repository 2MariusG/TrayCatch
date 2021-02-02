package com.java.homework.bit;

import java.util.ArrayList;

public class HelperCLass {

    public static void tryCatchNumbers(ArrayList<Object> masyvas) {
        for (int i = 0; i < masyvas.size(); i++) {
            try {
                int sk = (int) masyvas.get(i);
                System.out.println(sk);
            }catch (Exception e){
                System.out.println(i+ "-tasis masyvo elementas nera skaicius.");
            }
            }
        }
    public static int numbersSum (ArrayList<Object> masyvas) {

        int suma = 0;
        for (int i = 0; i < masyvas.size(); i++) {
            try {
                int sk = (int) masyvas.get(i);
                suma += sk;
            }catch (Exception e){
            }
        }
        return suma;
    }
    public static void stringOnly(ArrayList<Object> masyvas) {
        for (int i = 0; i < masyvas.size(); i++) {
            try {
                String stringai = (String) masyvas.get(i);
                if (stringai.length() <= 4 )
                System.out.println(stringai + " -- tai yra tik zodziai");
            }catch (Exception e){
//                System.out.println(i+ "-tasis masyvo elementas yra skaicius.");
            }
        }
    }
    public static void hwoIsHwo(ArrayList<Object> masyvas) {
        for (int i = 0; i < masyvas.size(); i++) {
            try {
                if (masyvas.get(i) == null) {
                    System.out.println("null");
                }
            }
                    catch (Exception y){
                }

                try {
                    String mixas = (String) masyvas.get(i);
                    System.out.println("*zodziai*");
                } catch (Exception e) {
                    try {
                        int mixas = (int) masyvas.get(i);
                        System.out.println("-Skaiciai-");
                    } catch (Exception f) {
                        try {
                            if (masyvas.get(i) instanceof Object)
                                System.out.println("!Objektas!");
                        } catch (Exception d) {
                            System.out.println("kazkas kitOOO");

                        }

                    }

                }

        }
    }


}


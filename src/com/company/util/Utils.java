package com.company.util;

import java.time.LocalDateTime;

public class Utils {
    static public int comparaFechas(String f1, String f2){
        // f1 = '01/02/2000'

        LocalDateTime ldt1 = LocalDateTime.parse(f1);
        LocalDateTime ldt2 = LocalDateTime.parse(f2);

        return ldt1.compareTo(ldt2);

//        try {
//            String[] partesF1 = f1.split("/");
//            int diaF1 = Integer.parseInt(partesF1[0]);
//            int mesF1 = Integer.parseInt(partesF1[1]);
//            int anyoF1 = Integer.parseInt(partesF1[2]);
//
//
//            String[] partesF2 = f2.split("/");
//            int diaF2 = Integer.parseInt(partesF2[0]);
//            int mesF2 = Integer.parseInt(partesF2[1]);
//            int anyoF2 = Integer.parseInt(partesF2[2]);
//
//            if (anyoF1 > anyoF2 || mesF1 > mesF2 || diaF1 > diaF2){
//                return true;
//            }else{
//                return false;
//            }
//        }catch(Exception e){
//            return false;
//        }
//
//        // si f1 > f2 return true else reutrn false
    }
}

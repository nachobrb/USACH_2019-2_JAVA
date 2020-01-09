/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import static java.lang.Double.max;
import java.lang.*;


/**
 *
 * @author ignacio
 */

public class lab2 {
    public static String contar(String str) {
        if (str.length() == 0) {
            return "";
        }

        int maxima_ocurrencia = 0;
        String caracter = new String();
        int j = 0;
        int count = 0;
        
        for (j = 0;j < 10;j++) {
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (("" + str.charAt(i)).equals(String.valueOf(j)) == true) {
                   count++;
                }
            }
            if (count > maxima_ocurrencia) {
                maxima_ocurrencia = count;
                caracter = String.valueOf(j);
            }
        }
        return "Máxima ocurrencia " + str + ": Número = " + caracter + ", ocurrencia = " + String.valueOf(maxima_ocurrencia);
    }
    public static int esPar(double n) {
        if(n == 0) return 0;
        else {
            if(n % 2 == 0.0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
    
    public static String pregunta1(String btn){
        if(btn != null) {
            int[][] matriz = new int[10][10];
            String matrix = new String();

            for(int i = 0;i < 10;i++) {
                for(int j = 0;j < 10;j++) {
                    matriz[i][j] = (i+1)*(j+1);
                }
            }

            matrix = 
                "<table border=\"1\">" +
                    "<tbody>" +
                        "<tr>" +
                            "<td>0</td>" +
                            "<td>1</td>" +
                            "<td>2</td>" +
                            "<td>3</td>" +
                            "<td>4</td>" +
                            "<td>5</td>" +
                            "<td>6</td>" +
                            "<td>7</td>" +
                            "<td>8</td>" +    
                            "<td>9</td>" +
                            "<td>10</td>" +
                        "</tr>";
            for(int i = 0;i < 10;i++) {
                matrix = 
                    matrix + 
                    "<tr>" +
                        "<td>" + String.valueOf(i+1) + "</td>" +
                        "<td>" + String.valueOf(matriz[i][0]) + "</td>" +
                        "<td>" + String.valueOf(matriz[i][1]) + "</td>" +
                        "<td>" + String.valueOf(matriz[i][2]) + "</td>" +
                        "<td>" + String.valueOf(matriz[i][3]) + "</td>" +
                        "<td>" + String.valueOf(matriz[i][4]) + "</td>" +
                        "<td>" + String.valueOf(matriz[i][5]) + "</td>" +
                        "<td>" + String.valueOf(matriz[i][6]) + "</td>" +
                        "<td>" + String.valueOf(matriz[i][7]) + "</td>" +
                        "<td>" + String.valueOf(matriz[i][8]) + "</td>" +
                        "<td>" + String.valueOf(matriz[i][9]) + "</td>" +
                    "</tr>";
            }
            return (
                // TODO: Remplazar por operaciones optimas
                matrix
            ); 
        }
        return "";
    }
    
    public static String pregunta2(String c1, String c2, String c3, String c4, String c5){
        if(c1 == null&&c2 == null&&c3 == null&&c4 == null&&c5 == null){
            return "";
        }
        if(c1 == null) {
            c1 = "";
        }
        if(c2 == null) {
            c2 = "";
        }
        if(c3 == null) {
            c3 = "";
        }
        if(c4 == null) {
            c4 = "";
        }
        if(c5 == null) {
            c5 = "";
        }
        return (
            "<div class=\"container\">" +
                "<div class=\"md-form mb-4 pink-textarea active-pink-textarea disabled\">" +
                    "<textarea id=\"form7\" class=\"md-textarea form-control\" rows=\"4\">" +
                        "Cadena 1: " + c1.replaceAll("[AaEeIiOoUu]", "") + 
                        "\nCadena 2: " + c2.replaceAll("[AaEeIiOoUu]", "") + 
                        "\nCadena 3: " + c3.replaceAll("[AaEeIiOoUu]", "") + 
                        "\nCadena 4: " + c4.replaceAll("[AaEeIiOoUu]", "") + 
                        "\nCadena 5: " + c5.replaceAll("[AaEeIiOoUu]", "") + 
                    "</textarea>" +
                "</div>" +  
            "</div>"
        );
    }


    public static String pregunta3(String c1, String c2, String c3){
        if(c1 == null&&c2 == null&&c3 == null){
            return "";
        }
        if(c1 == null) {
            c1 = "";
        }
        if(c2 == null) {
            c2 = "";
        }
        if(c3 == null) {
            c3 = "";
        }
        return (
            "<div class=\"container\">" +
                "<div class=\"md-form mb-4 pink-textarea active-pink-textarea disabled\">" +
                    "<textarea id=\"form7\" class=\"md-textarea form-control\" rows=\"4\">" +
                        contar(c1) + 
                        "\n" + contar(c2) + 
                        "\n" + contar(c3) + 
                    "</textarea>" +
                "</div>" +  
            "</div>"
        );
    }

    public static String pregunta4(String c1, String c2, String c3, String c4){
        if(c1 == null&&c2 == null&&c3 == null&&c4 == null){
            return "";
        }
        if(c1 == null) {
            c1 = "";
        }
        if(c2 == null) {
            c2 = "";
        }
        if(c3 == null) {
            c3 = "";
        }
        if(c4 == null) {
            c4 = "";
        }
        String str = new String();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int countMax = 0;

        for (int i = 0;i < c1.length();i++){
            if (esPar(( Integer.parseInt("" + c1.charAt(i)))) == 1){
                count1++;
            }
        }
        for (int i = 0;i < c2.length();i++){
            if (esPar(( Integer.parseInt("" + c2.charAt(i)))) == 1){
                count2++;
            }
        }
        for (int i = 0;i < c3.length();i++){
            if (esPar(( Integer.parseInt("" + c3.charAt(i)))) == 1){
                count3++;
            }
        }
        for (int i = 0;i < c4.length();i++){
            if (esPar(( Integer.parseInt("" + c4.charAt(i)))) == 1){
                count4++;
            }
        }
        countMax = (int) max(max(max(count1,count2),count3),count4);

        if(count1 == countMax) {
            str =  str + "Número = " + c1 + ", cantidad = " + countMax + "\n";
        }
        if(count2 == countMax) {
            str =  str + "Número = " + c2 + ", cantidad = " + countMax + "\n";
        }
        if(count3 == countMax) {
            str =  str + "Número = " + c3 + ", cantidad = " + countMax + "\n";
        }
        if(count4 == countMax) {
            str =  str + "Número = " + c4 + ", cantidad = " + countMax + "\n";
        }


        return (
            "<div class=\"container\">" +
                "<div class=\"md-form mb-4 pink-textarea active-pink-textarea disabled\">" +
                    "<textarea id=\"form7\" class=\"md-textarea form-control\" rows=\"4\">" +
                        str + 
                    "</textarea>" +
                "</div>" +  
            "</div>"
        );
    }

    public static String ecripta(String str, int n){
        String strTmp = str.toUpperCase();
        String newStr = new String();
        
        for(int i = 0;i < strTmp.length();i++) {
            if((int)(strTmp.charAt(i)) <= 90 - n){
                char tmp = (char) (str.charAt(i) + n);
                String tmp2 = "" + tmp;
                newStr = newStr + tmp2;
            }
            else {
                char tmp = (char) (str.charAt(i) + n - 26);
                String tmp2 = "" + tmp;
                newStr = newStr + tmp2;
            }
        }
        return newStr;
    }


    public static String pregunta5(String c1, String c2, String c3, String c4, String c5){
        if(c1 == null&&c2 == null&&c3 == null&&c4 == null&&c5 == null){
            return "";
        }
        String str = new String();

        if(c1 == null) {
            c1 = "";
        }
        if(c2 == null) {
            c2 = "";
        }
        if(c3 == null) {
            c3 = "";
        }
        if(c4 == null) {
            c4 = "";
        }
        if(c5 == null) {
            c5 = "";
        }

        if(c1 != "") {
            str =  str + "Cadena RAW = " + c1 + ", Encriptada = " + ecripta(c1,5) + "\n";
        }
        if(c2 != "") {
            str =  str + "Cadena RAW = " + c2 + ", Encriptada = " + ecripta(c2,5) + "\n";
        }
        if(c3 != "") {
            str =  str + "Cadena RAW = " + c3 + ", Encriptada = " + ecripta(c3,5) + "\n";
        }
        if(c4 != "") {
            str =  str + "Cadena RAW = " + c4 + ", Encriptada = " + ecripta(c4,5) + "\n";
        }
        if(c5 != "") {
            str =  str + "Cadena RAW = " + c5 + ", Encriptada = " + ecripta(c5,5) + "\n";
        }


        return (
            "<div class=\"container\">" +
                "<div class=\"md-form mb-4 pink-textarea active-pink-textarea disabled\">" +
                    "<textarea id=\"form7\" class=\"md-textarea form-control\" rows=\"4\">" +
                        str + 
                    "</textarea>" +
                "</div>" +  
            "</div>"
        );
    }

}

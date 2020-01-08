/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import static java.lang.Math.pow;

/**
 *
 * @author ignacio
 */
public class lab1 {
    public static String pregunta1(String data) {
        if (data == null) {
            return "";
        }
        else {
            String newData = data;
            for(int i = 0;i < 29;i++) {
                newData = newData + data + " "; 
            }
            return (
                "<div class=\"container\">" +
                    "<div class=\"md-form mb-4 pink-textarea active-pink-textarea disabled\">" +
                        "<textarea id=\"form7\" class=\"md-textarea form-control\" rows=\"3\">" +
                            newData + 
                        "</textarea>" +
                    "</div>" +  
                "</div>"
            );
        }
        
    }
    
    public static String pregunta2(String P1, String P2, String P3) {
        // RESPUESTAS
        int p1 = 1;
        int p2 = 2;
        int p3 = 3;
        int res = 0;
        double nota = 0;
        
        // VERIFICA RESPUESTAS
        if(P1 != null) {
            if(p1 == Integer.parseInt(P1)){
                res = res + 1;
            }
        }
        if(P2 != null) {
            if(p2 == Integer.parseInt(P2)){
                res = res + 1;
            }
        }
        if(P3 != null) {
            if(p3 == Integer.parseInt(P3)){
                res = res + 1;
            }
        }
        
        // ESCALA
        if(res == 0) {
            nota = 0.0;
        }
        else if(res == 1) {
            nota = 3.5;
        }
        else if(res == 2) {
            nota = 4.5;
        }
        else if(res == 3) {
            nota = 7.0;
        }

        return (
            "<div class=\"container\">" +
                "<div class=\"md-form mb-4 pink-textarea active-pink-textarea disabled\">" +
                    "<textarea id=\"form7\" class=\"md-textarea form-control\" rows=\"1\">" +
                        "Tu nota es: " + String.valueOf(nota) +
                    "</textarea>" +
                "</div>" +  
            "</div>"
        );
        
        
    }
    
    public static String pregunta3(String n1, String n2, String n3) {
        if (n1 == null || n2 == null || n3 == null) {
            return "";
        }
        else {
            double int_n1 = Double.parseDouble(n1);
            double int_n2 = Double.parseDouble(n2);     
            double int_n3 = Double.parseDouble(n3); 
            double max;
            if (int_n1 > int_n2) {
                if (int_n1 > int_n3) {
                    max = int_n1;
                }
                else {
                    max = int_n3;
                }
            }
            else if (int_n2 > int_n3){
                max = int_n2;
            }
            else {
                max = int_n3;
            }
            return (
                "<div class=\"container\">" +
                    "<div class=\"md-form mb-4 pink-textarea active-pink-textarea disabled\">" +
                        "<textarea id=\"form7\" class=\"md-textarea form-control\" rows=\"1\">" +
                            "El mayor número es: " + String.valueOf(max) +
                        "</textarea>" +
                    "</div>" +  
                "</div>"
            );
        }
        
    }
    
    public static String pregunta4(String n1, String n2) {
        if (n1 == null || n2 == null) {
            return "";
        }
        else {
            double int_n1 = Double.parseDouble(n1);
            double int_n2 = Double.parseDouble(n2);                
            return (
                "<div class=\"container\">" +
                    "<div class=\"md-form mb-4 pink-textarea active-pink-textarea disabled\">" +
                        "<textarea id=\"form7\" class=\"md-textarea form-control\" rows=\"1\">" +
                            "El resultado es: " + String.valueOf(pow(int_n1,int_n2)) +
                        "</textarea>" +
                    "</div>" +  
                "</div>"
            );
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author ignacio
 */
public class lab2 {
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
        if(c1 == null ||c2 == null ||c3 == null ||c4 == null ||c5 == null){
            return "";
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
        if(c1 == null ||c2 == null ||c3 == null){
            return "";
        }
        return (
           ""
        );
    }
}

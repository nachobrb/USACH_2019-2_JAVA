/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import com.itextpdf.awt.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64;
import com.sun.tools.javac.util.Name.Table;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;


/**
 *
 * @author ignacio
 */

public class lab3 {

    public static String pregunta1(String btn){
        String str = "";
        if(btn != null) {
            Document document = new Document();            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            try {
                PdfWriter writer = PdfWriter.getInstance(document, baos);
                document.open();
                /* GENERACION ARCHIVO: DATA*/       
                // Page number
                int pageCount = writer.getPageNumber();
                Paragraph pgph = new Paragraph("Página " + String.valueOf(pageCount) + "\n\n");
                pgph.setAlignment(Element.ALIGN_CENTER);
                document.add(pgph);
                
                // Creating a table object 
                float [] pointColumnWidths = {150F, 150F, 150F}; 
                PdfPTable table = new PdfPTable(10); // 10 columns.
                for(int i = 0;i < 10;i++){
                    for(int j = 0; j < 10; j++){
                        PdfPCell cell = new PdfPCell(new Paragraph(String.valueOf(i+1) + ", " + String.valueOf(j+1)));
                        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                        table.addCell(cell);
                    }
                }
                
                
                document.add(table);


                
                
                
                
                
                
                
                /* FIN */
                document.close();
                writer.close();
                byte[] bytes = baos.toByteArray();
                str = Base64.encodeBytes(bytes);
            }
            catch (DocumentException e){
                e.printStackTrace();
            }
            // RETORNO GENÉRICO PARA LAS PREGUNTAS    
            return "<object data=\"data:application/pdf;base64," + str + "\" type=\"application/pdf\" width=\"100%\" height=\"1000px\"/>";
        }
        return str;
    }
    
    public static String pregunta2(String btn){
        String str = "";
        if(btn != null) {
            Document document = new Document();            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            try {
                PdfWriter writer = PdfWriter.getInstance(document, baos);
                document.open();
                /* GENERACION ARCHIVO: DATA*/       
                // Page number
                int pageCount = writer.getPageNumber();
                Paragraph pgph = new Paragraph("Página " + String.valueOf(pageCount) + "\n\n");
                pgph.setAlignment(Element.ALIGN_CENTER);
                document.add(pgph);
                
                // Creating a table object 
                float [] pointColumnWidths = {150F, 150F, 150F}; 
                PdfPTable table = new PdfPTable(10); // 10 columns.
                for(int i = 0;i < 10;i++){
                    for(int j = 0; j < 10; j++){
                        PdfPCell cell = new PdfPCell(new Paragraph(String.valueOf(i+1) + ", " + String.valueOf(j+1)));
                        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                        table.addCell(cell);
                    }
                }
                
                
                document.add(table);


                
                
                
                
                
                
                
                /* FIN */
                document.close();
                writer.close();
                byte[] bytes = baos.toByteArray();
                str = Base64.encodeBytes(bytes);
            }
            catch (DocumentException e){
                e.printStackTrace();
            }
            // RETORNO GENÉRICO PARA LAS PREGUNTAS    
            return "<object data=\"data:application/pdf;base64," + str + "\" type=\"application/pdf\" width=\"100%\" height=\"1000px\"/>";
        }
        return str;
    }
    
    public static String pregunta3(
            String btn, 
            String n1,  
            String n2,
            String n3,  
            String n4,  
            String n5,  
            String n6,  
            String n7,  
            String n8,
            String n9  
    ){
        String str = "";
        if(btn != null) {
            Document document = new Document();            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            try {
                PdfWriter writer = PdfWriter.getInstance(document, baos);
                document.open();
                /* GENERACION ARCHIVO: DATA*/       
                // Page number
                int pageCount = writer.getPageNumber();
                Paragraph pgph = new Paragraph("Página " + String.valueOf(pageCount) + "\n");
                pgph.setAlignment(Element.ALIGN_CENTER);
                document.add(pgph);
                
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate localDate = LocalDate.now();
                pgph = new Paragraph(dtf.format(localDate) + "\n\n");
                pgph.setAlignment(Element.ALIGN_CENTER);
                document.add(pgph);

                int[] numArray = new int[9];
                numArray[0] = Integer.parseInt(n1);
                numArray[1] = Integer.parseInt(n2);
                numArray[2] = Integer.parseInt(n3);
                numArray[3] = Integer.parseInt(n4);
                numArray[4] = Integer.parseInt(n5);
                numArray[5] = Integer.parseInt(n6);
                numArray[6] = Integer.parseInt(n7);
                numArray[7] = Integer.parseInt(n8);
                numArray[8] = Integer.parseInt(n9);
                Arrays.sort(numArray);
                for(int i = 8; i >= 0;i--) {
                    pgph = new Paragraph(String.valueOf(numArray[i]) + "\n");
                    pgph.setAlignment(Element.ALIGN_LEFT);
                    document.add(pgph);
                }

                /* FIN */
                document.close();
                writer.close();
                byte[] bytes = baos.toByteArray();
                str = Base64.encodeBytes(bytes);
            }
            catch (DocumentException e){
                e.printStackTrace();
            }
            // RETORNO GENÉRICO PARA LAS PREGUNTAS    
            return "<object data=\"data:application/pdf;base64," + str + "\" type=\"application/pdf\" width=\"100%\" height=\"1000px\"/>";
        }
        return str;
    }

}

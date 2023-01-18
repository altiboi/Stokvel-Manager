/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat2021;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import javax.swing.*;

/**
 *
 * @author Sims <your.name at your.org>
 */
public class MethodTest {

    /**
     * @param args the command line arguments
     */
    
    public static int checkAge(String DOB)
   {
     int year = Integer.parseInt(DOB.substring(0, DOB.indexOf("/")));
     int month = Integer.parseInt(DOB.substring(DOB.indexOf("/") + 1, DOB.lastIndexOf("/")));
     int day = Integer.parseInt(DOB.substring(DOB.lastIndexOf("/") + 1));
     LocalDate today = LocalDate.now();
     LocalDate dob = LocalDate.of(year, month, day);
     int age = Period.between(dob, today).getYears();
     
     return age;
   }
     public static String getDate()
   {
     LocalDate today = LocalDate.now();
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
     String date = sdf.format(Date.from(today.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
     
     return date;
   }
     
        public static String getDate1()
   {
   
     LocalDate today = LocalDate.now();
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
     String date = sdf.format(Date.valueOf(today));
     
     return date;
   }
     
    public static void main(String[] args) throws SQLException, ParseException 
    {
       DB db = new DB();
       
       String d = "1233/32/44";
       Tools t = new Tools();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       String date = sdf.format(d);
       System.out.println(date);
        //JOptionPane.showMessageDialog(null, t.getStokvelInfo("") , "STOKVEL INFO", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}

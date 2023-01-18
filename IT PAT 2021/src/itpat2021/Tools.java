/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat2021;

import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Scanner;

/**
 *
 * @author Sims <your.name at your.org>
 */
public class Tools 
{
   private static DB db; 
    
    //Used to check the age of a new user and confirm if they can use the application (users under the age of 16 cannot use the application). The Period and LocalDate functions are used to aid this method.
    public static boolean checkAge(String DOB)
   {
     int year = Integer.parseInt(DOB.substring(0, DOB.indexOf("/")));
     int month = Integer.parseInt(DOB.substring(DOB.indexOf("/") + 1, DOB.lastIndexOf("/")));
     int day = Integer.parseInt(DOB.substring(DOB.lastIndexOf("/") + 1));
     LocalDate today = LocalDate.now();
     LocalDate dob = LocalDate.of(year, month, day);
     int age = Period.between(dob, today).getYears();
     
       if (age < 16) 
       {
         return false;  
       }
       
     return true;
   }
    
   
   //Checks the database for a match of the login details inputted
   public boolean verifyLogin(String e, String p) throws SQLException
   {
     boolean valid = false;
   
           if (db.select("SELECT Email, Password FROM tblStokvelMembers WHERE Email = '" + e + "' AND Password = '" + p + "';").next()) 
           {
              valid = true; 
           }
       
     return valid;
   }
   
   //Checks the database to make sure the new user has a unique email. User email is the parameter.
   public boolean checkEmail(String e) throws SQLException
   {
     boolean valid = true;
     
       if (db.select("SELECT Email, Password FROM tblStokvelMembers WHERE Email = '" + e + "';").next())
       {
         valid = false; 
       }
     return valid;   
   }
   
   //Retruns current date as a string
     public static String getDate()
   {
     LocalDate today = LocalDate.now();
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
     String date = sdf.format(Date.valueOf(today));
     
     return date;
   }
    
   //Returns the appropriate help description requested by the user. Help data is stored in textfile. The help needed is the parameter
   public static String getHelpInfo(String h) throws FileNotFoundException
   {
      Scanner scFile = new Scanner(new File("help.txt"));
      boolean found = false;
      String description = "";
      String line = scFile.nextLine();
      
       while (scFile.hasNext() && found == false) 
       {
         Scanner scLine = new Scanner(line).useDelimiter("#");
         String help = scLine.next();
         String desc = scLine.next();
         
           if (help.equalsIgnoreCase(h)) 
           {
             description = desc; 
             found = true;
           }
       }
  
     return description;  
   }
   
   //Retrieves and returns important information about the stokvel. If the string parameter is not a stokvel name, the info of all stokvels is returned (Used for the JoinStokvelGUI Stokvel Info feature). If there is a valid parameter it will be used in the Manage Account GUI to display info about the user's personal stokvel
   public String getStokvelInfo(String s) throws SQLException
   {
     boolean found = false;
     ResultSet rs = db.select("SELECT * FROM tblStokvel;");
     String stokvel, payout, temp = "";
     int limit;
     double payment, collected;
             
       while (rs.next() && found == false) 
       {
         stokvel = rs.getString("Stokvel");
         payment = rs.getDouble("MonthlyPayment");
         limit = rs.getInt("MemberLimit");
         payout = rs.getString("PayoutStructure");
         collected = rs.getDouble("MoneyCollected");
         
         temp += "Stokvel: " + stokvel + "\nMonthly Payment: R" + payment + "\nPayout Structure: " + payout + "\nMember Limit: " + limit;
         
           if (stokvel.equalsIgnoreCase(s)) 
           {
             temp = "Stokvel: " + stokvel + "\nMonthly Payment: R" + payment + "\nPayout Structure: " + payout + "\nStokvel Balance: R" + collected + "\nTotalPayments: R";
             found = true;
           }
       }
       
     return temp;  
   }
   
}

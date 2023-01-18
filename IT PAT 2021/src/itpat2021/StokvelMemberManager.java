/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat2021;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

/**
 *
 * @author Sims <your.name at your.org>
 */
public class StokvelMemberManager 
{
//fields of StokvelMemberManager class, including StokvelMember array and DB object
   private StokvelMember smArr[] = new StokvelMember [10000];
   private int smSize = 0;
   private static DB db;
   
   //Constructor creates StovelMember array from existing data in database
   public StokvelMemberManager() throws SQLException
   {
     String email, password, name, surname, gender, bank, cellNo, stokvel;
     java.util.Date DOB; //instatiated as a java.util.Date to accept date 
     double payments;
     
     ResultSet rs = db.select("SELECT* FROM tblStokvelMembers;");
     
       while (rs.next()) 
       {
         email = rs.getString("Email");
         password = rs.getString("Password");
         name = rs.getString("Name");
         surname = rs.getString("Surname");
         DOB = rs.getDate("DOB");
         gender = rs.getString("Gender");
         bank = rs.getString("Bank");
         cellNo = rs.getString("CellphoneNumber");
         stokvel = rs.getString("Stokvel");
         payments = rs.getDouble("TotalPayments");
         
         LocalDate dob = DOB.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //casts DOB from Date to LocalDate
         
         smArr[smSize] = new StokvelMember(email, password, name, surname, dob, gender, bank, cellNo, stokvel, payments);
         smSize++;
       }
   }
   
   //Used to get all the User's details, if they already have an account. Returns a StokvelMember object and user email is the parameter
   public StokvelMember getDetails (String e)
   { 
       for (int i = 0; i < smSize; i++) 
       {
         if (smArr[i].getEmail().equalsIgnoreCase(e)) 
           {
             StokvelMember user = new StokvelMember(smArr[i].getEmail(), smArr[i].getPassword(), smArr[i].getName(), smArr[i].getSurname(), smArr[i].getDOB(), smArr[i].getGender(), smArr[i].getBank(), smArr[i].getCellNo(), smArr[i].getStokvel(), smArr[i].getPayments());
             return user;
           }  
       }
       
       return null;
   }
   
   //Adds new user to array and database. User information are the parameters(payments = 0 because they have not made a payment yet)
   public void addStokvelMember(String email, String password, String name, String surname, String DOB, String gender, String bank, String cellNo, String stokvel) throws SQLException
   {
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     String date = sdf.format(DOB);
     
     LocalDate dob = LocalDate.parse(date);//casts parameter DOB as a LocalDate
     smArr[smSize] = new StokvelMember(email, password, name, surname, dob, gender, bank, cellNo, stokvel, 0);
     smSize++;
     
     db.query("INSERT INTO tblStokvelMembers VALUES('" + email + "','" + password + "','" + name + "','" + surname + "',#"  + DOB + "#,'"  + gender + "','" + bank + "','" + cellNo + "','" + stokvel + "','" + 0 + ")" );
   }
   
   //returns all members of a particular stokvel as a string (creates a stokvel member list). User stokvel is the parameter.
   public String getStokvelMembers(String s)
   {
     String temp = "Members:\n";
       for (int i = 0; i < smSize; i++) 
       {
           if (smArr[i].getStokvel().equalsIgnoreCase(s)) 
           {
              temp += smArr[i].getName() + " " + smArr[i].getSurname() + "\n";
           }
       }
       
       return temp;
   }
   
   //Used to change the user's bank. Uses a search based algorithm to located specific user wanting to change their bank. Also, user email is used to uniquely identify users. New bank name and user email are the parameters.
   public void changeBank(String e, String b) throws SQLException
   {
     int i = 0;  
     boolean found = false; 
       while (found == false && i < smSize) 
       {
           if (smArr[i].getEmail().equalsIgnoreCase(e)) 
           {
             smArr[i].setBank(b);
             db.query("UPDATE tblStokvelMembers SET Bank = '" + b + "'" + "WHERE Email = '" + e + "';");
             found = true;
           }
         i++;  
       }   
   }
   
   //Used to change the user's stokvel and move their total payments value to the new stokvel. Similar search algorithm to changeBank. New stokvel name and user email are the parameters.
   public void changeStokvel(String e, String s) throws SQLException
   {
     int i = 0;  
     boolean found = false; 
       while (found == false && i < smSize) 
       {
           if (smArr[i].getEmail().equalsIgnoreCase(e)) 
           {
             db.query("UPDATE tblStokvels SET MoneyCollected = (MoneyCollected - " + smArr[i].getPayments() + ") WHERE Stokvel = '" + smArr[i].getStokvel() + "';");
             db.query("UPDATE tblStokvels SET MoneyCollected = (MoneyCollected + " + smArr[i].getPayments() + ") WHERE Stokvel = '" + s + "';");
             db.query("UPDATE tblStokvelMembers SET Stokvel = '" + s + "' WHERE Email = '" + e + "';");
             smArr[i].setStokvel(s);
             found = true;
           }
         i++;  
       } 
   }
   
   //Used to retrieve monthly payment figure from specific stokvel. User stokvel is the parameter
   public double getPayments(String s) throws SQLException
   {
       double payment = db.select("SELECT MonthlyPayment FROM tblStokvel WHERE Stokvel = '" + s + "';").getDouble("MonthlyPayment");
       return payment;  
   }
   
   //Used to add user payments to database and array. Uses getPayments() helper method to retrieve payments. User email and stokvel are the parameters
   public void addPayments(String e, String s) throws SQLException
   {
       for (int i = 0; i < smSize; i++) 
       {
         double payments = smArr[i].getPayments() + getPayments(s);
                 
           if (smArr[i].getEmail().equalsIgnoreCase(e)) 
           {
             smArr[i].setPayments(payments);
             db.query("UPDATE tblStokvelMembers SET TotalPayments = " + payments + "WHERE Email = '" + s + "';");
             db.query("UPDATE tblStokvel SET MoneyCollected = (MoneyCollected + " + getPayments(s) + ") WHERE Stokvel = '" + s + "';");
           }
       }
       
       db.query("INSERT INTO tblTransactions (Email, Stokvel, TransactionDate, TransactionAmount) VALUES ('" + e + "','" + s + "',#" + Tools.getDate() + "#, " + getPayments(s) + ");");
   }
    
}

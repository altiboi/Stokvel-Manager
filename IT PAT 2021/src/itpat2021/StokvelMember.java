/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat2021;

import java.time.*;

/**
 *
 * @author Sims <your.name at your.org>
 */
public class StokvelMember {
    
//Fields of StokvelMember class(User information)
    private String email;
    private String password;
    private String name;
    private String surname;
    private LocalDate DOB;
    private String gender;
    private String bank;
    private String cellno;
    private String stokvel;
    private double payments;
    
    //Instantiates StokvelMember objects
    public StokvelMember(String inE, String inP, String inN, String inS, LocalDate inDOB, String inG, String inB, String inC, String inSt, double inPay)
    {
        email = inE;
        password = inP;
        name = inN;
        surname = inS;
        DOB = inDOB;
        gender = inG;
        bank = inB;
        cellno = inC;
        stokvel = inSt;
        payments = inPay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String inE) 
    {
        email = inE;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String inP) {
        password = inP;
    }

    public String getName() {
        return name;
    }

    public void setName(String inN) {
        name = inN;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String inS) {
        surname = inS;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate inDOB) {
        DOB = inDOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String inG) {
        gender = inG;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String inB) {
        bank = inB;
    }

    public String getCellNo() {
        return cellno;
    }

    public void setCellNo(String inC) {
        cellno = inC;
    }

    public String getStokvel() {
        return stokvel;
    }

    public void setStokvel(String inSt) {
        stokvel = inSt;
    }
    
     public double getPayments() {
        return payments;
    }

    public void setPayments(double inPay) {
        payments = inPay;
    }
   
//Used to display fields of StovelMember class as a string   
    @Override
    public String toString()
    {
     return  email + ", " + password + ", " + name + ", " + surname + ", " + DOB + ", " + gender + ", " +  ", " + bank + ", " + cellno + ", " + stokvel + ", " + "R" + payments; 
    }

}

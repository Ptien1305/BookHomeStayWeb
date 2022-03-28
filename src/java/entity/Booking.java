/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author LNV
 */
public class Booking {
    private int bookingID;
    private int customerID;
    private int homestayID;
    private Date check_in;
    private Date check_out;
    private int price;

    public Booking() {
    }

    public Booking(int bookingID, int customerID, int homestayID, Date check_in, Date check_out, int price) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.homestayID = homestayID;
        this.check_in = check_in;
        this.check_out = check_out;
        this.price = price;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getHomestayID() {
        return homestayID;
    }

    public void setHomestayID(int homestayID) {
        this.homestayID = homestayID;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Booking{" + "bookingID=" + bookingID + ", customerID=" + customerID + ", homestayID=" + homestayID + ", check_in=" + check_in + ", check_out=" + check_out + ", price=" + price + '}';
    }

   
    
    
          
}

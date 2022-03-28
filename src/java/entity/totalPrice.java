/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author LNV
 */
public class totalPrice {
   private Booking booking;
   private int totalPrice;
   private String homestayName;

    public totalPrice() {
    }

    public totalPrice(Booking booking, int totalPrice, String homestayName) {
        this.booking = booking;
        this.totalPrice = totalPrice;
        this.homestayName = homestayName;
    }
    
    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getHomestayName() {
        return homestayName;
    }

    public void setHomestayName(String homestayName) {
        this.homestayName = homestayName;
    }

    @Override
    public String toString() {
        return "totalPrice{" + "booking=" + booking + ", totalPrice=" + totalPrice + ", homestayName=" + homestayName + '}';
    }
 
}

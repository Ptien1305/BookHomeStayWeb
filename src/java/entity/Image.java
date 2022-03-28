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
public class Image {
    private int ID;
    private int homestayID;
    private String name;

    public Image() {
    }

    public Image(int ID, int homestayID, String name) {
        this.ID = ID;
        this.homestayID = homestayID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getHomestayID() {
        return homestayID;
    }

    public void setHomestayID(int homestayID) {
        this.homestayID = homestayID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" + "ID=" + ID + ", homestayID=" + homestayID + ", name=" + name + '}';
    }
    
    
}

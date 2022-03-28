/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LNV
 */
public class locations {
     private int id;
    private String name;
    private String image;
    private int totalHomestay;

    public locations() {
    }

    public locations(int id, String name, String image, int totalHomestay) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.totalHomestay = totalHomestay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getTotalHomestay() {
        return totalHomestay;
    }

    public void setTotalHomestay(int totalHomestay) {
        this.totalHomestay = totalHomestay;
    }

    @Override
    public String toString() {
        return "locations{" + "id=" + id + ", name=" + name + ", image=" + image + ", totalHomestay=" + totalHomestay + '}';
    }
    
    
}

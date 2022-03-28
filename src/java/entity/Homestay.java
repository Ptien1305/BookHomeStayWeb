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
public class Homestay {

    private int id, locationID;
    private String name;
    private int price;
    private String desciption;
    private boolean isReserved;
    private int maxPeople;
    private String img, content;
    private Date addDate;

    public Homestay() {
    }

    public Homestay(int id, int locationID, String name, int price, String desciption, boolean isReserved, int maxPeople, String img, String content, Date addDate) {
        this.id = id;
        this.locationID = locationID;
        this.name = name;
        this.price = price;
        this.desciption = desciption;
        this.isReserved = isReserved;
        this.maxPeople = maxPeople;
        this.img = img;
        this.content = content;
        this.addDate = addDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public boolean isIsReserved() {
        return isReserved;
    }

    public void setIsReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "Homestay{" + "id=" + id + ", locationID=" + locationID + ", name=" + name + ", price=" + price + ", desciption=" + desciption + ", isReserved=" + isReserved + ", maxPeople=" + maxPeople + ", img=" + img + ", content=" + content + ", addDate=" + addDate + '}';
    }



   

}

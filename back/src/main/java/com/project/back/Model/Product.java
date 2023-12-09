package com.project.back.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    public Product() {
    }

    public Product(int id, String code, String name, String description, int rating, String category, String inventoryStatus, String image, int price, int quantity) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.inventoryStatus= inventoryStatus;
        this.rating = rating;
        this.category = category;
        this.image = image;
    }

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String code;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private int price;
    @Column
    private int quantity;
    @Column
    private String inventoryStatus;
    @Column
    private String category;
    @Column
    private String image;
    @Column
    private int rating;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public String getInventoryStatus(){
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus){
        this.inventoryStatus=inventoryStatus;
    }

    public String getImage(){
        return image;
    }

    public void setImage(String image){
        this.image=image;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code=code;
    }

}
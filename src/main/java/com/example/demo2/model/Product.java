package com.example.demo2.model;
//https://www.codejava.net/frameworks/spring-boot/spring-boot-crud-example-with-spring-mvc-spring-data-jpa-thymeleaf-hibernate-mysql
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    private Long id;

    private String name;
    private String brand;
    private String madeiin;
    private float price;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadeiin() {
        return madeiin;
    }

    public void setMadeiin(String madeiin) {
        this.madeiin = madeiin;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(){ }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", madeiin='" + madeiin + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(Long id, String name, String brand, String madeiin, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.madeiin = madeiin;
        this.price = price;
    }
}

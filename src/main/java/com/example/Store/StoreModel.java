package com.example.Store;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;

// @Entity
// @Table
// public class StoreModel {
//     private int id;
//     private String name;
//     private double price;
//     private String category;

//     public StoreModel(int id, String name, double price, String category){
//         this.id=id;
//         this.name=name;
//         this.price=price;
//         this.category=category;
//     }

//     public void setId(int id){
//         this.id=id;
//     }

//     public int getId(){
//         return id;
//     }

//     public void setName(String name){
//         this.name=name;
//     }

//     public String getName(){
//         return name;
//     }

//     public void setPrice(double price){
//         this.price=price;
//     }

//     public double getPrice(){
//         return price;
//     }

//     public void setCategeory(String category){
//         this.category=category;
//     }

//     public String getCategeory(){
//         return category;
//     }

//     public Object id() {
//         return null;
//     }
// }


public record StoreModel (
   Integer id,
    String name,
    Double price,
    Category category
){
    
}

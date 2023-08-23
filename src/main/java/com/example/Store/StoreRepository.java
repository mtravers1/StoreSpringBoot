package com.example.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
@Repository
public class StoreRepository {
    
    private final List<StoreModel> s=new ArrayList<>();

    public StoreRepository(){

    }

    
    public List<StoreModel>findAll(){
        return s;
    }

    public Optional<StoreModel> findById(int id){
        return s.stream().filter(c->c.id().equals(id)).findFirst();
    }

    @PostConstruct
    public void init(){
        StoreModel a= new StoreModel(
            1, 
        "eggs",
         2.99,
         Category.FOOD
         
            );
        s.add(a);

        StoreModel b= new StoreModel(
            2, 
        "bacon",
         4.99,
         Category.FOOD
         
            );
        s.add(b);
    }

    public void save(StoreModel store){
        s.removeIf(c->c.id().equals(store.id()));
        s.add(store);
    }

    public void delete(int id){
        s.removeIf(c->c.id().equals(id));
    }


}

package com.example.Store;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private final StoreRepository storeRepository;

    public StoreController(StoreRepository storeRepository){
        this.storeRepository=storeRepository;
    }

    @GetMapping
    public List<StoreModel>findall(){
        return storeRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<StoreModel> findById(@PathVariable int id){
        return storeRepository.findById(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void save(@RequestBody StoreModel store){
         storeRepository.save(store);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody StoreModel store, @PathVariable int id){
        storeRepository.save(store);
    }

    @DeleteMapping("/{id}")

    public void delete(@PathVariable int id){
        storeRepository.delete(id);
    }

    
}

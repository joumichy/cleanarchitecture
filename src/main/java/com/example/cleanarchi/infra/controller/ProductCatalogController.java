package com.example.cleanarchi.infra.controller;

import com.example.cleanarchi.infra.entity.ProductCatalogEntity;
import com.example.cleanarchi.infra.entity.UserEntity;
import com.example.cleanarchi.use_cases.GetProductById;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductCatalogController {

    private final GetProductById getProductById;

    public  ProductCatalogController(GetProductById getProductById){
        this.getProductById = getProductById;
    }

    @GetMapping(value = {"{id}"})
    public ResponseEntity<?> getUserInfoById(@PathVariable(name ="id") Integer id){
        if(id != null){
            ProductCatalogEntity product = getProductById.execute(id);
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Nope", HttpStatus.BAD_REQUEST);
        }
    }

}

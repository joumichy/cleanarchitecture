package com.example.cleanarchi.infra.controller;

import com.example.cleanarchi.model.product.ProductInfo;
import com.example.cleanarchi.use_cases.product.GetAllProducts;
import com.example.cleanarchi.use_cases.product.GetProductById;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductCatalogController {

    private final GetProductById getProductById;

    private final GetAllProducts getAllProducts;


    public  ProductCatalogController(GetProductById getProductById, GetAllProducts getAllProducts){
        this.getProductById = getProductById;

        this.getAllProducts = getAllProducts;
    }

    @GetMapping(value = {"{id}"})
    public ResponseEntity<?> getProductById(@PathVariable(name ="id") Integer id){
        if(id != null){
            ProductInfo product = getProductById.execute(id);
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Nope", HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping(value = {"/all"})
    public ResponseEntity<?> getAllProduct(){
        try{
            List<ProductInfo> products = getAllProducts.execute();
            return new ResponseEntity<>(products, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}

package com.crowdstreet.property.controller;


import com.crowdstreet.property.model.Seller;
import com.crowdstreet.property.service.SellerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sellers")
public class SellerController {

    private SellerService sellerService;

    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    // build create sellers REST APIs
    @PostMapping
    public ResponseEntity<Seller> saveSeller(@RequestBody Seller seller){

        return new ResponseEntity<Seller>(sellerService.saveSeller(seller), HttpStatus.CREATED);
    }

    //build get all sellers REST API
    @GetMapping
    public List<Seller> getAllSellers(){
        return sellerService.getAllSellers();
    }

    //build get seller by ID REST API
    @GetMapping({"id"})
    public ResponseEntity<Seller> getSellerById(@PathVariable("id") long sellerId) {
        return new ResponseEntity<Seller>(sellerService.getSellerById(sellerId), HttpStatus.OK);
    }





}

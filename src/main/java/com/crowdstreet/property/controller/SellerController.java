package com.crowdstreet.property.controller;


import com.crowdstreet.property.model.Seller;
import com.crowdstreet.property.service.SellerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

        return new ResponseEntity<Seller>(sellerService.saveSeller(seller), HttpStatus.CREATED)
    }


}

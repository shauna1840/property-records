package com.crowdstreet.property.service;

import com.crowdstreet.property.model.Seller;

import java.util.List;

public interface SellerService {

    Seller saveSeller(Seller seller);

    List<Seller> getAllSellers();

    Seller getSellerById(long id);

    void deleteSeller(long id);

}

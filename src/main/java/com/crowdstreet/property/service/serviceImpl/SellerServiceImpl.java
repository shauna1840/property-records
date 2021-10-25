package com.crowdstreet.property.service.serviceImpl;

import com.crowdstreet.property.model.Seller;
import com.crowdstreet.property.repository.SellerRepository;
import com.crowdstreet.property.service.SellerService;

public class SellerServiceImpl implements SellerService {

    SellerRepository sellerRepository;

    public SellerServiceImpl(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    @Override
    public Seller saveSeller(Seller seller) {
        return sellerRepository.save(seller);
    }
}

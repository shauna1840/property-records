package com.crowdstreet.property.service.serviceImpl;

import com.crowdstreet.property.exception.ResourceNotFoundException;
import com.crowdstreet.property.model.Seller;
import com.crowdstreet.property.repository.SellerRepository;
import com.crowdstreet.property.service.SellerService;

import java.util.List;
import java.util.Optional;

public class SellerServiceImpl implements SellerService {

    SellerRepository sellerRepository;


    public SellerServiceImpl(SellerRepository sellerRepository) {
        super();
        this.sellerRepository = sellerRepository;
    }

    @Override
    public Seller saveSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    @Override
    public List<Seller> getAllSellers() {
        return sellerRepository.findAll();
    }


    @Override
    public Seller getSellerById(long id) {
        Optional<Seller> seller = sellerRepository.findById(id);
        return sellerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Seller", "Id" , id));
    }


}

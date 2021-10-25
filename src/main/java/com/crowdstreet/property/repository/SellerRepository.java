package com.crowdstreet.property.repository;

import com.crowdstreet.property.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}

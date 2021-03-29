package com.Shop.Investment.Repository;

import com.Shop.Investment.Model.Shop;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends MongoRepository<Shop,String> {
}

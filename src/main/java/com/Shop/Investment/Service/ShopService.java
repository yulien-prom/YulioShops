package com.Shop.Investment.Service;

import com.Shop.Investment.Model.Shop;

import java.util.List;
import java.util.Optional;

public interface ShopService {

    List<Shop> getAllShops();

    Optional<Shop> getShopById(String IdShop);

    String SaveShop(Shop Varial);

}

package com.Shop.Investment.Service.Implementation;

import com.Shop.Investment.Model.Shop;
import com.Shop.Investment.Repository.ShopRepository;
import com.Shop.Investment.Service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImplementation implements ShopService {

    @Autowired
    ShopRepository varialRepository;

    @Override
    public List<Shop> getAllShops() {
        return varialRepository.findAll();
    }

    @Override
    public Optional<Shop> getShopById(String IdShop) {
        return varialRepository.findById(IdShop);
    }

    @Override
    public String SaveShop(Shop Varial) {
        varialRepository.save(Varial);
        return "Registered Store (ಠ_ಠ)";
    }
}

package com.Shop.Investment.Controller;

import com.Shop.Investment.Model.Shop;
import com.Shop.Investment.Service.Implementation.ShopServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/Shops/Virtual")
public class ShopController {

    @Autowired
    ShopServiceImplementation variaLServiceImplementation;

    @GetMapping
    public List<Shop> getAllShops() {
        return variaLServiceImplementation.getAllShops();
    }

    @GetMapping("/{IdShop}")
    public Optional<Shop> getShopById(@PathVariable String IdShop){
        return variaLServiceImplementation.getShopById(IdShop);
    }

    @PostMapping
    public String saveShop(@RequestBody Shop Varial){
        return variaLServiceImplementation.SaveShop(Varial);


    }
}

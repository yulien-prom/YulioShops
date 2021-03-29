package com.Shop.Investment.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Shop {

    @Id
    private String IdShop;

    private String nameOfShop;

    private int yearOfOpening;
}

package com.kesi.planit.curd_exercise.goods.bussiness;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Goods {
    Long id;
    String name;
    String description;
    int price;

    //methods
}

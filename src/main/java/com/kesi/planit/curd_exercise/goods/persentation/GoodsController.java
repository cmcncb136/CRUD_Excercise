package com.kesi.planit.curd_exercise.goods.persentation;


import com.kesi.planit.curd_exercise.goods.bussiness.GoodsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class GoodsController {
    private final GoodsService goodsService;

    @GetMapping("goods/all") //goods/all url 입력시
    public List<GoodsListDto> getAllGoods() {
        return goodsService.getAll();
    }

    //Todo. 단일(상품번호로) 검색해보기


}

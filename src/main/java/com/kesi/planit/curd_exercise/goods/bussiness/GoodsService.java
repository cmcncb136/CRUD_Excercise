package com.kesi.planit.curd_exercise.goods.bussiness;


import com.kesi.planit.curd_exercise.goods.infrastructure.GoodsJpaEntity;
import com.kesi.planit.curd_exercise.goods.infrastructure.GoodsJpaRepository;
import com.kesi.planit.curd_exercise.goods.persentation.GoodsListDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class GoodsService {
    private final GoodsJpaRepository goodsJpaRepository;

    public List<GoodsListDto> getAll(){
        //DB에서 모든 값을 가져옴
        List<GoodsJpaEntity> goodsJpaEntities
                = goodsJpaRepository.findAll();

        //Entity를 Domain으로 변경
        List<Goods> goodsList = new ArrayList<>();
        for (GoodsJpaEntity goodsJpaEntity : goodsJpaEntities) {
            goodsList.add(goodsJpaEntity.toDomain());
        }

        //Domain을 Dto로 변경
        List<GoodsListDto> goodsListDtos = new ArrayList<>();
        for (Goods goods : goodsList) {
            goodsListDtos.add(GoodsListDto.toDto(goods));
        }

        return goodsListDtos;
    }

}

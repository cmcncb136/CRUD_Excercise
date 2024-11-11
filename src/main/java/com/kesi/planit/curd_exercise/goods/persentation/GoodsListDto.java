package com.kesi.planit.curd_exercise.goods.persentation;


import com.kesi.planit.curd_exercise.goods.bussiness.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data //Getter, Setter 둘다
@AllArgsConstructor
public class GoodsListDto {
    Long id;
    String name;
    int price;

    //Domain(Goods) --> Dto(GoodsListDto)로 전환
    public static GoodsListDto toDto(Goods goods){
       return new GoodsListDto(
               goods.getId(),
               goods.getName(),
               goods.getPrice()
       );
    }
}

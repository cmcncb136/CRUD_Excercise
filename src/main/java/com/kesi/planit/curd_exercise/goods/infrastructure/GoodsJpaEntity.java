package com.kesi.planit.curd_exercise.goods.infrastructure;


import com.kesi.planit.curd_exercise.goods.bussiness.Goods;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "goods")
public class GoodsJpaEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int price;

    //Entity --> Domain로 변환
    public Goods toDomain(){
        return new Goods(id, name, description, price);
    }

    //Domain --> Entity로 변환
    public static GoodsJpaEntity toEntity(Goods domain){
        return new GoodsJpaEntity(
                domain.getId(),
                domain.getName(),
                domain.getDescription(),
                domain.getPrice()
        );
    }
}


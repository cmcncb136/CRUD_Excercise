package com.kesi.planit.curd_exercise.goods.infrastructure;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
JPARepository에서
기본적으로 id검색(findById)
전체 검색(findByAll)
저장(save) 등등 기본 제공

추가로 규칙에 맞게 명명하면 추가기능을 자동으로 만들어줘

*/

@Repository
public interface GoodsJpaRepository extends JpaRepository<GoodsJpaEntity, Long> {
}

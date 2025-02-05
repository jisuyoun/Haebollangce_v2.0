package com.sist.haebollangce.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sist.haebollangce.challenge.model.CategoryEntity;

/*
 * 2025-02-03 최초 생성
 * 
 * 챌린지 카테고리 관련 엔티티 레포지토리
 */
public interface CategoryEntityRepository extends JpaRepository<CategoryEntity, Integer>{

}

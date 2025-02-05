package com.sist.haebollangce.challenge.service;

import java.util.List;

import com.sist.haebollangce.challenge.model.CategoryEntity;
import com.sist.haebollangce.challenge.model.ChallengeEntity;

/*
 * 2025-02-03 최초 생성
 * 
 * 챌린지 관련 서비스 인터페이스
 */
public interface ChallengeService {

    // 챌린지 조회
    List<Object[]> selectChallengeList();

    // 카테고리 조회
    List<CategoryEntity> selectCategoryList();

}

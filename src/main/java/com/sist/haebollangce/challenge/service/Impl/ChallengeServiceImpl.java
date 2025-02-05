package com.sist.haebollangce.challenge.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.haebollangce.challenge.model.CategoryEntity;
import com.sist.haebollangce.challenge.model.ChallengeEntity;
import com.sist.haebollangce.challenge.repository.CategoryEntityRepository;
import com.sist.haebollangce.challenge.repository.ChallengeEntityRepository;
import com.sist.haebollangce.challenge.service.ChallengeService;

/*
 * 2025-02-03 최초 생성
 * 
 * 챌린지 관련 서비스
 */
@Service
public class ChallengeServiceImpl implements ChallengeService {
    @Autowired
    private ChallengeEntityRepository challengeRepository;
    private CategoryEntityRepository categoryEntityRepository;

    // 챌린지 조회
    @Override
    public List<Object[]> selectChallengeList() {
        return challengeRepository.selectChallengeList();
    }

    @Override
    public List<CategoryEntity> selectCategoryList() {
        return categoryEntityRepository.findAll();
    }

}

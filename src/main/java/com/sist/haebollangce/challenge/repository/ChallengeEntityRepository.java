package com.sist.haebollangce.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sist.haebollangce.challenge.model.ChallengeEntity;

/*
 * 2025-02-03 최초 생성
 * 
 * 챌린지 관련 엔티티 레포지토리
 */
public interface ChallengeEntityRepository extends JpaRepository<ChallengeEntity, Long> {

    @Query("SELECT a.challengeName, b.categoryName, a.regDate, a.memberCount, a.thumbnail, a.freqType, a.duringType, a.userId " +
            "FROM ChallengeEntity a JOIN a.category b")
     List<Object[]> selectChallengeList();
}

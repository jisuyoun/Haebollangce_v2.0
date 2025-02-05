package com.sist.haebollangce.challenge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_challenge")
public class ChallengeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "challenge_code", nullable = false, columnDefinition = "BIGINT(20) COMMENT '챌린지 일련번호'")
    @JsonProperty("challengeCode")
    private long challengeCode;
    
    @Column(name = "category_code", nullable = false, columnDefinition = "INT(11) COMMENT '카테고리 코드'")
    @JsonProperty("categoryCode")
    private int categoryCode;
    
    // 카테고리 join용
    @ManyToOne
    @JoinColumn(name = "category_code", referencedColumnName = "category_code", insertable = false, updatable = false)
    private CategoryEntity category;
    
    @Column(name = "challenge_name", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '챌린지 이름'")
    @JsonProperty("challengeName")
    private String challengeName;
    
    @Column(name = "content", nullable = false, columnDefinition = "MEDIUMTEXT COMMENT '내용'")
    @JsonProperty("content")
    private String content;
    
    @Column(name = "regDate", nullable = false, columnDefinition = "DATE COMMENT '등록 일자'")
    @JsonProperty("regDate")
    private String regDate;
    
    @Column(name = "challenge_exp", nullable = true, columnDefinition = "SMALLINT(6) COMMENT '경험치'")
    @JsonProperty("challengeExp")
    private int challengeExp;
    
    @Column(name = "member_count", nullable = true, columnDefinition = "SMALLINT(6) COMMENT '참가인원'")
    @JsonProperty("memberCount")
    private int memberCount;
    
    @Column(name = "thumbnail", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '대표이미지'")
    @JsonProperty("thumbnail")
    private String thumbnail;
    
    @Column(name = "freq_type", nullable = false, columnDefinition = "ENUM('1', '2', '3') COMMENT '인증빈도 종류'")
    @JsonProperty("freqType")
    private String freqType;
    
    @Column(name = "during_type", nullable = false, columnDefinition = "ENUM('1', '2', '3', '4', '5', '6', '7', '8') COMMENT '기간 종류'")
    @JsonProperty("duringType")
    private String duringType;
    
    @Column(name = "start_date", nullable = false, columnDefinition = "DATE COMMENT '시작 날짜'")
    @JsonProperty("startDate")
    private String startDate;
    
    @Column(name = "user_id", nullable = false, columnDefinition = "VARCHAR(20) COMMENT '개설자'")
    @JsonProperty("userId")
    private String userId;
}

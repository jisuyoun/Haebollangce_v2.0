package com.sist.haebollangce.challenge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "tbl_category")
public class CategoryEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_code", nullable = false, columnDefinition = "INT(11) COMMENT '카테고리 코드'")
    @JsonProperty("categoryCode")
    private int categoryCode;
    
    @Column(name = "category_name", nullable = false, columnDefinition = "VARCHAR(50) COMMENT '카테고리명'")
    @JsonProperty("categoryName")
    private String categoryName;
    
}

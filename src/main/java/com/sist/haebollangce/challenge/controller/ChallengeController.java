package com.sist.haebollangce.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sist.haebollangce.challenge.model.ChallengeEntity;
import com.sist.haebollangce.challenge.service.ChallengeService;

import jakarta.servlet.http.HttpServletRequest;

/*
 * 2025-02-03 최초 생성
 * 
 * 챌린지 관련 컨트롤러
 */
@Controller
@RequestMapping("/challenge")
public class ChallengeController {
    
    @Autowired
    private ChallengeService challengeService;
    
    // 모든 챌린지 조회
    @GetMapping("/selectAllChallenge")
    @ResponseBody
    public List<Object[]> challengeAll() {
        // 챌린지 조회
        List<Object[]> challengeList = challengeService.selectChallengeList();
        
        return challengeList;
    }
}

package com.example.demo.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
@Slf4j
public class BoardApiController {
	
	
    @PostMapping("boardArticleList")
	//@PostMapping(value = "boardArticleList", consumes="application/json")
    public ResponseEntity<String> getBoardArticleList(HttpServletRequest request//, 
    		//@RequestParam Map<String, String> paramMap
    		, Map<String, ?> input
    		) {

		log.info("string", input.get("boardNo"));
		
    	log.info("boardNo : " + request.getParameter("boardNo"));
    	
	
		return new ResponseEntity<String>("123", HttpStatus.OK);
		
    }

}

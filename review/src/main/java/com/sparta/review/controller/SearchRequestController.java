package com.sparta.review.controller;

import com.sparta.review.dto.NaverItemDto;
import com.sparta.review.feign.NaverService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController // JSON으로 응답함을 선언합니다.
public class SearchRequestController {

    @Value("${naver.clientId}")
    private String clientId;

    @Value("${naver.clientSecret}")
    private String clientSecret;

    private final NaverService naverService;

    @GetMapping("/api/search")
    public NaverItemDto getItems(@RequestParam String query) {
        return naverService.search(clientId, clientSecret, query);
    }
}
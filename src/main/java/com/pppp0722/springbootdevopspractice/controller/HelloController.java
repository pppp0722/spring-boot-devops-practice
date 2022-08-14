package com.pppp0722.springbootdevopspractice.controller;

import com.pppp0722.springbootdevopspractice.entity.HelloListResponseDto;
import com.pppp0722.springbootdevopspractice.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/api/hello")
    public ResponseEntity<HelloListResponseDto> hello() {
        HelloListResponseDto responseDto = helloService.getAll();

        return ResponseEntity.ok().body(responseDto);
    }
}

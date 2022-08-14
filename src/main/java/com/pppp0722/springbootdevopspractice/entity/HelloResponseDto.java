package com.pppp0722.springbootdevopspractice.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HelloResponseDto {

    private String value;

    public static HelloResponseDto fromEntity(Hello hello) {
        return HelloResponseDto.builder()
            .value(hello.getHello())
            .build();
    }
}

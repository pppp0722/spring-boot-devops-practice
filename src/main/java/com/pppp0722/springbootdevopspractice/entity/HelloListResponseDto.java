package com.pppp0722.springbootdevopspractice.entity;

import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HelloListResponseDto {

    private List<HelloResponseDto> hellos;

    public static HelloListResponseDto fromEntity(List<Hello> helloList) {
        return HelloListResponseDto.builder()
            .hellos(
                helloList.stream()
                    .map(HelloResponseDto::fromEntity)
                    .collect(Collectors.toList())
            )
            .build();
    }
}

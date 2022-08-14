package com.pppp0722.springbootdevopspractice.service;

import com.pppp0722.springbootdevopspractice.entity.Hello;
import com.pppp0722.springbootdevopspractice.entity.HelloListResponseDto;
import com.pppp0722.springbootdevopspractice.entity.HelloRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final HelloRepository helloRepository;

    public HelloListResponseDto getAll() {
        List<Hello> helloList = helloRepository.findAll();

        return HelloListResponseDto.fromEntity(helloList);
    }
}

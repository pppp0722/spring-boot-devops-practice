package com.pppp0722.springbootdevopspractice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hello")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Hello {

    @Id
    private Long id;

    @Column(nullable = false)
    private String hello;

    @Builder
    public Hello(Long id, String hello) {
        this.id = id;
        this.hello = hello;
    }
}

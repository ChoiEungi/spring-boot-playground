package com.spring.playground.product;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private int price;

    private String content;

    public Product(String title, int price, String content) {
        this(null, title, price, content);
    }

    private Product(Long id, String title, int price, String content) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.content = content;
    }


}

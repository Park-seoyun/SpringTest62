package com.example.demo;

import java.math.BigDecimal;

import groovy.transform.ToString;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@ToString
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "productCode",length = 15)
    private String productCode;

    @Column(name = "productName",nullable = false, length = 70)
    private String productName;

    @Column(name = "productLine",nullable = false, length = 50)
    private String productLine;

    @Column(name = "productScale",nullable = false, length = 10)
    private String productScale;

    @Column(name = "productVendor",nullable = false, length = 50)
    private String productVendor;

    // Lob : Large Object의 약자
    // BLOB : (Binary Large Object)
    // CLOB : (Character Large Object)
    @Lob // TEXT 타입과 매핑
    @Column(name = "productDescription",nullable = false, columnDefinition = "TEXT")
    private String productDescription;

    @Column(name = "quantityInStock",nullable = false)
    private Short quantityInStock;

    @Column(name = "buyPrice",nullable = false, precision = 10, scale = 2)
    private BigDecimal buyPrice;

    @Column(name = "MSRP", nullable = false, precision = 10, scale = 2)
    private BigDecimal msrp;

    // Getter, Setter, 기본 생성자 등은 Lombok 이나 직접 생성
}
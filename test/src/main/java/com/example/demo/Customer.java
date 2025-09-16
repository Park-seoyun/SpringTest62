package com.example.demo;

import java.math.BigDecimal;

import groovy.transform.ToString;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customers")
public class Customer {
	
	// 엔티티 매핑시 주의사항
	// customer_number 라는 이름의 멤버변수 없는데
	// -> 

	@Id
	@Column(name = "customerNumber")
    private Integer customerNumber;
	
    @Column(name = "customerName", nullable = false, length = 50)
    private String customerName;

    @Column(name = "contactLastName", nullable = false, length = 50)
    private String contactLastName;

    @Column(name = "contactFirstName", nullable = false, length = 50)
    private String contactFirstName;

    @Column(name = "phone", nullable = false, length = 50)
    private String phone;
    
    @Column(name = "addressLine1", nullable = false, length = 50)
    private String addressLine1;
    
    @Column(name = "addressLine2", length = 50)
    private String addressLine2;
    
    @Column(name = "country", nullable = false, length = 50)
    private String country;
    
    // predicision = 숫자 타입에서 전체 자릿수 지정
    // -> 최대 10자리 숫자 지정
    // scale : 소수점 이하 자리수 지정
    // -> 소수점 이하 2자리까지 저장 가능
    // BigDecimal : 자바에서 고정된 소수점 숫자를 표현하기 위한 참조타입
    // -> 주로 정확한 소수점 계산이나 금액을 계산하는 경우에 많이 사용
    // -> 크레딧한도 라던지 정확한 숫자 계산을 요구하는 금융 데이터를 처리하기 위해
    //    사용될 가능성이 매우 높음
    
    @Column(name = "salesRepEmployeeNumber")
    private Integer salesRepEmployeeNumber;
	
    @Column(name = "creditLimit", precision = 10, scale = 2)
    private BigDecimal creditLimit;
    
    
//    @Override
//    public void toString() {
//    	return this.addressLine1 + 
//    }
}

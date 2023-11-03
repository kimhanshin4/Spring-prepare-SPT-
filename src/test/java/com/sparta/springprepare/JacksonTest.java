package com.sparta.springprepare;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.springprepare.response.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JacksonTest {

    @Test
    @DisplayName("Object To JSON : get Method 필요")
    void test1() throws JsonProcessingException {
        Star star = new Star("Robbie", 95); // Star클래스의 객체 생성

        ObjectMapper objectMapper = new ObjectMapper(); // Jackson 라이브러리의 ObjectMapper 객체 생성
        String json = objectMapper.writeValueAsString(star); // 파라미터 값으로 변환할 Object의 객체(star!)를 넣는다.
        //writeValueAsString - Value값을 String으로 작성
        //JSON 반환 값을 String 타입의 JSON 형태로 변환, 반환

        System.out.println("json = " + json);
        //json = {"name":"Robbie","age":95}
        //star클래스의 필드 값이 JSON 타입의 String으로 반환됨
    }

    @Test
    @DisplayName("JSON To Object : 기본 생성자 & (get OR set) Method 필요")
    void test2() throws JsonProcessingException {
        String json = "{\"name\":\"Robbie\",\"age\":95}"; // JSON 타입의 String 선언,초기화

        ObjectMapper objectMapper = new ObjectMapper(); // Jackson 라이브러리의 ObjectMapper

        Star star = objectMapper.readValue(json, Star.class);
        //redValue(JSON타입 String, 매핑할 객체)

        System.out.println("star.getName() = " + star.getName());
        System.out.println("star.getAge() = " + star.getAge());
    }
}

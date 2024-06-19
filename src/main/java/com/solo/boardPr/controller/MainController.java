package com.solo.boardPr.controller;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
//
//    // @ResponseStatus 사용해보기
//    @GetMapping("/success")
////    @ResponseStatus(HttpStatus.OK)
//    public String success() {
////        HttpStatus httpStatus = HttpStatus.valueOf(200);
//        return "Success!";
//    }
//
//    RestTemplate restTemplate = new RestTemplate();
//    //ResponseEntity 사용해보기
//    @GetMapping("/dynamicStatus")
//    public ResponseEntity<String> dynamicStatus() {
//        // 조건에 따라 상태 코드 설정
//        boolean condition = checkCondition();
//        if (condition) {
//            return new ResponseEntity<>("Success!", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Error!", HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    private boolean checkCondition() {
//        // 조건을 체크하는 로직
//        return true; // 예제에서는 항상 true를 반환
//    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

}

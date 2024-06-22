package com.solo.boardPr.service;



public interface JoinService {

    void join(){
        System.out.println("Interface 가입");
    }
    default void Out(){
        System.out.println("Interface 탈퇴");
    }
}

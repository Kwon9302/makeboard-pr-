package com.solo.boardPr.service;


import org.springframework.stereotype.Service;

@Service
public class JoinServiceMain implements JoinService {

    @Override
    public void join(){
        System.out.println("MainJoin");
    }

    @Override
    public void Out(){
        System.out.println("MainOut");
    }

}

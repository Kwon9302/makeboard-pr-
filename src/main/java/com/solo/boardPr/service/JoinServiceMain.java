package com.solo.boardPr.service;

public abstract class JoinServiceMain implements JoinService {

    @Override
    public void join(){
        System.out.println("MainJoin");
    }

    @Override
    public void Out(){
        System.out.println("MainOut");
    }

}

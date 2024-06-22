package com.solo.boardPr.service;

import org.springframework.stereotype.Service;

@Service
public abstract class JoinServiceSub implements JoinService {

    @Override
    public void join(){
        System.out.println("subJoin");
    }

    @Override
    public void Out(){
        System.out.println("subOut");
    }

}

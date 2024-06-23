package com.solo.boardPr.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class JoinServiceSub implements JoinService {

    @Override
    public void join(){
        System.out.println("subJoin");
    }

    @Override
    public void Out(){
        System.out.println("subOut");
    }

}

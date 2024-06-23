package com.solo.boardPr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
    private final JoinService js;

    public String joinfc(){
        js.join();
        js.Out();
        return null;
    }
 }

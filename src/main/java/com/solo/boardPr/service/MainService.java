package com.solo.boardPr.service;

import com.solo.boardPr.domain.ClientEntity;
import com.solo.boardPr.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
    private final JoinService js;
    private final ClientRepository clientRepository;

    public String joinfc(){
        js.join();
        js.Out();
        return null;
    }

    public void saveClientData(ClientEntity clientEntity){
        clientRepository.save(clientEntity);
    }
 }

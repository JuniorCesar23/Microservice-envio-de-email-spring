package com.ms.msemail.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.msemail.repositories.EmailRepository;

@Service
public class EmailService {
    
    @Autowired
    private EmailRepository emailRepository;

}

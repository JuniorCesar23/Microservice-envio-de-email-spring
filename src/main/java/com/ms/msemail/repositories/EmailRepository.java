package com.ms.msemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.msemail.models.EmailModel;

@Repository
public interface EmailRepository extends JpaRepository<EmailModel, Long> {
    
}

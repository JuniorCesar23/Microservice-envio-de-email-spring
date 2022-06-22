package com.ms.msemail.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ms.msemail.enums.StatusEmail;

import lombok.Data;

@Entity
@Table(name = "tb_email")
@Data
public class EmailModel implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String referenciaProprietario;
    private String origemEmail;
    private String destinoEmail;
    private String tituloEmail;
    @Column(columnDefinition = "TEXT")
    private String conteudoEmail;
    private LocalDateTime dataEmail;
    private StatusEmail statusEmail;

}

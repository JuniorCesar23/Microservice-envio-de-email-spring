package com.ms.msemail.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_email")
@Data
public class EmailModel implements Serializable {
    
    private Long emailId;
    private String referenciaProprietario;
    private String origemEmail;
    private String destinoEmail;
    private String tituloEmail;
    @Column(columnDefinition = "TEXT")
    private String conteudoEmail;
    private LocalDateTime dataEmail;
    private String statusEmail;

}

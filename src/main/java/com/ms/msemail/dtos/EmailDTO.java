package com.ms.msemail.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EmailDTO {
    
    @NotBlank
    private String referenciaProprietario;
    @NotBlank
    @Email
    private String origemEmail;
    @NotBlank
    @Email
    private String destinoEmail;
    @NotBlank
    private String tituloEmail;
    @NotBlank
    private String conteudoEmail;

}

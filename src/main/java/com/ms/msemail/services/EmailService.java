package com.ms.msemail.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ms.msemail.enums.StatusEmail;
import com.ms.msemail.models.EmailModel;
import com.ms.msemail.repositories.EmailRepository;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;

    public EmailModel enviarEmail(EmailModel emailModel) {

        emailModel.setDataEmail(LocalDateTime.now());
        try {

            SimpleMailMessage message = new SimpleMailMessage();

            message.setFrom(emailModel.getOrigemEmail());
            message.setTo(emailModel.getDestinoEmail());
            message.setSubject(emailModel.getTituloEmail());
            message.setText(emailModel.getConteudoEmail());

            emailSender.send(message);

            emailModel.setStatusEmail(StatusEmail.ENVIADO);

        } catch (MailException e) {
            emailModel.setStatusEmail(StatusEmail.ERRO);
        } finally {
            return emailRepository.save(emailModel);
        }
    }

}

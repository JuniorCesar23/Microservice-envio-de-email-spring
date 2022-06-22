package com.ms.msemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ms.msemail.models.EmailModel;
import com.ms.msemail.repositories.EmailRepository;

@SpringBootApplication
public class MsEmailApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MsEmailApplication.class, args);
	}

	@Autowired
	private EmailRepository emailRepository;
	
    @Override
    public void run(String... args) throws Exception {
        
		EmailModel email = new EmailModel();
		email.setReferenciaProprietario("Júnior César");
		email.setOrigemEmail("saojoseclash@gmail.com");
		email.setDestinoEmail("junyorgames27@gmail.com");
		email.setTituloEmail("Saudação");
		email.setConteudoEmail("Boa tarde, tudo bem com você?");

		emailRepository.save(email);
        
    }

}

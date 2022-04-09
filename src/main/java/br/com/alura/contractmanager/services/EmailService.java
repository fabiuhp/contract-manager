package br.com.alura.contractmanager.services;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void enviarEmail(String nomeContratante, String emailContratante) {
        String meuEmail = "";
        String senha = "";

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(meuEmail, senha));
        email.setSSLOnConnect(true);

        try {
            email.setFrom(meuEmail);
            email.setSubject("Prazos de Contrato");
            email.setMsg(nomeContratante);
            email.addTo(emailContratante);
            email.send();
            System.out.println("Email enviado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

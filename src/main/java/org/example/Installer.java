package org.example;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.Properties;

public class Installer {
    private String email;
    private static final Logger logger1 = Logger.getLogger(Installer.class.getName());

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Installer(String emailtoSend) {
        this.email = emailtoSend;
    }

 

    public String receiveInstallationRequest(String requestDetails) {
        return  requestDetails;
    }

}






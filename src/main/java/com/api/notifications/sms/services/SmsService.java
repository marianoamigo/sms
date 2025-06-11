package com.api.notifications.sms.services;

import dto.NotificationDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SmsService {

//    - SMS: Limitar el contenido a 160 caracteres, registrar número y fecha de envío.

    public void send(NotificationDTO notification) throws ErrorService {
        validate(notification);
        int sendNum = (int) ((Math.random()*1000)+1);
        notification.setNumSend(sendNum);
        notification.setSendDate(LocalDateTime.now());
    }


    public void validate(NotificationDTO notification) throws ErrorService {
        if(notification.getBody().length()>160){
            throw new ErrorService("El cuerpo del mensaje no puede ser mayor a 160 caracteres");
        }

    }
}

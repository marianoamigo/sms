package com.api.notifications.sms.controller;

import com.api.notifications.sms.services.ErrorService;
import com.api.notifications.sms.services.SmsService;
import dto.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/sms")
public class SmsController {

    @Autowired
    SmsService smsService;

    @GetMapping("/home")
    public String home() {
        return "Microservicio de Email operativo 🚀";
    }
    @PostMapping("/send")
    public ResponseEntity<?> send(@RequestBody NotificationDTO notification) throws ErrorService {
        smsService.send(notification);
        return ResponseEntity.status((HttpStatus.CREATED)).body(notification);
    }
}

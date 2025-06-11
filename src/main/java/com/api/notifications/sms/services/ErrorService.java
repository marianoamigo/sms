package com.api.notifications.sms.services;

public class ErrorService extends Exception{
    public ErrorService(String message) {
            super(message);
        }

}

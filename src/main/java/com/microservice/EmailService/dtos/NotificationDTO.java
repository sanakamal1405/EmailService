package com.microservice.EmailService.dtos;

import lombok.*;



@NoArgsConstructor
@Data
public class NotificationDTO {


    private String to;
    private String from;
    private String body;
    private String subject;
}

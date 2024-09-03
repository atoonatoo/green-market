package com.hotel.lodgingCommander.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserModel {
    private int id;
    private String email;
    private String tel;
    private String grade;
    private String role;

}

package com.hotel.lodgingCommander.service;

import com.hotel.lodgingCommander.model.domain.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    Boolean join(UserModel userModel);

    Boolean logIn(UserModel userModel);

    ResponseEntity<Boolean> update(UserModel userModel);

    ResponseEntity<Boolean> delete(UserModel userModel);
}

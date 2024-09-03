package com.hotel.lodgingCommander.service.implement;


import com.hotel.lodgingCommander.model.domain.UserModel;
import com.hotel.lodgingCommander.model.entity.User;
import com.hotel.lodgingCommander.model.repository.UserRepository;
import com.hotel.lodgingCommander.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public Boolean join(UserModel userModel) {
       return true;
    }

    @Override
    public Boolean logIn(UserModel userModel) {
        return null;
    }


    @Override
    public ResponseEntity<Boolean> update(UserModel userModel) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(UserModel userModel) {
        return null;
    }
}

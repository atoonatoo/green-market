package com.hotel.lodgingCommander.contoller;

import com.hotel.lodgingCommander.model.domain.UserModel;
import com.hotel.lodgingCommander.model.entity.User;
import com.hotel.lodgingCommander.model.repository.UserRepository;
import com.hotel.lodgingCommander.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user/api")
public class UserController {

    private final UserService service;
    private final UserRepository repository;

    @PostMapping("/join")
    public ResponseEntity<Boolean> join(@RequestBody UserModel userModel) {
        return ResponseEntity.ok(service.join(userModel));
    }

    @PostMapping("/logIn")
    public ResponseEntity<Boolean> logIn(@RequestBody UserModel userModel) {
        return ResponseEntity.ok(service.logIn(userModel));
    }


    @GetMapping("/findById")
    public ResponseEntity<Optional<User>> findById() {
        return ResponseEntity.ok(repository.findBy());
    }

    @PutMapping("/update")
    public ResponseEntity<Boolean> update(@RequestBody UserModel userModel) {
        return service.update(userModel);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> delete(@RequestBody UserModel userModel) {
        return service.delete(userModel);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/existsByEmail")
    public ResponseEntity<Optional<User>> existsByEmail (){
        return ResponseEntity.ok(repository.existsByEmail());
    }

    @GetMapping("/count")
    public ResponseEntity<Long> count () {
        return ResponseEntity.ok(repository.count());
    }

}

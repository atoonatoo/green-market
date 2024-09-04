package com.hotel.lodgingCommander.contoller;

import com.hotel.lodgingCommander.model.domain.UserModel;
import com.hotel.lodgingCommander.entity.User;
import com.hotel.lodgingCommander.model.repository.UserRepository;
import com.hotel.lodgingCommander.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;
    private final UserRepository repository;

    @PostMapping("/")
    public ResponseEntity<User> insert(@RequestBody UserModel model) {
        return ResponseEntity.ok(repository.save(User.builder()
                .email(model.getEmail())
                .tel(model.getTel())
                .grade(model.getGrade())
                .role(model.getRole())
                .build()));
    }

//
//    @PostMapping("/logIn")
//    public ResponseEntity<Boolean> logIn(@RequestBody UserModel userModel) {
//        return ResponseEntity.ok(service.logIn(userModel));
//    }
//
//
//    @GetMapping("/findById")
//    public ResponseEntity<Optional<User>> findById() {
//        return ResponseEntity.ok(repository.findBy());
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity<Boolean> update(@RequestBody UserModel userModel) {
//        return service.update(userModel);
//    }
//
//    @DeleteMapping("/delete")
//    public ResponseEntity<Boolean> delete(@RequestBody UserModel userModel) {
//        return service.delete(userModel);
//    }
//
//    @GetMapping("/list")
//    public ResponseEntity<List<User>> findAll() {
//        return ResponseEntity.ok(repository.findAll());
//    }
//
//    @GetMapping("/{email}")
//    public ResponseEntity<Boolean> existsByEmail (String email){
//        return ResponseEntity.ok(repository.existsByEmail(email));
//    }
//
//    @GetMapping("/count")
//    public ResponseEntity<Long> count () {
//        return ResponseEntity.ok(repository.count());
//    }

}

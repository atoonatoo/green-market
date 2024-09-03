package com.hotel.lodgingCommander.contoller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/api")
public class UserController {

    @GetMapping("/getUser")
    public void getUser (){
    }
}

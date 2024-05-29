package com.example.Fitness_Tracker_App.adminManagement.api;

import com.example.Fitness_Tracker_App.adminManagement.core.UserService;
import com.example.Fitness_Tracker_App.adminManagement.data.SaveRegisterNewUserRequest;
import com.example.Fitness_Tracker_App.adminManagement.data.SaveRegisterNewUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService ;

    @PostMapping("/registerNewUser")
    ResponseEntity<SaveRegisterNewUserResponse> addRegisterUser(@RequestBody SaveRegisterNewUserRequest request)
    {
        final var response = userService.addRegisterUser(request);
       return ResponseEntity.ok(response);
    }

}

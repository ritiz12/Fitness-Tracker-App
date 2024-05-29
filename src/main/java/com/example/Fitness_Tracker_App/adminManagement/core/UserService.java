package com.example.Fitness_Tracker_App.adminManagement.core;

import com.example.Fitness_Tracker_App.adminManagement.data.SaveRegisterNewUserRequest;
import com.example.Fitness_Tracker_App.adminManagement.data.SaveRegisterNewUserResponse;
import com.example.Fitness_Tracker_App.adminManagement.data.SaveRegisterNewUserSummary;
import com.example.Fitness_Tracker_App.adminManagement.domain.User;
import com.example.Fitness_Tracker_App.adminManagement.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository ;
    public SaveRegisterNewUserResponse addRegisterUser(final SaveRegisterNewUserRequest request) {

        User user = new User(request.getFirstName() , request.getLastName() , request.getEmail() , request.getPhoneNumber() , request.getAge() , request.getGender() , request.getAddress() , request.getPassword());
        userRepository.save(user);
        SaveRegisterNewUserSummary summary = new SaveRegisterNewUserSummary(request.getFirstName() , request.getLastName() , request.getEmail() , request.getPhoneNumber() , request.getAge() , request.getGender() , request.getAddress(),request.getPassword());
        final var response = new SaveRegisterNewUserResponse();
        response.addRegisterUser(summary);
        return response;
    }
}

package com.example.Fitness_Tracker_App.adminManagement.data;

import java.util.ArrayList;
import java.util.Collection;

public class SaveRegisterNewUserResponse {

    Collection<SaveRegisterNewUserSummary> registerUserRecord ;

    public void addRegisterUser(SaveRegisterNewUserSummary data)
    {
        if(registerUserRecord == null)
        {
            registerUserRecord = new ArrayList<>();
        }
        registerUserRecord.add(data);
    }

    public Collection<SaveRegisterNewUserSummary> getRegisterUserRecord() {
        return registerUserRecord;
    }
}

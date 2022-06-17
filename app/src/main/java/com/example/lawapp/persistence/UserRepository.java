package com.example.lawapp.persistence;

import com.example.lawapp.persistence.model.UserDto;


import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Constructor

    public UserRepository() {
    }



    // Methods

    public UserDto getUser() {
        return new UserDto();
    }

    public List<UserDto> getUserList() {
        return new ArrayList<>();
    }

    public void createUser(UserDto userDto) {

    }

    public void updateUser(UserDto userDto) {

    }

    public void disableUser() {

    }

    public void removeUser() {

    }
}

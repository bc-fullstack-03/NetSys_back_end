package com.SocialNetSys.NetSys.Services.Users;

import com.SocialNetSys.NetSys.Models.Entities.User;
import com.SocialNetSys.NetSys.Models.Objects_Model.FindUserResponse;
import com.SocialNetSys.NetSys.Models.Objects_Model.UserRequest;
import com.SocialNetSys.NetSys.Repositories.UserRepository;
import com.SocialNetSys.NetSys.Services.Users.Interfaces.ICreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService implements ICreateUserService {
    @Autowired
    private UserRepository _userRepository;

    public String createUser(UserRequest request) {
        var response = new User(request.name, request.email, request.password);

        _userRepository.save(response);

        return response.getId().toString();
    }

    public FindUserResponse findUserByEmail(String email) {
        var user = _userRepository.findUserByEmail(email).get();

        return new FindUserResponse(user.getId(), user.getName(), user.getEmail());
    }
}

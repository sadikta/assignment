package com.sufies.shopping.service;

import com.sufies.shopping.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
 List<User> getAllusers();

void saveUser(User user);

Optional<User>findById( long id);

void updateUser( User user);
void deleteUser(long id);

}

package com.cg.homeloan.services;

import com.cg.homeloan.entities.User;
import com.cg.homeloan.repositories.IUserRepository;

public interface IUserService  {
public  User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
}

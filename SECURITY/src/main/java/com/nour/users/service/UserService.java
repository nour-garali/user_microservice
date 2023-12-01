package com.nour.users.service;

import java.util.List;

import com.nour.users.entities.Role;
import com.nour.users.entities.User;
public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
  

    List<User> findAllUsers();

    User findUserById(Long id);

    List<Role> findAllRoles();

    Role findRoleById(Long id);

    void deleteUser(long id);

    User removeRoleFromUser(long id, Role r);

    List<Role> findUserRolesById(Long id);
	User addRoleToUser(String username, String roleName);
}
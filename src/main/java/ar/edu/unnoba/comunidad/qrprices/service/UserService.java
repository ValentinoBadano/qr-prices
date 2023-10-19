package ar.edu.unnoba.comunidad.qrprices.service;

import ar.edu.unnoba.comunidad.qrprices.dao.UserDAO;
import ar.edu.unnoba.comunidad.qrprices.model.Role;
import ar.edu.unnoba.comunidad.qrprices.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDAO.findUserByName(username);
    }

    public void createUserWithRole(User user) {
        userDAO.saveUser(user);
    }

}

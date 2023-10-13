package ar.edu.unnoba.comunidad.qrprices.service;

import ar.edu.unnoba.comunidad.qrprices.model.Role;
import ar.edu.unnoba.comunidad.qrprices.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO implementar consulta a la bd
        return null;
    }

    public void createUserWithRole(User user, Role role) {
        // TODO implementar insert a la bd

    }

}

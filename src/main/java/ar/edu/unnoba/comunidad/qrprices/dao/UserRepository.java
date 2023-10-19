package ar.edu.unnoba.comunidad.qrprices.dao;

import ar.edu.unnoba.comunidad.qrprices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}

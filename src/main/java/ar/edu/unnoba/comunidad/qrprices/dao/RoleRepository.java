package ar.edu.unnoba.comunidad.qrprices.dao;

import ar.edu.unnoba.comunidad.qrprices.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

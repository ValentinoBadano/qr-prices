package ar.edu.unnoba.comunidad.qrprices.dao;

import ar.edu.unnoba.comunidad.qrprices.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDAO {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleDAO(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findRoleByName(String name) {
        return roleRepository.findRoleByName(name);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public void saveRole(Role role) {
        roleRepository.save(role);
    }

    public void deleteRole(Long roleId) {
        roleRepository.deleteById(roleId);
    }
}

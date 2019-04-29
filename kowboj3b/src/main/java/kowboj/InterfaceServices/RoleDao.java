package kowboj.InterfaceServices;

import kowboj.domain.Role;

public interface RoleDao {

    Role findByName(String name);

    void delete(Role role);
}

package kowboj3b.InterfaceServices;

import kowboj3b.domain.Role;

public interface RoleDao {

    Role findByName(String name);

    void delete(Role role);
}

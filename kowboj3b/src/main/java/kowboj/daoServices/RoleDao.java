package kowboj.daoServices;

import kowboj.domain.Privilege;
import kowboj.domain.Role;

public interface RoleDao {

    Role findByName(String name);

    void delete(Privilege privilege);
}

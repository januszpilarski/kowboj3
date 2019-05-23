package kowboj3b.InterfaceServices;

import kowboj3b.domain.Privilege;

public interface PrivilegeDao {

    Privilege findByName(String name);

    void delete(Privilege privilege);
}

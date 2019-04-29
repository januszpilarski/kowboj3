package kowboj.InterfaceServices;

import kowboj.domain.Privilege;

public interface PrivilegeDao {

    Privilege findByName(String name);

    void delete(Privilege privilege);
}

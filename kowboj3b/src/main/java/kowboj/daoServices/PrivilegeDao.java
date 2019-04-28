package kowboj.daoServices;

import kowboj.domain.Privilege;

public interface PrivilegeDao {

    Privilege findByName(String name);

    void delete(Privilege privilege);
}

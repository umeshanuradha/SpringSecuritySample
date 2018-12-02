package com.umesh.security.SpringSecuritySample.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by umesh on 12/1/18.
 */

@Entity
@Table(name = "role")
public class Role
{

    @Id
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;


    /**
     * Getter for property 'roleId'.
     *
     * @return Value for property 'roleId'.
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * Setter for property 'roleId'.
     *
     * @param roleId Value to set for property 'roleId'.
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * Getter for property 'roleName'.
     *
     * @return Value for property 'roleName'.
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Setter for property 'roleName'.
     *
     * @param roleName Value to set for property 'roleName'.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

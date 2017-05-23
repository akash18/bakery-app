package com.yummy.bakery.enums;

/**
 * Created by alalwani on 14/05/17.
 */
public enum RoleEnum {
    ADMIN(1, "ROLE_ADMIN"),
    USER(2, "ROLE_USER");


    private int roleId;
    private String roleName;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    RoleEnum(int id, String name){
     this.roleId = id;
     this.roleName = name;
    }

    public String getRoleName(int roleId){
        for(RoleEnum role: RoleEnum.values()){
            if(role.getRoleId() == roleId){
                return role.getRoleName();
            }
        }
        return null;
    }

    public int getRoleId(String roleName){
        for(RoleEnum role: RoleEnum.values()){
            if(role.getRoleName() == roleName){
                return role.getRoleId();
            }
        }
        return 0;
    }
}

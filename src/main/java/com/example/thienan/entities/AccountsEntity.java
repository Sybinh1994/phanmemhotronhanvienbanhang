package com.example.thienan.entities;

import javax.persistence.*;

@Entity
@Table(name = "accounts", schema = "spring_shoppingcartdb2", catalog = "")
public class AccountsEntity {
    private String userName;
    private boolean active;
    private String encrytedPassword;
    private String userRole;

    @Id
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "ACTIVE")
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Basic
    @Column(name = "ENCRYTED_PASSWORD")
    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    @Basic
    @Column(name = "USER_ROLE")
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountsEntity that = (AccountsEntity) o;

        if (active != that.active) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (encrytedPassword != null ? !encrytedPassword.equals(that.encrytedPassword) : that.encrytedPassword != null)
            return false;
        if (userRole != null ? !userRole.equals(that.userRole) : that.userRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (encrytedPassword != null ? encrytedPassword.hashCode() : 0);
        result = 31 * result + (userRole != null ? userRole.hashCode() : 0);
        return result;
    }
}

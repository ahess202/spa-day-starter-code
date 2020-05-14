package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotNull(message="Username required!")
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters!")
    private String username;

    @Email
    private String email;

    @Min(value = 6, message = "Password must be at least 6 characters long!")
    @NotNull(message="Password required!")
    private String password;

    @Min(value = 6, message = "Password must be at least 6 characters long!")
    @NotNull(message="Password verification required!")
    private String verify;

    private String verifyPassword;

    public User() { }

    public User(String username, String email, String password, String verify, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
        this.verifyPassword = verifyPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}

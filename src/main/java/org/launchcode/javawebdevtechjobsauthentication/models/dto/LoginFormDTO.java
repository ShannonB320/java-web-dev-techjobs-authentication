package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.*;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 2, max = 50, message = "Invalid username. Must be between 2 and 50 characters.")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 8, max = 20, message = "Invalid password. Must be between 8 and 20 characters.")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

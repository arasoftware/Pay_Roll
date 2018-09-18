package in.arasoftwares.payroll.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
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

    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }

    @SerializedName("")
    @Expose
    private String username;
    @SerializedName("")
    @Expose
    private String password;
}

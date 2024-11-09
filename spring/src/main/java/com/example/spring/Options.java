package main.java.com.example.spring;

import java.util.List;

public class Options {
    private String email;
    private List options;

    public Options(String email, List options) {
        this.email = email;
        this.options = options;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List getOptions() {
        return options;
    }

    public void setOptions(List options) {
        this.options = options;
    }
}

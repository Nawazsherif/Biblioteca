package com.tw.university;

import java.util.Objects;

public class User {
    private final String userId;
    private final String password;
    private final String phone_number;
    private final String mail_id;
    private final String name;

    public User(String userId, String password, String phone_number, String mail_id, String name) {
        this.userId = userId;
        this.password = password;
        this.phone_number = phone_number;
        this.mail_id = mail_id;
        this.name = name;
    }

    public String name() {
        return name;
    }

    public String phone_number() {
        return phone_number;
    }

    public String mail_id() {
        return mail_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, password);
    }

    public String userId() {
        return userId;
    }

    public String password() {
        return password;
    }
}

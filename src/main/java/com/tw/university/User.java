package com.tw.university;

import java.util.Objects;

public class User {
    private final String userId;
    private final String password;

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
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
}

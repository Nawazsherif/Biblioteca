package com.tw.university;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @Test
    public void shouldEquateUserDetails() {
        User user1 = new User("0123-23456", "password", "9876543210", "usermail@gmail.com", "user1", UserType.MEMBER);
        User user2 = new User("0123-23456", "password", "9876543210", "usermail@gmail.com", "user1", UserType.MEMBER);

        assertEquals(user1, user2);
    }

    @Test
    public void shouldEquateHashCodesOfUserWithSameDetails() {
        User user1 = new User("0123-23456", "password", "9876543210", "usermail@gmail.com", "user1", UserType.MEMBER);
        User user2 = new User("0123-23456", "password", "9876543210", "usermail@gmail.com", "user1", UserType.MEMBER);

        assertEquals(user1.hashCode(), user2.hashCode());
    }
}
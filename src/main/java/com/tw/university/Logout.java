package com.tw.university;

public class Logout implements MenuItem {
    @Override
    public String option() {
        return "Logout";
    }

    @Override
    public void select(IBibliotecaApp iBibliotecaApp) {
        LoginItem loginItem = (LoginItem) iBibliotecaApp;
        loginItem.logout();
    }
}

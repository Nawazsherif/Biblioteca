package com.tw.university;

public class Login implements MenuItem {
    private final Library library;

    public Login(Library library) {

        this.library = library;
    }

    @Override
    public String option() {
        return "Login";
    }

    @Override
    public void select(IBibliotecaApp iBibliotecaApp) {
        LoginItem loginItem = (LoginItem) iBibliotecaApp;
        loginItem.login();
    }
}

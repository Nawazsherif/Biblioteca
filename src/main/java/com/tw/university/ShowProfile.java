package com.tw.university;

public class ShowProfile implements MenuItem {

    @Override
    public String option() {
        return "My profile";
    }

    @Override
    public void select(IBibliotecaApp iBibliotecaApp) {
        iBibliotecaApp.showProfile();
    }
}

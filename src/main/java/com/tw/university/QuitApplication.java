package com.tw.university;

import static java.lang.System.exit;

public class QuitApplication implements MenuItem {
    @Override
    public String option() {
        return "Quit application";
    }

    @Override
    public void select(BibliotecaUI bibliotecaUI) {
        exit(0);
    }
}

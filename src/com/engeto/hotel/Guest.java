package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {
    ///region Atributy
    private String name;
    private LocalDate dayOfBirth;
///endregion

    ///region Přístupové metody

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    ///endregion

    ///region Konstruktory

    public Guest(String name, LocalDate dayOfBirth) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
    }
    public Guest() {
        this.name = ("Jan Solanský");
        this.dayOfBirth = LocalDate.of(2000,2,20);
    }
    ///endregion

    }

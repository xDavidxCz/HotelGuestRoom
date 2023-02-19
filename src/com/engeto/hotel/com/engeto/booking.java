package com.engeto.hotel.com.engeto;

import com.engeto.hotel.Guest;

import java.time.LocalDate;
import java.util.ArrayList;

public class booking {
    ///region Atributy

   private String guestName;
   private LocalDate dayOfBirth,dayOfBirth2;
   private int numberOfRoom;
   private LocalDate checkIn;
   private LocalDate checkOut;
   private String typeOfVacation;
///endregion

    ///region Přístupové metody
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public LocalDate getDayOfBirth2() {
        return dayOfBirth2;
    }

    public void setDayOfBirth2(LocalDate dayOfBirth2) {
        this.dayOfBirth2 = dayOfBirth2;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;

    }
///endregion

    ///region Konstruktory
    public booking(String guestName, LocalDate dayOfBirth,
                   int numberOfRoom, LocalDate checkIn, LocalDate checkOut, String typeOfVacation) {
        this.guestName = guestName;
        this.dayOfBirth = dayOfBirth;
        this.numberOfRoom = numberOfRoom;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
    }
    public booking() {
        this.guestName = "František";
        this.dayOfBirth = LocalDate.of(2001,5,6);
        this.dayOfBirth2 = LocalDate.of(2000,1,6);
        this.numberOfRoom = (2);
        this.checkIn = LocalDate.of(2021,1,6);
        this.checkOut = LocalDate.of(2021,1,5);
        this.typeOfVacation = "pracovní";
}
///endregion






    }









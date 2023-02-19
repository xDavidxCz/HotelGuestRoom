package com.engeto.hotel;

public class Rooms {
    ///region Atributy

    private int numberOfRoom;
    private int roomPricePerNight;
    private int numberOfBets;
    private String typeOfRoom;
///endregion

    ///region Přístupové metody

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getRoomPricePerNight() {
        return roomPricePerNight;
    }

    public void setRoomPricePerNight(int roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    public int getNumberOfBets() {
        return numberOfBets;
    }

    public void setNumberOfBets(int numberOfBets) {
        this.numberOfBets = numberOfBets;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

///endregion

    ///region Konstruktory


    public Rooms(int numberOfRoom, int roomPricePerNight,
                 int numberOfBets, String typeOfRoom) {
        this.numberOfRoom = numberOfRoom;
        this.roomPricePerNight = roomPricePerNight;
        this.numberOfBets = numberOfBets;
        this.typeOfRoom = typeOfRoom;


    }
    public Rooms() {
        this.numberOfRoom = 5;
        this.roomPricePerNight = 1000;
        this.numberOfBets = 3;
        this.typeOfRoom = "balcony";}
///endregion
}




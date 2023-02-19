import com.engeto.hotel.Guest;
import com.engeto.hotel.Rooms;
import com.engeto.hotel.com.engeto.booking;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        booking booking1,booking2;

        Guest guest1 = new Guest("Adéla Malíková ", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan Dvořáček ", LocalDate.of(1995, 5, 5));

        System.out.println(guest1.getName() + guest1.getDayOfBirth());
        System.out.println(guest2.getName() + guest2.getDayOfBirth());

        new Guest();

        Rooms room1 = new Rooms(1, 1000, 1, "s balkonem a výhledem na moře ");
        Rooms room2 = new Rooms(2, 1000, 1, "s balkonem a výhledem na moře ");
        Rooms room3 = new Rooms(3, 2400, 3, "bez balkonu s výhledem na moře ");

        System.out.println("Pokoj číslo " + room1.getNumberOfRoom() + " za cenu "
                + room1.getRoomPricePerNight() + " Kč/noc" + " s "
                + room1.getNumberOfBets() + " postelí " + room1.getTypeOfRoom());
        System.out.println("Pokoj číslo " + room2.getNumberOfRoom() + " za cenu "
                + room2.getRoomPricePerNight() + " Kč/noc" + " s "
                + room2.getNumberOfBets() + " postelí " + room2.getTypeOfRoom());
        System.out.println("Pokoj číslo " + room3.getNumberOfRoom() + " za cenu "
                + room3.getRoomPricePerNight() + " Kč/noc" + " s "
                + room3.getNumberOfBets() + " postelemi " + room3.getTypeOfRoom());

        new Rooms();

        booking1 = new booking();
        booking1.setGuestName("Adéla Malíková");
        booking1.setDayOfBirth(LocalDate.of(1993,3,13));
        booking1.setNumberOfRoom(1);
        booking1.setCheckIn(LocalDate.of(2021,7,19));
        booking1.setCheckOut(LocalDate.of(2020,7,26));
        booking1.setTypeOfVacation(" rekreační pobyt");

        booking2 = new booking();
        booking2.setGuestName("Adéla Malíková" + " Jan Dvořáček");
        booking2.setDayOfBirth(LocalDate.of(1993,3,13));
        booking2.setDayOfBirth2(LocalDate.of(1995,5,5));
        booking2.setNumberOfRoom(3);
        booking2.setCheckIn(LocalDate.of(2021,9,1));
        booking2.setCheckOut(LocalDate.of(2021,9,14));
        booking2.setTypeOfVacation("pracovní pobyt");


        System.out.println(booking1.getGuestName() +" " +  booking1.getDayOfBirth() +" Pokoj číslo " +  booking1.getNumberOfRoom()
        +" checkIn " + booking1.getCheckIn() +" checkOut " + booking1.getCheckOut() + " " + booking1.getTypeOfVacation());

        System.out.println(booking2.getGuestName());
        System.out.println(booking2.getDayOfBirth() + " " + booking2.getDayOfBirth2());
        System.out.println("Pokoj číslo " + booking2.getNumberOfRoom() + " checkIn "
                + booking2.getCheckIn() + " checkOut " + booking2.getCheckOut() + " " +booking2.getTypeOfVacation());


        ArrayList<booking> bookingList = new ArrayList<>();



        bookingList.add(booking1);
        bookingList.add(booking2);

        for (booking booking : bookingList)

        System.out.println(booking.getGuestName() + " " + booking.getDayOfBirth() +" "  + booking.getNumberOfRoom()+ " " +
                booking.getCheckIn()+ " " + booking.getCheckOut()+ " " + booking.getTypeOfVacation());


























        {

        }

        }
    }





























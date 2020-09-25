package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private String Name;
    private Room room;

    public void addRoom(Room room){
        this.room=room;
    }

    public String getName() {
        return Name;
    }

    public Hotel(String comfort_poo_inn) {
        reservations = new ArrayList<>();
        Name = comfort_poo_inn;
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}

package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private String Name;
    private ArrayList<Room > rooms;
    private int sizeRooms;

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getName() {
        return Name;
    }

    public Hotel(String comfort_poo_inn) {
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
        Name = comfort_poo_inn;
    }

    public void addRoom(Room room){
        rooms.add(room);
        sizeRooms++;
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

    public ArrayList<Room> getRooms(){
        return  rooms;
    }
}

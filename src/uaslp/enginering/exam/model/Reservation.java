package uaslp.enginering.exam.model;

public class Reservation {
    private int RoomNumber;
    private String ArrivalDate;
    private Guest guest;
    private int Nights;

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getArrivalDate() {
        return ArrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public int getNights() {
        return Nights;
    }

    public void setNights(int nights) {
        Nights = nights;
    }
}

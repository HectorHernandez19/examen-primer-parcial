package uaslp.enginering.exam.model;

public class Room {
    private int RoomNumber;
    private String RoomDescription;
    private RoomStatus RoomStatus;

    public Room(int roomNumber, String roomDescription, RoomStatus roomStatus) {
        RoomNumber = roomNumber;
        RoomDescription = roomDescription;
        RoomStatus = roomStatus;
    }
}

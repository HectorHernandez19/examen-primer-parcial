package uaslp.enginering.exam.model;

public class Room {
    private int RoomNumber;
    private String RoomDescription;
    private RoomStatus RoomStatus;

    public int getNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getRoomDescription() {
        return RoomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        RoomDescription = roomDescription;
    }

    public uaslp.enginering.exam.model.RoomStatus getStatus() {
        return RoomStatus;
    }

    public void setRoomStatus(uaslp.enginering.exam.model.RoomStatus roomStatus) {
        RoomStatus = roomStatus;
    }

    public Room(int roomNumber, String roomDescription, RoomStatus roomStatus) {
        RoomNumber = roomNumber;
        RoomDescription = roomDescription;
        RoomStatus = roomStatus;
    }
}

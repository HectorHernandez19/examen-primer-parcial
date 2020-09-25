package uaslp.enginering.exam.model;

public class RoomStatus {
    private boolean Limpio;

    public boolean CLEAN(){
        Limpio = true;
        return true;
    }

    public boolean DIRTY() {
        Limpio = false;
        return false;
    }
}

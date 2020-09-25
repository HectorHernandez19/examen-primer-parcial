package uaslp.enginering.exam.model;

public enum RoomStatus {
    private boolean Limpio;

    public CLEAN{
        Limpio = true;
    }

    public DIRTY{
        Limpio = false;
    }
}

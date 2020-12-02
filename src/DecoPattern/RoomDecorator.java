package DecoPattern;

public abstract class RoomDecorator implements Room {

    protected Room room;

    public RoomDecorator() {
    }

    public RoomDecorator(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

package state.door;

public interface DoorState {
    void lock(Door ctx);
    void unlock(Door ctx);
    void open(Door ctx);
    void close(Door ctx);
    String name();
}

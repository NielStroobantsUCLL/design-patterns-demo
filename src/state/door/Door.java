package state.door;

public class Door {
    private final DoorState locked = new LockedState();
    private final DoorState closed = new ClosedState();
    private final DoorState open   = new OpenState();

    private DoorState state = locked; // start: LOCKED

    void setState(DoorState state) { this.state = state; }

    DoorState lockedState() { return locked; }
    DoorState closedState() { return closed; }
    DoorState openState()   { return open;  }

    public String state() { return state.name(); }

    public void lock()   { state.lock(this); }
    public void unlock() { state.unlock(this); }
    public void open()   { state.open(this); }
    public void close()  { state.close(this); }
}

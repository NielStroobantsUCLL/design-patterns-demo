package state.door;

public class LockedState implements DoorState {
    @Override public void lock(Door ctx)   { System.out.println("[LOCKED] already locked."); }
    @Override public void unlock(Door ctx) { System.out.println("[LOCKED] → CLOSED"); ctx.setState(ctx.closedState()); }
    @Override public void open(Door ctx)   { System.out.println("[LOCKED] cannot open. Unlock first."); }
    @Override public void close(Door ctx)  { System.out.println("[LOCKED] nothing to close."); }
    @Override public String name() { return "LOCKED"; }
}

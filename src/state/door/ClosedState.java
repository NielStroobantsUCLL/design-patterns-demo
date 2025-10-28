package state.door;

public class ClosedState implements DoorState {
    @Override public void lock(Door ctx)   { System.out.println("[CLOSED] → LOCKED"); ctx.setState(ctx.lockedState()); }
    @Override public void unlock(Door ctx) { System.out.println("[CLOSED] already unlocked."); }
    @Override public void open(Door ctx)   { System.out.println("[CLOSED] → OPEN");   ctx.setState(ctx.openState()); }
    @Override public void close(Door ctx)  { System.out.println("[CLOSED] already closed."); }
    @Override public String name() { return "CLOSED"; }
}

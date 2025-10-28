package state.door;

public class OpenState implements DoorState {
    @Override public void lock(Door ctx)   { System.out.println("[OPEN] cannot lock when open. Close first."); }
    @Override public void unlock(Door ctx) { System.out.println("[OPEN] already unlocked."); }
    @Override public void open(Door ctx)   { System.out.println("[OPEN] already open."); }
    @Override public void close(Door ctx)  { System.out.println("[OPEN] → CLOSED"); ctx.setState(ctx.closedState()); }
    @Override public String name() { return "OPEN"; }
}

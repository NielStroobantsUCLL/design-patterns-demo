package state.door;

public class Demo {
    public static void main(String[] args) {
        Door door = new Door();
        System.out.println("State = " + door.state()); // LOCKED

        door.open();    // kan niet
        door.unlock();  // LOCKED → CLOSED
        System.out.println("State = " + door.state());

        door.open();    // CLOSED → OPEN
        System.out.println("State = " + door.state());

        door.lock();    // kan niet (open)
        door.close();   // OPEN → CLOSED
        System.out.println("State = " + door.state());

        door.lock();    // CLOSED → LOCKED
        System.out.println("State = " + door.state());
    }
}

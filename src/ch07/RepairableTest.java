package ch07;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();

        Marlin marlin = new Marlin();
        SCV scv = new SCV();
        scv.repair(tank);
        scv.repair(dropShip);
        // scv.repair(marlin);
    }
}

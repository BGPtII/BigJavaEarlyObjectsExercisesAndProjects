package chapterthree.practiceexercises.rangeinput;

public class CarTempController {
    public static void main(String[] args) {
        RangeInput passengerSeatController = new RangeInput(60, 80);
        RangeInput frontSeatController = passengerSeatController;
        System.out.println("Passenger Seat Controller (expected: 70): actual " +
                passengerSeatController.getCurrentValue());
        System.out.println("Front Seat Controller (expected 70): actual " +
                frontSeatController.getCurrentValue());

        for (int i = 0; i < 20; i++) {
            passengerSeatController.up();
        }
        System.out.println("Front Seat Controller (expected 80): actual "
            + frontSeatController.getCurrentValue());

        for (int i = 0; i < 20; i++) {
            frontSeatController.down();
        }
        System.out.println("Passenger Seat Controller (expected 60): actual "
            + passengerSeatController.getCurrentValue());
    }
}

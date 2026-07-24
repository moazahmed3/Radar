import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        QuRadar radar = new QuRadar();

        radar.addRule(new SpeedRule());
        radar.addRule(new SeatbeltRule());

        radar.observe(new Observation(
                "ABC1234",
                LocalDate.now(),
                "Private",
                94,
                false
        ));

        radar.observe(new Observation(
                "XYZ999",
                LocalDate.now(),
                "Truck",
                70,
                true
        ));

        radar.observe(new Observation(
                "EEE111",
                LocalDate.now(),
                "Private",
                70,
                true
        ));

        radar.getAllPossibleFines();

        radar.printViolatedRules();

    }

}
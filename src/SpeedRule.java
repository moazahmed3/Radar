public class SpeedRule implements Rule {

    @Override
    public Violation check(Observation o) {

        int maxSpeed = 0;

        if (o.getCarType().equalsIgnoreCase("Truck")) {
            maxSpeed = 60;
        }

        else if (o.getCarType().equalsIgnoreCase("Private")) {
            maxSpeed = 80;
        }

        else {
            return null;
        }

        if (o.getSpeed() > maxSpeed) {

            return new Violation(
                    "speed of " + o.getSpeed() + " exceeded max allowed " + maxSpeed,
                    300
            );
        }

        return null;
    }

    @Override
    public String getRuleName() {
        return "Speed Rule";
    }
}
public class SeatbeltRule implements Rule {

    @Override
    public Violation check(Observation o) {

        if (!o.isSeatbelt()) {
            return new Violation("Seatbelt not fastned",100);
        }

        return null;
    }

    @Override
    public String getRuleName() {
        return "Seatbelt Rule";
    }
}
import java.util.ArrayList;
import java.util.List;

public class Fine {

    private String plateNumber;
    private List<Violation> violations = new ArrayList<>();

    public Fine(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void addViolation(Violation violation) {
        violations.add(violation);
    }

    public int getTotalAmount() {

        int total = 0;

        for (Violation v : violations) {
            total += v.getFee();
        }

        return total;
    }

    public List<Violation> getViolations() {
        return violations;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void printFine() {

        System.out.println("Traffic for car " + plateNumber);
        System.out.println("Total amount: " + getTotalAmount() + " EGP");
        System.out.println("Violations:");

        for (Violation v : violations) {
            System.out.println("- " + v.getDescription() + " : " + v.getFee() + " EGP");
        }

        System.out.println();
    }
}
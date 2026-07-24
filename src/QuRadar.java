import java.util.*;

public class QuRadar {

    private List<Rule> rules = new ArrayList<>();
    private List<Fine> fines = new ArrayList<>();
    private Map<String,Integer> violatedRules = new HashMap<>();

    public void addRule(Rule rule){
        rules.add(rule);
    }

    public void observe(Observation observation){

        Fine fine = new Fine(observation.getPlateNumber());

        for(Rule rule : rules){

            Violation violation = rule.check(observation);

            if(violation != null){

                fine.addViolation(violation);

                violatedRules.put(
                        rule.getRuleName(),
                        violatedRules.getOrDefault(rule.getRuleName(),0)+1
                );
            }

        }

        if(!fine.getViolations().isEmpty()){

            fines.add(fine);

            fine.printFine();
        }

    }

    public void getAllPossibleFines(){

        System.out.println("All Fines");

        for(Fine fine : fines){

            System.out.println(
                    fine.getPlateNumber()+
                            " -> "+
                            fine.getTotalAmount()+" EGP"
            );

        }

    }

    public void printViolatedRules(){

        System.out.println("\nRules Count");

        for(String rule : violatedRules.keySet()){

            System.out.println(rule+" : "+violatedRules.get(rule));

        }

    }

}
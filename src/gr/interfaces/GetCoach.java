package gr.interfaces;

public class GetCoach {

    public Coach getCoach(String coachType) {
        if (coachType == null) {
            return null;
        }
        if (coachType.equalsIgnoreCase("FOOTBALL")) {
            return new Football();
        } else if (coachType.equalsIgnoreCase("BASKETBALL")) {
            return new Basketball();
        } else if (coachType.equalsIgnoreCase("TENNIS")) {
            return new Tennis();
        } else if (coachType.equalsIgnoreCase("CROSSFIT")) {
            return new Crossfit();
        }
        return null;
    }
}


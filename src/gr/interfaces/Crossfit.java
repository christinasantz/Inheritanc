package gr.interfaces;

public class Crossfit implements Coach {
    @Override
    public void warmup() {
        System.out.println("10 minutes warmup before starting Crossfit!");
    }

    @Override
    public void training() {
        System.out.println("Crossfit training is about 60 minutes. It includes weightlifting & hiit training.");
    }

    @Override
    public void recovery() {
        System.out.println("Crossfit Recovery is about 10 minutes and includes several stretching exercises");
    }

}
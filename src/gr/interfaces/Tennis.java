package gr.interfaces;

public class Tennis implements Coach {
    @Override
    public void warmup() {
        System.out.println("30 minutes warmup before starting tennis!");
    }

    @Override
    public void training() {
        System.out.println("Tennis training is about 60 minutes. We will learn basic tennis techniques.");
    }

    @Override
    public void recovery() {
        System.out.println("Tennis Recovery is about 30 minutes and includes several stretching exercises");
    }

}
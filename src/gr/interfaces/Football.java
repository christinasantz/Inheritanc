package gr.interfaces;

public class Football implements Coach {
    @Override
    public void warmup() {
        System.out.println("30 minutes warmup before starting football!");
    }

    @Override
    public void training() {
        System.out.println("Football training is about 60 minutes. We will learn basic football techniques.");
    }

    @Override
    public void recovery() {
        System.out.println("Football Recovery is about 30 minutes and includes several stretching exercises");
    }

}

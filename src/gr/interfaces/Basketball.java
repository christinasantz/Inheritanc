package gr.interfaces;

public class Basketball implements Coach {
    @Override
    public void warmup() {
        System.out.println("30 minutes warmup before starting basketball!");
    }

    @Override
    public void training() {
        System.out.println("Basketball training is about 60 minutes. We will learn basic basketball techniques.");
    }

    @Override
    public void recovery() {
        System.out.println("Basketball Recovery is about 30 minutes and includes several stretching exercises");
    }

}
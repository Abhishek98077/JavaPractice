package Labs.arrays.OOPs.abstraction.interfaces.realTimeExampl;

public class car implements engine , breakk{
    void start(){
        System.out.println("starting car");
        startEngine();
        breakMethod();
    }

    @Override
    public void startEngine() {
        System.out.println("engineStarted");
    }

    @Override
    public void breakMethod() {
        System.out.println("breaking car");
    }
}

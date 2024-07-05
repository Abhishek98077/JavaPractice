package Labs.arrays.OOPs.Polumorphism.methodOverloading;

public class runner {
    public static void main(String[] args) {
        person p = new person();
        p.Speak(456);
        p.Speak("Hello World");
        p.Speak(12.5);
    }
}

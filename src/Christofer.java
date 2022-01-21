public class Christofer extends Animal {
    Christofer(String name, int weight, int height, int birthYear) {
        super(name, weight, height, birthYear);
    }

    public void offend(BabyRoo babyRoo){
        System.out.println(", что " + name + " никому не позволит обидеть " + babyRoo + ".");
    }
}

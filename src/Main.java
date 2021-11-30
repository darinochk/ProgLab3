public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        BabyRoo babyRoo = new BabyRoo();
        Vinny vinny = new Vinny();
        Kenga kenga = new Kenga();

        kenga.say(babyRoo, rabbit, vinny);
        babyRoo.net();
        rabbit.sit();
        rabbit.play(babyRoo);
        rabbit.love(babyRoo);
        vinny.tryToBe(kenga);
        vinny.learnToJump();
    }
}

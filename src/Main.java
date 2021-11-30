public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Кролик", 11, 13, 18);
        BabyRoo babyRoo = new BabyRoo("Крошка Ру", 3, 7, 17);
        Vinny vinny = new Vinny("Пух", 18, 30, 18);
        Kenga kenga = new Kenga("Кенга", 14, 13, 12);

        kenga.say(babyRoo, rabbit, vinny);
        babyRoo.net();
        rabbit.sit();
        rabbit.play(babyRoo);
        rabbit.love(babyRoo);
        vinny.tryToBe(kenga);
        vinny.learnToJump();
    }
}

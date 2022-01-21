public class Main {
    public static void main(String[] args) throws Exception{

        int count = 1;
        int count1 = 2;
        if (count < 0 || count1 < 0) {
            throw new NumberOfMinutes("Отрицательное колич§ество минут");
        }

        MovesInArea winnieThePooh = new MovesInArea() {
            @Override
            public String getName() {
                return "Винни-Пух";
            }
        };

        IVinnyActions vinny = new Vinny("Пух", 18, 30, 18);
        Kenga kenga = new Kenga("Кенга", 14, 13, 12, 3);
//        if ((vinny.getPlace() == null) || (kenga.getPlace() == null)) {
//            throw new IsLocation("не задана локация");
//        }

        IRabbitActions rabbit = new Rabbit("Кролик", 11, 13, 18);
        BabyRoo babyRoo = new BabyRoo("Крошка Ру", 3, 7, 17);
        Christofer christofer = new Christofer("Кристофер Робин", 45, 15, 17);
        Minipig minipig = new Minipig("Пятачок", 10, 5, 5);

        kenga.look();
        kenga.scary();
        christofer.offend(babyRoo);
        kenga.say(babyRoo, rabbit, vinny);
        babyRoo.net();
        rabbit.sit();
        rabbit.play(babyRoo);
        rabbit.love(babyRoo);
        vinny.tryToBe(kenga);
        vinny.learnToJump();
        minipig.voice();
        minipig.see(kenga);
    }
}

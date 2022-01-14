import java.util.Objects;

public class Kenga extends Animal {
    Kenga(String name, int weight, int height, int birthYear) {
        super(name, weight, height, birthYear);
    }

    public void say(Animal babyRoo, IRabbitActions rabbit, IVinnyActions vinny) {
        System.out.println("Хорошо, - сказала " + name + " про себя, - раз " + babyRoo + ", " + vinny + " и " + rabbit + " решили меня разыграть, я их сама разыграю.");
    }

}







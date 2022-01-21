import static java.lang.Math.*;

public class Vinny extends Animal implements IVinnyActions {
    Vinny(String name, int weight, int height, int birthYear) {
        super(name, weight, height, birthYear);
    }
    double chance;
    int skill = 3;

    public void jump() {
        chance = random();
    }

    public class Hadn{
        public void hand(){};
    }

    @Override
    public void tryToBe(Kenga kenga) {
        System.out.print("A " + name + ", который решил попробовать стать " + kenga);
    }
//
//    public Place getLoc() {
//        return place;
//    }

    @Override
    public void learnToJump() {
        place = Place.PLAYGROUND;
        int successfulJumpsCounter = 0;
        int jumps = 5;
        System.out.print(", всё ещё учился прыгать в "+ place.getName()+ " и сделал 5 прыжков:\n");
        for (int i = 1; i <= jumps; i++) {
            jump();
            System.out.print(i + ". ");
            if (chance >= 0.5) {
                System.out.println("прыжок удался.");
                successfulJumpsCounter++;
                skill++;
            }
            else {
                System.out.println("прыжок не удался.");
            }
        }
        System.out.println("Итого " + name + " прыгнул успешно " + successfulJumpsCounter + " раза из " + jumps);
    }
}

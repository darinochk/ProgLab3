import static java.lang.Math.*;

public class Vinny extends Animal implements IVinnyActions {
    double chance;
    int skill = 3;

    Vinny(){
        this.name = "Пух";
    }

    public void jump() {
        chance = random();
    }

    @Override
    public void tryToBe(Kenga kenga) {
        System.out.print("A " + name + ", который решил попробовать стать " + kenga);
    }

    @Override
    public void learnToJump() {
        place = Place.PLAYGROUND;
        int successfulJumpsCounter = 0;
        int jumps = 5;
        System.out.print(", всё ещё учился прыгать в ямке с песком и сделал 5 прыжков:\n");
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

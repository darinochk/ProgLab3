import static java.lang.Math.*;
public class Vinny extends Animal implements IVinnyActions {

    int ju;
    int skill = 3;

    Vinny(){
        this.name = "Пух";
    }

    public void jump() {
        ju = (int)(Math.random());
    }

    @Override
    public void tryToBe(Kenga kenga) {
        System.out.print("A " + name + ", который решил попробовать стать " + kenga);
    }

    @Override
    public void learnToJump() {
        place = Place.PLAYGROUND;

        System.out.print(", всё ещё учился прыгать в ямке с песком, сейчас его ");
        if (ju < 0.5) {
            System.out.print("прыжок не удался.");
        }
        if (ju >= 0.5) {
            System.out.print("прыжок удался.");
            skill = skill + 1;
        }
    }
}


//    @Override
//    public boolean equals(Object o) {
//        if (skill >= 4) {return true;};
//        if (skill < 4) {return false;};
//    }
import java.util.Objects;

public class Kenga extends Animal {

    Kenga(){
        this.name = "Кенга";
    }

    public void say(BabyRoo babyRoo, Rabbit rabbit, Vinny vinny) {
        System.out.println("Хорошо, - сказала " + name + " про себя, - раз " + babyRoo + ", " + vinny + " и " + rabbit + " решили меня разыграть, я их сама разыграю.");
    }

}




//    @Override
//    public boolean equals(Object o) {
//        if (o == this) {
//            return true;
//        }
//        if (o == null || o.getClass() != this.getClass()) {
//            return false;
//        }
//        Kenga ken = (Kenga) o;
//        return Objects.equals(name, ken.name);
//    }


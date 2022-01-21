import java.util.Objects;

public class Kenga extends Animal {
    public int seconds;
    Kenga(String name, int weight, int height, int birthYear, int seconds) {
        super(name, weight, height, birthYear);
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void say(Animal babyRoo, IRabbitActions rabbit, IVinnyActions vinny) {
        System.out.println("Хорошо, - сказала " + name + " про себя, - раз " + babyRoo + ", " + vinny + " и " + rabbit + " решили меня разыграть, я их сама разыграю.");
    }

    public void scary() {
        System.out.print("В первую секунду она чуть было  не испугалась,  но  сразу  поняла, что пугаться нечего, ведь она была вполне уверена");
    }

    public void look() {
        class Clothes {
            String watch(Object what) {
                return " расстегнула свой " + what;
            }
        }

        place = Place.HOME;

        Clothes clothes = new Clothes();
        Kenga.Pocket pocket = new Kenga.Pocket();
        if (pocket.getCondition()) {
            pocket.openPocket();
        } else {
            pocket.closePocket();
        }
        System.out.print("Конечно, " + place.getName() + "а, как только " + getName() + clothes.watch(pocket) + ", " + getName());
        System.out.println(" заметила, что ничего не произошло.");
    }

    public static class Pocket {
        private boolean isClosed = true;

        public void closePocket() {
            isClosed = true;
        }

        public void openPocket() {
            isClosed = false;
        }

        public boolean getCondition() {
            return isClosed;
        }

        @Override
        public String toString() {
            return "карман";
        }
    }

    public void zeroException() throws zeroException {
        int a = (int) (Math.round(Math.random() + 1));
        if (a != 0) {
            this.seconds += seconds / a;
        } else {
            throw new zeroException("zeroException");
        }
    }

    class zeroException extends RuntimeException {
        public zeroException(String message) {
            super(message);
        }
    }
}


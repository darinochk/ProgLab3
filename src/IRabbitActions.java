import static java.lang.Math.*;

public interface IRabbitActions {
    public void sit();

    public void play(BabyRoo babyRoo);

    public void love(BabyRoo babyRoo);

    IRabbitActions anonym = new IRabbitActions() {
        @Override
        public void sit() {
            System.out.println("сидеть");
        }

        @Override
        public void play(BabyRoo babyRoo) {
            System.out.println("");
        }

        @Override
        public void love(BabyRoo babyRoo) {
            double mylove = 10;
            mylove += random();
        }
    };

}

public class Rabbit extends Animal implements IRabbitActions {


    Rabbit(){
        this.name = "Кролик";
    }

    @Override
    public void sit(){
        place = Place.HOME;
        System.out.print(name + " сидит");
    }

    @Override
    public void play(BabyRoo babyRoo){
        System.out.print( " и играет с " + babyRoo);
    }

    @Override
    public void love(BabyRoo babyRoo) {
        System.out.println( ", чувствуя, что любит " + babyRoo + " всё больше и больше. ");
    }

}

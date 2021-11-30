public class BabyRoo extends Animal{
    BabyRoo(String name, int weight, int height, int birthYear) {
        super(name, weight, height, birthYear);
    }

    public void play(Rabbit rabbit){
        System.out.println("играет c" + rabbit);
    }

    public void net(){
        System.out.println("Но никого не было. ");
    }


}

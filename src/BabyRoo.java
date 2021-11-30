public class BabyRoo extends Animal{
    public BabyRoo() {
        this.name = "Крошка Ру";
    }

    public void play(Rabbit rabbit){
        System.out.println("играет c" + rabbit);
    }

    public void net(){
        System.out.println("Но никого не было. ");
    }


}

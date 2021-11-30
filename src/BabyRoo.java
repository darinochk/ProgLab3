public class BabyRoo extends Animal{
    public void play(Rabbit rabbit){
        System.out.println("играет c" + rabbit);
    }
    @Override
    public String toString(){
        return "Крошка Ру";
    }
    public void net(){
        System.out.println("Но никого не было. ");
    }
}

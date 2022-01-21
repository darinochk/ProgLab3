import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected Place place;
    protected int birthYear;
    protected int weight;
    protected int height;

    Animal(String name, int weight, int height, int birthYear){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Animal ann = (Animal) o;
        return Objects.equals(name, ann.name);
    }
    @Override
    public int hashCode (){
        return Objects.hash(name, weight, height, birthYear);
    }
}

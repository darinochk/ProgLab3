public enum Place {
    HOME("дом"),
    PLAYGROUND("игровая площадка");
    private final String name;
    Place (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

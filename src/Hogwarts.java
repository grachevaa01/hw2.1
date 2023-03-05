public abstract class Hogwarts {
    private String name;
    private int levelOfMagic;
    private int distance;

    public Hogwarts(String name, int levelOfMagic, int distance) {
        this.name = name;
        this.levelOfMagic = levelOfMagic;
        this.distance = distance;
    }

    public int getLevelOfMagic() {
        return levelOfMagic;
    }

    public void setLevelOfMagic(int levelOfMagic) {
        this.levelOfMagic = levelOfMagic;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void compare (Hogwarts hogwarts){
        if (this.levelOfMagic > this.distance){
            System.out.println(this.getName() + " лучше чем " + hogwarts.getName());
        }
        else {
            System.out.println(hogwarts.getName() + " лучше чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return " Hogwarts { " +
                "levelOfMagic = "
                + levelOfMagic
                +
                ", distance = "
                + distance
                +
                '}';
    }
}

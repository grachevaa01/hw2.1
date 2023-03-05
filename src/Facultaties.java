public abstract class Facultaties {
    private int levelOfMagic;
    private int distance;

    public Facultaties ( int levelOfMagic, int distance) {
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
    public boolean compare (Facultaties facultaties){
        return this.levelOfMagic + this.distance > facultaties.levelOfMagic + facultaties.distance;

    }

    @Override
    public String toString() {
        return "Facultaties {" +
                "levelOfMagic=" + levelOfMagic +
                ", distance=" + distance +
                '}';
    }
}

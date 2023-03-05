public class RavenClawfaculty extends Facultaties{
    private int wit;
    private int strategy;
    private int boldness;

    public RavenClawfaculty(int levelOfMagic, int distance, int wit, int strategy, int boldness) {
        super(levelOfMagic, distance);
        this.wit = wit;
        this.strategy = strategy;
        this.boldness = boldness;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getStrategy() {
        return strategy;
    }

    public void setStrategy(int strategy) {
        this.strategy = strategy;
    }

    public int getBoldness() {
        return boldness;
    }

    public void setBoldness(int boldness) {
        this.boldness = boldness;
    }
    private int calculatelevelOfMagic(){
        return this.wit + this.strategy + this.boldness;
    }
    public boolean compare (RavenClawfaculty ravenClawfaculty){
        return this.calculatelevelOfMagic() > ravenClawfaculty.calculatelevelOfMagic();
    }

    @Override
    public String toString() {
        return "RavenClawfaculty{" +
                "wit=" + wit +
                ", strategy=" + strategy +
                ", boldness=" + boldness +
                "} " + super.toString();
    }
}

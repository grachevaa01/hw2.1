public class RavenClawFaculty extends Hogwarts {
    private int wit;
    private int strategy;
    private int boldness;

    public RavenClawFaculty(String name, int levelOfMagic, int distance, int wit, int strategy, int boldness) {
        super(name, levelOfMagic, distance);
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
    public void compare (RavenClawFaculty ravenClawfaculty){
        if (this.calculatelevelOfMagic() > ravenClawfaculty.calculatelevelOfMagic()){
            System.out.println(this.getName() + " лучший Когтевранец чем " + ravenClawfaculty.getName());
        } else if (this.calculatelevelOfMagic() == ravenClawfaculty.calculatelevelOfMagic()){
            System.out.println(this.getName() + " равны " + ravenClawfaculty.getName());
        } else {
            System.out.println(ravenClawfaculty.getName() + " лучший Когтевранец чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return " RavenClawFaculty { " +
                "wit = " + wit +
                ", strategy = " +
                strategy +
                ", boldness = " +
                boldness +
                "} " +
                super.toString();
    }
}

public class Slytherinfaculty extends Facultaties {
    private int quirkiness;
    private int darkMagic;
    private int intellect;

    public Slytherinfaculty(int levelOfMagic, int distance, int quirkiness, int darkMagic, int intellect) {
        super(levelOfMagic, distance);
        this.quirkiness = quirkiness;
        this.darkMagic = darkMagic;
        this.intellect = intellect;
    }

    public int getQuirkiness() {
        return quirkiness;
    }

    public void setQuirkiness(int quirkiness) {
        this.quirkiness = quirkiness;
    }

    public int getDarkMagic() {
        return darkMagic;
    }

    public void setDarkMagic(int darkMagic) {
        this.darkMagic = darkMagic;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }
    private int calculatelevelOfMagic(){
        return this.quirkiness + this.darkMagic + this.intellect;
    }
    public boolean compare (Slytherinfaculty slytherinfaculty){
        return this.calculatelevelOfMagic() > slytherinfaculty.calculatelevelOfMagic();
    }

    @Override
    public String toString() {
        return "Slytherinfaculty{" +
                "Facultaties = "
                + super.toString()
                +
                "quirkiness=" + quirkiness +
                ", darkMagic=" + darkMagic +
                ", intellect=" + intellect +
                '}';
    }
}

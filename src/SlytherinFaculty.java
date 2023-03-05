public class SlytherinFaculty extends Hogwarts {
    private int quirkiness;
    private int darkMagic;
    private int intellect;

    public SlytherinFaculty(String name, int levelOfMagic, int distance, int quirkiness, int darkMagic, int intellect) {
        super(name , levelOfMagic, distance);
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
    public void compare (SlytherinFaculty slytherinfaculty){
        if (this.calculatelevelOfMagic() > slytherinfaculty.calculatelevelOfMagic()){
            System.out.println(this.getName() + " лучше чем " + slytherinfaculty.getName());
        }
        else {
            System.out.println(slytherinfaculty.getName() + " лучше чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return " SlytherinFaculty {" +
                "Hogwarts = "
                + super.toString()
                +
                " quirkiness = " +
                quirkiness +
                ", darkMagic = "
                + darkMagic +
                ", intellect = " +
                intellect +
                '}';
    }
}

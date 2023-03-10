public class GriffindorFaculty extends Hogwarts {
    private int selfSacrifice;
    private int courage;
    private int foxery;

    public GriffindorFaculty(String name, int levelOfMagic, int distance, int selfSacrifice, int courage, int foxery) {
        super(name, levelOfMagic, distance);
        this.selfSacrifice = selfSacrifice;
        this.courage = courage;
        this.foxery = foxery;
    }

    public int getSelfSacrifice() {
        return selfSacrifice;
    }

    public void setSelfSacrifice(int selfSacrifice) {
        this.selfSacrifice = selfSacrifice;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getFoxery() {
        return foxery;
    }

    public void setFoxery(int foxery) {
        this.foxery = foxery;
    }
    private int calculatelevelOfMagic(){
        return this.selfSacrifice + this.courage + this.foxery;
    }
    public void compare (GriffindorFaculty griffindorfaculty){
        if (this.calculatelevelOfMagic() > griffindorfaculty.calculatelevelOfMagic()){
            System.out.println(this.getName() + " лучше чем " + griffindorfaculty.getName());
        }
        else {
            System.out.println(griffindorfaculty.getName() + " лучше чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return " GriffindorFaculty {" +
                "selfSacrifice = " +
                selfSacrifice +
                ", courage = " +
                courage +
                ", foxery = " +
                foxery +
                '}' + super.toString();
    }
}


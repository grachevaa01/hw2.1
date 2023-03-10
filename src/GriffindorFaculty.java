public class GriffindorFaculty extends Hogwarts {
    private int selfSacrifice;
    private int courage;
    private int nobility;

    public GriffindorFaculty(String name, int levelOfMagic, int distance, int selfSacrifice, int courage, int foxery) {
        super(name, levelOfMagic, distance);
        this.selfSacrifice = selfSacrifice;
        this.courage = courage;
        this.nobility = nobility;
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
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    private int calculatelevelOfMagic(){
        return this.selfSacrifice + this.courage + this.nobility;
    }
    public void compare (GriffindorFaculty griffindorfaculty){
        if (this.calculatelevelOfMagic() > griffindorfaculty.calculatelevelOfMagic()){
            System.out.println(this.getName() + " лучший Гриффиндорец чем " + griffindorfaculty.getName());
        } else if  (this.calculatelevelOfMagic() == griffindorfaculty.calculatelevelOfMagic()){
            System.out.println(this.getName() + " равны " + griffindorfaculty.getName());
        } else {
            System.out.println(griffindorfaculty.getName() + " лучший Гриффиндорец чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return " GriffindorFaculty {" +
                "selfSacrifice = " +
                selfSacrifice +
                ", courage = " +
                courage +
                ", nobility = " +
                nobility +
                '}' + super.toString();
    }
}


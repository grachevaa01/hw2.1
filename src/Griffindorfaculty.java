public class Griffindorfaculty extends Facultaties {
    private int selfSacrifice;
    private int courage;
    private int foxery;

    public Griffindorfaculty(int levelOfMagic, int distance, int selfSacrifice, int courage, int foxery) {
        super(levelOfMagic, distance);
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
    public boolean compare (Griffindorfaculty griffindorfaculty){
        return this.calculatelevelOfMagic() > griffindorfaculty.calculatelevelOfMagic();
    }

    @Override
    public String toString() {
        return "Griffindorfaculty{" +
                "selfSacrifice=" + selfSacrifice +
                ", courage=" + courage +
                ", foxery=" + foxery +
                '}' + super.toString();
    }
}


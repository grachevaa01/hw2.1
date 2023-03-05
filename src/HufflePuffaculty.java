public class HufflePuffaculty extends Facultaties {
    private int patience;
    private int loyalty;
    private int honesty;

    public HufflePuffaculty(int levelOfMagic, int distance, int patience, int loyalty, int honesty) {
        super(levelOfMagic, distance);
        this.patience = patience;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getPatience() {
        return patience;
    }

    public void setPatience(int patience) {
        this.patience = patience;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    private int calculatelevelOfMagic(){
        return this.patience + this.loyalty + this.honesty;
    }
    public boolean compare (HufflePuffaculty hufflePuffaculty){
        return this.calculatelevelOfMagic() > hufflePuffaculty.calculatelevelOfMagic();
    }

    @Override
    public String toString() {
        return "HufflePuffaculty{" +
                "patience=" + patience +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}'+ super.toString();
    }
}

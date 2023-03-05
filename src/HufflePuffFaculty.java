public class HufflePuffFaculty extends Hogwarts {
    private int patience;
    private int loyalty;
    private int honesty;

    public HufflePuffFaculty(String name, int levelOfMagic, int distance, int patience, int loyalty, int honesty) {
        super(name, levelOfMagic, distance);
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
    public void compare (HufflePuffFaculty hufflePuffaculty){
        if (this.calculatelevelOfMagic() > hufflePuffaculty.calculatelevelOfMagic()){
            System.out.println(this.getName() + " лучше чем " + hufflePuffaculty.getName());
        }
        else {
            System.out.println(hufflePuffaculty.getName() + " лучше чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return " HufflePuffFaculty {" +
                "patience = " +
                patience +
                ", loyalty = " +
                loyalty +
                ", honesty = " +
                honesty +
                '}'+ super.toString();
    }
}

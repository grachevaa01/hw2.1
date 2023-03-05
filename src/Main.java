public class Main {
    public static void main(String[] args) {
        Slytherinfaculty dracoMalfoy = new Slytherinfaculty(17,40,20, 30, 35);
        System.out.println(dracoMalfoy);
        Griffindorfaculty germionaGranger = new Griffindorfaculty(16,36,40,5,22);
        Griffindorfaculty ronWisley = new Griffindorfaculty( 14, 32,30,10,5);
        System.out.println(germionaGranger.compare(ronWisley));
        System.out.println(dracoMalfoy.compare(ronWisley));
    }

}
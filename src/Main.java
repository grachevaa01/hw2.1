public class Main {
    public static void main(String[] args) {
        SlytherinFaculty dracoMalfoy = new SlytherinFaculty("Драко Малфой", 17,40,20, 30, 35);
        System.out.println(dracoMalfoy);
        GriffindorFaculty germionaGranger = new GriffindorFaculty("Гермиона Грейнджер", 16,36,40,5,22);
        GriffindorFaculty ronWisley = new GriffindorFaculty( "Рон Уизли", 14, 32,30,10,5);
        System.out.println("Запрошенный вариант сравнения: ");
        SlytherinFaculty blazeZabini = new SlytherinFaculty("Блейз Забини", 12, 19,10,6,33);
        SlytherinFaculty theodorNott = new SlytherinFaculty("Теодор Нотт", 16, 25, 20, 63, 36);
        blazeZabini.compare(theodorNott);
        dracoMalfoy.compare(blazeZabini);
        germionaGranger.compare(ronWisley);
    }

}
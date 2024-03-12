import net.paradummies.publications.types.Magazine;
import net.paradummies.publications.types.Novel;
import net.paradummies.publications.types.TextBook;

public class ParaDummiesApp {
    public static void main(String[] args) throws Exception {
        TextBook textBook = new TextBook("BrainFuck", 500, 84092, 13.5f, "2012/04/21", "Programacion", "Introduccion, Variables, Operadores, Funciones, Herencia");
        System.out.println(textBook);
    }
}

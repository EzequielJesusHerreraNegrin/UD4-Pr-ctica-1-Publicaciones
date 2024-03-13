import java.util.Scanner;

import javax.sound.midi.Soundbank;

import net.paradummies.functionalities.ConsumptionTax;
import net.paradummies.functionalities.Menu;
import net.paradummies.publications.Publication;
import net.paradummies.publications.types.Magazine;
import net.paradummies.publications.types.Novel;
import net.paradummies.publications.types.TextBook;

public class ParaDummiesApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        String option = "";
        boolean stillAsking = false;

        do {

            System.out.println("""
                \n----------------Para_Dummies APP----------------
                -MENU:
                a. Añadir una nueva revista.
                b. Añadir un nuevo libro de texto.
                c. Añadir una nueva novela.
                d. Mostrar el listado de todas las publicaciones.
                e. Selección de una publicación y cálculo de su precio en Canarias y en península.
                f. Salir del programa\n
                """);

            option = scanner.nextLine();

            switch (option) {
            case "a":
            System.out.println("""
                Introduce los datos en el orden descrito y separandolos con ', ' y sin parentesis: 
                titulo, (numero de paginas), (codigo isbn), (precio de distribucion), (fecha de ultima modificacion ej:año/mes/dia), 
                (numero de revista), (Nombre de los articulos ej: art1_art2_etc)
            """);
            String magazineInfo = scanner.nextLine();

            Publication.safePublication(menu.addNewMagazine(magazineInfo));

            System.out.println("Revista añadida exitosamente");
                break;

            case "b":
            System.out.println("""
                Introduce los datos en el orden descrito y separandolos con ', ' y sin parentesis: 
                titulo, (numero de paginas), (codigo isbn), (precio de distribucion), (fecha de ultima modificacion ej:año/mes/dia), 
                (Asignatura), (Nombre de los temas ej: tema1_tema2_etc)
            """);
            String textBookInfo = scanner.nextLine();

            Publication.safePublication(menu.addNewTextBook(textBookInfo));

            System.out.println("Libro de texto añadido exitosamente");
                break;

            case "c":
            System.out.println("""
                \nIntroduce los datos en el orden descrito y separandolos con ', ' y sin parentesis: 
                titulo, (numero de paginas), (codigo isbn), (precio de distribucion), (fecha de ultima modificacion ej:año/mes/dia), 
                (numero de temática:
                    0.-Novela Negra
                    1.-Novela historica
                    2.-Novela juvenil), 
                (Autor)\n
                """);
            String novelInfo = scanner.nextLine();

            Publication.safePublication(menu.addNewNovel(novelInfo));

            System.out.println("\nNovela añadida exitosamente");

            break;

            case "d":
                System.out.println("\nLista de publicaciones almacenadas en la base de datos: \n");
                Publication.showAllPublications();
                break;

            case "e":
                System.out.println("\nIntroduzca el ISBN de la pubilcacion que desea consultar:");
                int isbnCatcher = scanner.nextInt();
                ConsumptionTax.calIGICTax(isbnCatcher);
                ConsumptionTax.calIVATax(isbnCatcher);
                scanner.nextLine();
                break;

            case "f":
                stillAsking = true;
                break;
        
            default:
            System.out.println("No se contempla esa opcion \nPor favor \nintroduzca una de las letras señaladas en el Menú.");
                break;
            }

        } while (stillAsking != true);

        System.out.println("El programa se ha cerrado.");
        scanner.close();
    }
}

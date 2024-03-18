import java.util.Scanner;

import net.paradummies.functionalities.ConsumptionTax;
import net.paradummies.functionalities.Menu;
import net.paradummies.publications.Publication;

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
                    System.out.println(
                            """
                                        Introduce los datos en el orden descrito y separandolos con ', ' y sin parentesis:
                                        titulo, (numero de paginas), (codigo isbn), (precio de distribucion), (fecha de ultima modificacion ej:año/mes/dia),
                                        (numero de revista), (Nombre de los articulos ej: art1_art2_etc)
                                    """);
                    String magazineInfo = scanner.nextLine();

                    Publication.safePublication(menu
                            .addNewMagazine("ElCorazon, 25, 0, 5.99, 2010/05/16, 30, Famosos_Hogar_Coches_Salvame"));

                    System.out.println("Revista añadida exitosamente");
                    break;

                case "b":
                    System.out.println(
                            """
                                        Introduce los datos en el orden descrito y separandolos con ', ' y sin parentesis:
                                        titulo, (numero de paginas), (codigo isbn), (precio de distribucion), (fecha de ultima modificacion ej:año/mes/dia),
                                        (Asignatura), (Nombre de los temas ej: tema1_tema2_etc)
                                    """);
                    String textBookInfo = scanner.nextLine();

                    Publication.safePublication(menu.addNewTextBook(
                            "BrainFuck, 500, 1, 99.99, 2013/12/09, Programacion, Introduccion_variables_herencia"));

                    System.out.println("Libro de texto añadido exitosamente");
                    break;

                case "c":
                    System.out.println(
                            """
                                    \nIntroduce los datos en el orden descrito y separandolos con ', ' y sin parentesis:
                                    titulo, (numero de paginas), (codigo isbn), (precio de distribucion), (fecha de ultima modificacion ej:año/mes/dia),
                                    (numero de temática:
                                        0.-Novela Negra
                                        1.-Novela historica
                                        2.-Novela juvenil),
                                    (Autor)\n
                                    """);
                    String novelInfo = scanner.nextLine();

                    Publication.safePublication(
                            menu.addNewNovel("La Rueda Del Tiempo, 500, 2, 59.99, 2023/06/13, 0, Brandon Sanderson"));

                    System.out.println("\nNovela añadida exitosamente");

                    break;

                case "d":
                    System.out.println("\nLista de publicaciones almacenadas en la base de datos: \n");
                    Publication.showAllPublications();
                    break;

                case "e":
                    System.out.println("\nIntroduzca el ISBN de la pubilcacion que desea consultar:");
                    int isbnCatcher = scanner.nextInt();
                    ConsumptionTax.calIgicTax(isbnCatcher);
                    ConsumptionTax.calIvaTax(isbnCatcher);
                    scanner.nextLine();
                    break;

                case "f":
                    stillAsking = true;
                    break;

                default:
                    System.out.println(
                            "No se contempla esa opcion \nPor favor \nintroduzca una de las letras señaladas en el Menú.");
                    break;
            }

        } while (stillAsking != true);

        System.out.println("El programa se ha cerrado.");
        scanner.close();
    }
}

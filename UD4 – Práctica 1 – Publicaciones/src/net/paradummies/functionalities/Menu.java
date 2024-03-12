package net.paradummies.functionalities;
import java.util.Scanner;

import net.paradummies.publications.types.Magazine;

public class Menu {

    public void shootMenu(){
        Scanner scanner = new Scanner(System.in);
        String option = "p";

        while(option != "f"){

            System.out.println("""
                ----------------Para_Dummies APP----------------
                -MENU:
                a. Añadir una nueva revista.
                b. Añadir un nuevo libro de texto.
                c. Añadir una nueva novela.
                d. Mostrar el listado de todas las publicaciones.
                e. Selección de una publicación y cálculo de su precio en Canarias y en península.
                f. Salir del programa
                """);

            option = scanner.nextLine();

            switch (option) {
                case "a":
                    
                    break;
                case "b":
                    
                    break;
                case "c":
                    
                    break;
                case "d":
                    
                    break;
                case "e":
                    
                    break;
                case "f":
                    
                    break;
            
                default:
                System.out.println("No se contempla esa opcion \nPor favor \nintroduzca una de las letras señaladas en el Menú.");
                    break;
            }
        }
    }

    /* public void addNewMagazine(){

    }

    public void addNewTextBook(){

    }

    public void addNewNovel(){

    }

    public void showAllPublications(){

    }

    public void calConsumptionTax(){

    } */

}

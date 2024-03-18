package net.paradummies.functionalities;

import net.paradummies.publications.Publication;

public class ConsumptionTax extends Publication {

    protected static float igic = 1.07f;
    protected static float iva = 1.21f;

    public ConsumptionTax(float distributionPrice) {
        super(distributionPrice);
    }

    public static void calIgicTax(int isbn /* float distributionPrice */) {

        for (Publication publication : companyBackup) {

            if (publication != null) {
                if (publication.getIsbn() == isbn && publication != null) {
                    float distributionPrice = publication.getDistributionPrice();
                    float pvp = distributionPrice * igic;
                    System.out.println("\nEl precio de venda de " + publication.getTitle() + " en Canarias, es de :"
                            + pvp + "€.\n");
                }
            }
        }

        // el pvp deve contener el incremento del impuesto, el precio base es
        // distributionprice

    }

    public static void calIvaTax(int isbn) {

        for (Publication publication : companyBackup) {

            if (publication != null) {
                if (publication.getIsbn() == isbn && publication != null) {
                    float distributionPrice = publication.getDistributionPrice();
                    float pvp = distributionPrice * iva;
                    System.out.println("\nEl precio de venda de " + publication.getTitle() + " en peninsula, es de :"
                            + pvp + "€.\n");
                }
            }

        }

    }
}

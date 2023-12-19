package application;

import annotations.Tabela;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException {

        // Get the Customer class
        Class<?> customerClass = Class.forName("entities.Customer");

        // Check for Tabela annotation on the class
        Tabela tabelaAnnotation = customerClass.getAnnotation(Tabela.class);

        if (tabelaAnnotation != null) {
            // Print the name of the Tabela annotation
            System.out.println("Tabela name: " + tabelaAnnotation.name());
        } else {
            System.out.println("Customer class does not have Tabela annotation!");
        }

    }
}

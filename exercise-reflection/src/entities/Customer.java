package entities;

import annotations.Tabela;

/**
 * Represents a customer entity in the system.
 */
@Tabela(name = "Clientes") // Explicitly map Customer class to "Clientes" table.
public class Customer {

    /**
     * The name of the customer.
     */
    private String name;

    /**
     * The CPF (Brazilian tax identification number) of the customer.
     */
    private Long cpf;

    /**
     * The email address of the customer.
     */
    private String email;

    /**
     * Constructor for a new customer with the specified data.
     *
     * @param name the name of the customer
     * @param cpf the CPF of the customer
     * @param email the email address of the customer
     */
    public Customer(String name, Long cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    /**
     * Retrieves the customer name.
     *
     * @return the name of the customer
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the customer name.
     *
     * @param name the new name of the customer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the customer CPF.
     *
     * @return the CPF of the customer
     */
    public Long getCpf() {
        return cpf;
    }

    /**
     * Sets the customer CPF.
     *
     * @param cpf the new CPF of the customer
     */
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    /**
     * Retrieves the customer email address.
     *
     * @return the email address of the customer
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the customer email address.
     *
     * @param email the new email address of the customer
     */
    public void setEmail(String email) {
        this.email = email;
    }

}

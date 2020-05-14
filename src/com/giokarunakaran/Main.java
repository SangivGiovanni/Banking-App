package com.giokarunakaran;

public class Main {

    public static void main(String[] args) {


        Bank bank = new Bank("LLoyds Bank");

        bank.addBranch("Enfield");

        bank.addCustomer("Enfield", "Gio", 200.00);
        bank.addCustomer("Enfield", "Sanj", 50.00);
        bank.addCustomer("Enfield", "Jo", 100.00);

        bank.addBranch("Southampton");
        bank.addCustomer("Southampton", "Megs", 50.00);

        bank.addCustomerTransaction("Enfield", "Gio", 100.00);
        bank.addCustomerTransaction("Enfield", "Gio", 50.00);
        bank.addCustomerTransaction("Southampton", "Megs", 20.00);

        bank.listCustomers("Enfield", true);
        bank.listCustomers("Southampton", true);
        bank.addCustomer("Enfield", "Megs", 30.00);
        bank.addCustomer("Southampton", "Megs", 20.00);
    }
}

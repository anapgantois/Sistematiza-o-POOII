package app;

import services.ContactList;
import models.Contact;

import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contaro");
            System.out.println("3. Deletar contato");
            System.out.println("4. listar contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Digite o numero de telefone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Digit o email: ");
                    String email = scanner.nextLine();
                    contactList.addContact(new Contact(name, phone, email));
                    break;
                case 2:
                    System.out.print("Digite o nome ou numero de telephone para buscar um contato: ");
                    String searchKey = scanner.nextLine();
                    Contact foundContact = contactList.searchContact(searchKey);
                    if (foundContact != null) {
                        System.out.println("Contato encontrado: " + foundContact);
                    } else {
                        System.out.println("Contato nao encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome ou numero de telefone para remover um contato: ");
                    String removeKey = scanner.nextLine();
                    if (contactList.removeContact(removeKey)) {
                        System.out.println("Contato removido.");
                    } else {
                        System.out.println("Contato nao encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Listando todos os contatos...:");
                    contactList.listContacts();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (option != 0);
    }
}

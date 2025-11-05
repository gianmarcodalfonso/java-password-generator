package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String name = "Alberto";
    String surname = "Sveglia";
    String favColor = "blue";
    byte dayOfBirth = 15;
    byte monthOfBirth = 8;
    short yearOfBirth = 1996;
    char separator = '-';
    int birthSum = dayOfBirth + monthOfBirth + yearOfBirth;

    System.out.println("Ho un utente che si chiama " + name + surname + ", nato il " + dayOfBirth + separator + monthOfBirth + separator + yearOfBirth + ", e il suo colore preferito è " + favColor);
    System.out.println("La sua password sarà: " + name + separator + surname + separator + favColor + separator + birthSum);

    // correzione
    String firstName;
    String lastName;
    String favouriteColor;
    int birthDay;
    int birthMonth;
    int birthYear;

    // Scanner input = new Scanner(System.in);
    System.out.println("Inserisci il tuo nome");
    firstName = input.nextLine();
    System.out.println(firstName);
    System.out.println("Inserisci il tuo cognome");
    lastName = input.nextLine();
    System.out.println("Inserisci il tuo colore preferito");
    favouriteColor = input.nextLine();

    System.out.println("Inserisci il tuo giorno di nascita");
    birthDay = input.nextInt();
    System.out.println("Inserisci il tuo mese di nascita");
    birthMonth = input.nextInt();
    System.out.println("Inserisci il tuo anno di nascita");
    birthYear = input.nextInt();

    int dateSum = birthDay + birthMonth + birthYear;

    String generatedPsw = firstName + separator + lastName + separator + favouriteColor + separator + dateSum;
    System.out.println("La password generata è: " + generatedPsw);
  }
}

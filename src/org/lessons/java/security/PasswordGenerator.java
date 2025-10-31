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
  }
}

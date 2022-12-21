package encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House();
        System.out.println("Insert your address:");
        house.setAddress(scanner.nextLine());

        System.out.println("How many floors has your house?");
        house.setFloorsNumber(scanner.nextInt());

        System.out.println("Who are the residents in your house?");
        house.setResidentsNames(scanner.next().split(","));

        System.out.printf(house.getAddress() + "\n");
        System.out.printf(house.getFloorsNumber() + "\n");
        System.out.printf(Arrays.toString(house.getResidentsNames()));


    }
}

    /*use a tester class to:
        set the values by asking the user to input them
        for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
        prints the house details using the getters and String.format()*/

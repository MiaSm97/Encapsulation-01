package encapsulation;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        House house = new House();
        house.setAddress("Via Roma, ");
        house.setFloorsNumber(2);
        house.setResidentsNames(new String[]{": Nino, Pino, Lu, Albert"});
        System.out.printf(house.getAddress() + house.getFloorsNumber() + Arrays.toString(house.getResidentsNames()));

    }
}

    /*use a tester class to:
        set the values by asking the user to input them
        for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
        prints the house details using the getters and String.format()*/

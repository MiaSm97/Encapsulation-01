package encapsulation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class House {
    String address;
    int floorsNumber;
    String[] residentsNames;


}
    /*achieve encapsulation using getters/setters for a class House that has the following instance variables:
        an int floorsNumber
        a string address
        an array of strings residentsNames
        use a tester class to:
        set the values by asking the user to input them
        for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
        prints the house details using the getters and String.format()*/
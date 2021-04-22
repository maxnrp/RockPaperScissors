import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Player {

    private String name;

    //constructor method
    public Player() {
    }

    //method to return name
    public String getName(){
        return this.name;
    }

    //method to give attribute name
    public void setName() {
        //creating scanners to read something from the console
        Scanner reader = new Scanner(System.in);

        //collect name, cut off spaces, put upper case attribute the name directly to the property of the instance player
        this.name = reader.next().trim().toUpperCase();

    }
}


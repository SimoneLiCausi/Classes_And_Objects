import java.time.LocalDate;
import java.util.Date;

public class Exercise {

    //Create a Java class called Programmer
    //The Programmer class will have the following instance variables:
    //name as a string
    //age as an integer
    //wearsGlasses as a boolean
    //The Programmer class avrà i seguenti metodi:
    //drinkCoffe() - that prints in console Espresso is the secret!
    //printDetails() - that prints in console NameHere is a AgeHere-yo programmer
    //hasGlasses - that prints in console Is NameHere wearing glasses? followed by the value of the dedicated variable
    //create a Java tester class called TestProgrammers where you:
    //create 2 Programmer objects (class instance)
    //define the state of the objects by assigning values to the instance variables
    //call the drinkCoffee() and printDetails() methods for the first Programmer object
    //call the printDetails() and hasGlasses() methods for the second Programmer object


    public static void main(String[] args) {

        Programmer firstProgrammer = new Programmer();

        firstProgrammer.setName("Simone");
        firstProgrammer.setAge(27);
        firstProgrammer.setWearsGlasses(false);

        Programmer secondProgrammer = new Programmer();

        secondProgrammer.setName("Francesco");
        secondProgrammer.setAge(25);
        secondProgrammer.setWearsGlasses(true);

        firstProgrammer.drinkCoffe();
        firstProgrammer.printDetails();

        System.out.println("----------------------------------------");


        secondProgrammer.printDetails();
        secondProgrammer.hasGlasses();







    }
    }


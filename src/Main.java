import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//step 1
        //create array list
        ArrayList<String> colors = new ArrayList<>();
//step2
        //adding colors in array list
        colors.add("purple");
        colors.add("Blue");
        colors.add("Red");

        System.out.println("Contents of colors:\n" + colors);
//step 3
        //use .get the index number to return color. remember index starts at 0
        System.out.println("Get second color in the list:\n" + colors.get(1));
//step 4
        //input user command
        //user adds new desired color
        System.out.println("Add your own color:");
        Scanner user = new Scanner(System.in);
        colors.add(user.nextLine());

        //.hasNext is a method that returns true if user inputs something
       while(user.hasNext()){
           System.out.println("You added:\n" + user);
       }

//        System.out.println();
//step 5
        //continue prompting user to add more colors to array list.
        // use 'Q'or'q' to quit


//        System.out.println("Hey you should add more colours:\n");
//
//        while (user.hasNext("Q") || user.hasNext("q")) {
//            System.out.println("You added: " + user.nextLine() + "\n");
//
//        }

    }
}


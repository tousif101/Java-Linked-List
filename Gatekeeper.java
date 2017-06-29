/**
 * Created by tousifchowdhury on 2/16/15.
 */


import java.util.Scanner;






public class Gatekeeper {


    /**
     * This is the main class the runs the program
     * @param args
     */



    public static void main(String[] args) {
        PriorityQueue<Patron> patrons = new LinkedQueue<Patron>();
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("1:\tNew Patron%n");
            System.out.println("2:\tAdmit highest priority queue%n");
            System.out.println("3:\tQuit%n");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    input.nextLine();
                    System.out.println("Patron Name");

                    String patronName = input.nextLine();

                    System.out.println("Coolness");

                    int patronCoolness = input.nextInt();

                    System.out.println("Regular y/n");
                    boolean regular = false;

                    String reg = input.next();

                    if (reg.contains("y")) {
                        regular = true;

                    }


                    Patron p1 = new Patron(patronName, patronCoolness, regular);
                    patrons.insert(p1);

                    break;

                case 2:
                    if (patrons.isEmpty()) {
                        System.out.println("Queue is Empty");
                    } else {
                        Patron admitted = patrons.dequeue();
                        admitted.printWhenAdmitted();







                    }

                case 3:
                    return;

                default:
                    break;


            }


        }
    }
}

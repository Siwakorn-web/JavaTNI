import java.util.Scanner;

public class CakeOrder {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Birthday Cake's Details: ");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.next();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();

        BirthdayCake order1 = new BirthdayCake(message,pound,flavor,350);

        System.out.println(order1);


        System.out.println("Cup Cakes's Details");
        System.out.print("Enter a flavor");
        String cup_flavor = scanner.next();
        System.out.print("How many pieces: ");
        int piece = scanner.nextInt();

        CupCake order2 = new CupCake(piece, cup_flavor, 65);

        System.out.println(order2);

        System.out.println("Total price = "+
                (order1.getUnitPrice()*pound + order2.getUnitPrice()*piece));

*/
        System.out.println("PineApple's Details");
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter a flavor: ");
        String pie_flavor = scanner.next();
        System.out.print("How many pieces: ");
        int pies = scanner.nextInt();

        PineApple order3 = new PineApple(pies,pie_flavor,65,name);
        System.out.println("Now your name is  "+name);
        System.out.print("Rewrite your name : ");
        name=scanner.next();
        order3.changeMessage(name);
        System.out.println(order3);







    }

}

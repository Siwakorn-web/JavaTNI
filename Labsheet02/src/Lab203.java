import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product Id : ");
        String id = sc.nextLine();

        System.out.print("Enter product name : ");
        sc.next();
        String name = sc.nextLine();

        System.out.print("Enter product item : ");
        int item = sc.nextInt();

        System.out.print("Enter price per piece: ");
        double per = sc.nextDouble();

        DecimalFormat frm = new DecimalFormat("#,###.00");

        System.out.println("------------------------------");

        System.out.println("Product name: "+name+"(" +id+")");
        System.out.println("Product item: "+item+ "("+frm.format(per)+"baht/piece)");

        System.out.println("Total price : "+frm.format(item*per));






    }
}

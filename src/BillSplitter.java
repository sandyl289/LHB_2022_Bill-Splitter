import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        double cost;
        int nbGuests;
        System.out.println("***************** This program splits the bill evenly according to the number of guests. **********************");
        System.out.println("***************** Enter '0' to stop the program **********************");
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter total cost: ");
            cost = scan.nextDouble();
            if(cost==0) break; //Stop if user entered 0 for the cost
            System.out.print("Enter number of guests: ");
            nbGuests = scan.nextInt();
            System.out.println("=> Each guest will have to pay: $"+ Math.round(cost/nbGuests*100.0)/100.0);

        }
    }
}

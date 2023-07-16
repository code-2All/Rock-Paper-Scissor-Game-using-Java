import java.util.*;
public class rockPaper {
    public static void main(String[] args) {
        Rock r = new Rock();
        r.perform();
    }
}
 class Rock {
     public void perform() {
         int user;
         //rock = 0
         //paper = 1
         // secissor = 2
         Scanner sc = new Scanner(System.in);

         System.out.println("Please choice one from 1,2,3");
         do {
             user = sc.nextInt();
             Random rand = new Random();
             int computer = rand.nextInt(3);

             if (computer == user) {

                 System.out.println("Draw");
             } else if (computer == 0 && user == 1 || computer == 1 && user == 2 || computer == 2 && user == 0) {
                 System.out.println("You are win! Congratualations");
             } else {
                 System.out.println("Computer is win");
             }
         } while (user != 2);
     }
 }



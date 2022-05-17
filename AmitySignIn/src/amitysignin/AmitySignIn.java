package amitysignin;
import Facility.Gym;
import Facility.FootballField;
import Facility.SwimmingPool;
import java.util.Scanner;
public class AmitySignIn {
    
    public static void gymSwitch(Gym g){
        int choice;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("---- G Y M ----");
            System.out.println("1.Sign In");
            System.out.println("2.Display All Students In The Gym");
            System.out.println("3.Display All Weights");
            System.out.println("4.Sign Out");
            System.out.println("5.Exit");
            choice = scan.nextInt();
            
            switch(choice){
                case 1:
                    g.signInStudent();
                break;
                case 2:
                    g.displayStudents();
                break;
                case 3:
                    g.displayWeights();
                break;
                case 4:
                    System.out.println("Enter The AUD To Sign Out : ");
                    int AUD;
                    AUD = scan.nextInt();
                    g.signOutStudent(AUD);
                break;
            }
            
        }while(choice != 5);
    }
    
    public static void footballFieldSwitch(FootballField f){
        int choice;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("---- Football Field ----");
            System.out.println("1.Sign In");
            System.out.println("2.Display All Students Signed In");
            System.out.println("3.Display Footballs Available");
            System.out.println("4.Sign Out");
            System.out.println("5.Exit");
            choice = scan.nextInt();
            
            switch(choice){
                case 1:
                    f.signInStudent();
                break;
                case 2:
                    f.displayStudents();
                break;
                case 3:
                    f.displayFootballs();
                break;
                case 4:
                    System.out.println("Enter The AUD To Sign Out : ");
                    int AUD;
                    AUD = scan.nextInt();
                    f.signOutStudent(AUD);
                break;
            }
            
        }while(choice != 5);
    }
    
     public static void swimmingPoolSwitch(SwimmingPool s){
        int choice;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("---- Swimming Pool ----");
            System.out.println("1.Sign In");
            System.out.println("2.Display All Students Signed In");
            System.out.println("3.Sign Out");
            System.out.println("4.Exit");
            choice = scan.nextInt();
            
            switch(choice){
                case 1:
                    s.signInStudent();
                break;
                case 2:
                    s.displayStudents();
                break;
                case 3:
                    System.out.println("Enter The AUD To Sign Out : ");
                    int AUD;
                    AUD = scan.nextInt();
                    s.signOutStudent(AUD);
                break;
            }
            
        }while(choice != 4);
    }

    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        Gym g = new Gym();
        FootballField f = new FootballField();
        SwimmingPool s = new SwimmingPool();
        
        do{
            System.out.println("---- Amity Sign In ----");
            System.out.println("1.Gym");
            System.out.println("2.Football Field");
            System.out.println("3.Swimming Pool");
            System.out.println("4.Exit");
            choice = scan.nextInt();
            
            switch(choice){
                case 1:
                    gymSwitch(g);
                break;
                case 2:
                    footballFieldSwitch(f);
                break;
                case 3:
                    swimmingPoolSwitch(s);
                break;
            }
            
        }while(choice != 4);
        
        
    }
    
}

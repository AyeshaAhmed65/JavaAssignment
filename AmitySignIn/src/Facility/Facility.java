package Facility;
import Student.Student;
import java.util.Scanner;
public class Facility {
    int totalPeople;
    Student[] Students;
    
    public Facility(){
        totalPeople = 0;
        Students = new Student[30];
    }
    public void increaseTotalPeople(){
        totalPeople++;
    }
    public int getTotalPeople(){
        return totalPeople;
    }
    
    public void signInStudent(){
        Scanner scan = new Scanner(System.in);
        String name;
        int AUD;
        boolean isPlaying;
        int x;
        System.out.println("Enter Student Name : ");
        name = scan.nextLine();
        System.out.println("Enter Student AUD : ");
        AUD = scan.nextInt();
        System.out.println("Enter 1 If Your Using The Facility Or Enter 0 If Your Just Spectating : ");
        x = scan.nextInt();
        if(x == 1){
            isPlaying = true;
        }else{
            isPlaying = false;
        }
        Student s = new Student(name,AUD,isPlaying);
        Students[totalPeople] = s;
        totalPeople++;
    }
    
    public void signOutStudent(int AUD){
        int pos = -1;
        for(int i=0;i<totalPeople;i++){
            if(Students[i].getAUD() == AUD){
                pos = i;
            }
        }
        if(pos != -1){
           for(int i=pos;i<totalPeople;i++){
            Students[i] = Students[i+1];
        }
        totalPeople--;
        }else{
            System.out.println("Invalid AUD!");
        }
    }
}


package Facility;
import Student.Student;
public class Gym extends Facility {
    
    int kg_5;
    int kg_10;
    int kg_20;
    
    public Gym(){
        kg_5 = 20;
        kg_10 = 10;
        kg_20 = 5;
    }
    
    public void displayWeights(){
        System.out.println("5 Kg Plates Available : " + kg_5);
        System.out.println("10 Kg Plates Available : " + kg_10);
        System.out.println("20 Kg Plates Available : " + kg_20);
    }
    
    public void displayStudents(){
        if(totalPeople != 0){
        for(int i=0;i<totalPeople;i++){
            Students[i].Display();
        }
        }
    }
    
    
}

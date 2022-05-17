
package Facility;

public class SwimmingPool extends Facility {
    
    public void displayStudents(){
        if(totalPeople != 0){
        for(int i=0;i<totalPeople;i++){
            Students[i].Display();
        }
        }
    }
}

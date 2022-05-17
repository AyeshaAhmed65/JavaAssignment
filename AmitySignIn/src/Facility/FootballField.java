
package Facility;


public class FootballField extends Facility{
      
    int footballs;
    
    public FootballField(){
        footballs = 25;
    }
    
    public void displayFootballs(){
        System.out.println("Footballs On Campus : " + footballs);
        
    }
    
    public void displayStudents(){
        if(totalPeople != 0){
        for(int i=0;i<totalPeople;i++){
            Students[i].Display();
        }
        }
    }
    
}

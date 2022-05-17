
package Student;

public class Student {
    String name;
    int AUD;
    boolean isPlaying;
    
    public Student(String n,int id,boolean playing){
        name = n;
        AUD = id;
        isPlaying = playing;
    }
    
    public void Display(){
        System.out.println("\nName : "+name);
        System.out.println("AUD : "+AUD);
        if(isPlaying){
            System.out.println("- Is Using The Facility");
        }else{
            System.out.println("- Is Spectating");
        }
    }
    
    public int getAUD(){
        return AUD;
    }
    
}

//Droid state and behavior
public class Droid{
  int batteryLevel;
  String name;
  public Droid(String droidName){
    batteryLevel = 100;
    name = droidName;
  }
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }
  public int energyReport(){
    return batteryLevel;
  }
  public String toString(){
    return "Hello, I'm the droid: " + name;
  }
  public static void main(String[] args){
    Droid newDroid = new Droid("Codey");
    System.out.println(newDroid);
    newDroid.performTask("dancing");
    newDroid.performTask("cleaning");
    System.out.println(newDroid.energyReport());
  }
}

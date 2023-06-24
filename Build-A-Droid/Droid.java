public class Droid {
  
  String name;
  int batteryLevel;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public String toString() {
    return "Hello, I'm the droid: " + name;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  public void energyReport() {
    System.out.println(batteryLevel);
  }

  public void energyTransfer(Droid droid1, Droid droid2) {
    int temp = droid1.batteryLevel;
    droid1.batteryLevel = droid2.batteryLevel;
    droid2.batteryLevel = temp;
  }

  public static void main(String[] args) {
    Droid droid = new Droid("Codey");
    System.out.println(droid);
    droid.performTask("dancing");
    System.out.println(droid.batteryLevel);
    Droid droid2 = new Droid("Keah");
    droid.energyTransfer(droid, droid2);
    System.out.println("After exchanging:");
    System.out.println(droid.name + "'s battery level is " + droid.batteryLevel);
    System.out.println(droid2.name + "'s battery level is " + droid2.batteryLevel);
  }
}
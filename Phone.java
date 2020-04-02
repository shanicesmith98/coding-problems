public class Phone {
  int batteryLevel;
  String name;
  String color;
  String model;
  
  public Phone(String phoneOwner, String phoneColor, String phoneModel){
    name = phoneOwner;
    color = phoneColor;
    model = phoneModel;
    batteryLevel = 100;
  }
  
  public String toString(){
    return "This " + model + " belongs to: " + name;
  }
  
  public void makeCall(String calling){
    System.out.println(name + " is making a call to " + calling);
    batteryLevel = batteryLevel - 10;
  }

  public void sendMessage(String messenger){
    System.out.println(name + " is sending a text to " + messenger);
    batteryLevel = batteryLevel - 10;
  }

  public void playPlaylist(String playlist){
    System.out.println(name + " is playing " + playlist + " on loop");
    batteryLevel = batteryLevel - 10;
  }

  public void charge(){
    System.out.println("Let's charge up!");
    batteryLevel = batteryLevel + 10;
  }
  
  public String energyReport(){
    return "Battery Level: " + batteryLevel;
  }
  
  public static void main(String[] args){
    Phone Phone = new Phone("Justine", "Rose Gold", "iPhone X");
    System.out.println(Phone);
    Phone.makeCall("Brittany");
    System.out.println(Phone.energyReport());
    Phone.sendMessage("Taylor");
    System.out.println(Phone.energyReport());
    Phone.playPlaylist("Happy Beats");
    System.out.println(Phone.energyReport());
    Phone.charge();
    System.out.println(Phone.energyReport());
  }
  
}

package wizard_management;

public class Ogre extends MythicalBeast implements Protectable {
  
  public Ogre(String name){
    super(name);
  }

  public String defend(){
    return "Ogre smashes attacker!";
  }

}
/*=============================================
  class Mage -- protagonist of Ye Olde RPG
  =============================================*/

public class Mage extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Mage() {
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_attack = .4;
    }

    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Mage( String name ) {
	this();
	_name = name;
    }

    public String about() {
	return "Mage: Mages are masters of the arcane arts. They rely on powerful spells to combat their enemies through a combination of destruction, illusions, and conjurations. However years of training with the mind has left their body weak and feeble. They are unable to utilize heavy armor effectively making them vulnerable to physical harm.";
    }

}//end class Mage

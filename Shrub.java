/*=============================================
  class Shrub -- protagonist of Ye Olde RPG
  =============================================*/

public class Shrub extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Shrub() {
	_hitPts = 100;
	_strength = 50;
	_defense = 40;
	_attack = .4;
    }

    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Shrub( String name ) {
	this();
	_name = name;
    }

    public String about() {
	return "Shrubs: Shrubs are a shrub. These tankish archers have colossal amounts of health and often defeat their enemies by simply boring them into defeat. Shrubs employ sharp barbs as a mechanism of defense and attack. Each time an enemy strikes the shrub, they are damaged by these thorns. Shrubs also have the capability to shoot our these thorns as an offensive mechanism. Shrub are able to navigate this world through the help of their trusty butler Gregory.";
    }

    public void specialize() {
        _attack = .75;
	_defense = 20;
    }

}//end class Shrub

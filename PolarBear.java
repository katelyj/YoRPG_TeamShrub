/*=============================================
  class PolarBear -- protagonist of Ye Olde RPG
  =============================================*/

public class PolarBear extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public PolarBear() {
	_hitPts = 130;
	_strength = 110;
	_defense = 40;
	_attack = .4;
    }

    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public PolarBear( String name ) {
	this();
	_name = name;
    }

    public String about() {
	return "Polar Bears: Polar Bears are massive in size and are able to dish out and endure vast amounts of damage. However because you are a polar bear, you are unable to heal yourself through any method besides rest. You will also be unable to equip any armor or weapons besides the hide on your back and the the claws you wear. Save the rare exception, no villagers will deal with you and some may even be hostile.";
    }

    public void specialize() {
        _attack = .75;
	_defense = 20;
    }

}//end class PolarBear

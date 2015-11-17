/*=============================================
  class Rogue -- protagonist of Ye Olde RPG
  =============================================*/

public class Rogue extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Rogue() {
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
    public Rogue( String name ) {
	this();
	_name = name;
    }

    public String about() {
	return "Rouges: Rogues are master of dark, they are those who walks alone. Dexterity and agility allow rouges to stealthily avoid enemies by picking locks and stealing items of importance. Rogues would much rather stab their enemies in the back than face them head on. Though they are unable to withstand large amounts of damage, rogues are extraordinarily good at dodging attacks and quickly dealing with their enemies through trickery and poisons.";
    }

    public void specialize() {
        _attack = .75;
	_defense = 20;
    }

}//end class Rogue

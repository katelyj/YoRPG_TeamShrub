/*=============================================
  class Warrior -- protagonist of Ye Olde RPG
  =============================================*/

public class Warrior extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Warrior() {
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
    public Warrior( String name ) {
	this();
	_name = name;
    }

    public String about() {
	return "Warrior: If you are mad boring and don't wanna be a shrub then I suppose you can be a lame old warrior. Warriors are extremely skilled in manual combat and utilize heavy armor to protect themselves. They make up for their lack of agility and inability to use more advanced magic in strength and resistance to most any harm.";
    }
    
}//end class Warrior

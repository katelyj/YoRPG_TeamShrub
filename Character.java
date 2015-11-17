/*
Team Shrub ~ Niels Graham, Vincent Loik, Kate Ly Johnston
APCS1 pd10
HW30 -- Ye Olde Role Playing Game, Unchained
2015-11-16
*/

public abstract class Character {

    //instance variables

    protected String _name;
    protected int _hitPts;
    protected int _strength;
    protected int _defense;
    protected double _attack;

    //abstract methods

    public abstract String about();
    public abstract void specialize();
    public abstract void normalize();
    
    //accessors

    public int getDefense() { return _defense; }

    public String getName() { return _name; }

    //methods

    public boolean isAlive() {
	return _hitPts > 0;
    }

    public int attack( Character opponent ) {

        int damage = (int)( (_strength * _attack) - opponent.getDefense() );
     
        if ( damage < 0 ) {
            damage = 0;
	}
	
        opponent.lowerHP( damage );
	
        return damage;
    }

    public void lowerHP( int damageInflicted ) {
        _hitPts = _hitPts - damageInflicted;
    }


}//end of class

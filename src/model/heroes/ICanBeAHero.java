package model.heroes;

public interface ICanBeAHero {
	public void levelUp();
	public void raiseStr();
	public void raiseDef();
	public void raiseInt(); 
	public void raiseDex();
	public void raiseAgi();
	public void raiseSpd();
	public String getName();

	public void setName(String name);

	public int getStrength();

	public int getDefence();

	public int getIntelligence();

	public int getDextrity();

	public int getAgility();

	public int getSpeed();

}
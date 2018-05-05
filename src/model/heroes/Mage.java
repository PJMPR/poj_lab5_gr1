package model.heroes;

public class Mage implements ICanBeAHero {

	private int availableStatspoints;
	
	public void levelUp(){
		availableStatspoints+=10;
	}
	
	public void raiseStr(){
		if(availableStatspoints<=0)return;
		strength++;
		availableStatspoints--;
	}
	
	public void raiseDef(){
		if(availableStatspoints<=0)return;
		defence++;
		availableStatspoints--;
	}
	
	public void raiseInt() {
		if(availableStatspoints<=0)return;
		intelligence = (int)((intelligence+1)/1.2);
		intelligence++;
		intelligence*=1.2;
		availableStatspoints--;
	}
	
	public void raiseDex(){

		if(availableStatspoints<=0)return;
		dextrity = (int)((dextrity+1)/1.05);
		dextrity++;
		dextrity*=1.05;
		availableStatspoints--;
	}

	public void raiseAgi(){

		if(availableStatspoints<=0)return;
		agility = (int)((agility+1)/1.02);
		agility++;
		agility*=1.02;
		availableStatspoints--;
	}
	

	public void raiseSpd(){

		if(availableStatspoints<=0)return;
		speed++;
		availableStatspoints--;
	}
	
	private String name;
	
	private int strength;
	private int defence;
	private int intelligence;
	private int dextrity;
	private int agility;
	private int speed;
	
	public int getAvailableStatspoints() {
		return availableStatspoints;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public int getDefence() {
		return defence;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getDextrity() {
		return dextrity;
	}
	public int getAgility() {
		return agility;
	}
	public int getSpeed() {
		return speed;
	}
	
	
	
}

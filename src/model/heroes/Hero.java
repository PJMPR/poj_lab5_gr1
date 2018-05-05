package model.heroes;

public abstract class Hero implements ICanBeAHero{
	
	
	protected int availableStatspoints;

	protected String name;
	
	protected int strength;
	protected int defence;
	protected int intelligence;
	protected int dextrity;
	protected int agility;
	protected int speed;
	
	public void levelUp(){
		availableStatspoints+=10;
	}
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
	

	public void raiseStr(){
		if(availableStatspoints<=0)return;
		modifyStr();
		availableStatspoints--;
	}
	
	
	public void raiseDef(){
		if(availableStatspoints<=0)return;
		modifyDef();
		availableStatspoints--;
	}

	
	public void raiseInt() {
		if(availableStatspoints<=0)return;
		modifyInt();
		availableStatspoints--;
	}
	public void raiseDex(){

		if(availableStatspoints<=0)return;
		modifyDex();
		availableStatspoints--;
	}

	
	public void raiseAgi(){

		if(availableStatspoints<=0)return;
		modifyAgi();
		availableStatspoints--;
	}


	public void raiseSpd(){

		if(availableStatspoints<=0)return;
		modifySpd();
		availableStatspoints--;
	}


	protected abstract void modifyStr();
	protected abstract void modifyDef();
	protected abstract void modifyInt();
	protected abstract void modifyDex();
	protected abstract void modifyAgi();
	protected abstract void modifySpd();
}

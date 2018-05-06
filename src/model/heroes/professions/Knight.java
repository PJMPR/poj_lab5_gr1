package model.heroes.professions;

import java.util.List;

import model.heroes.Hero;
import model.heroes.IHaveRace;


public class Knight extends Hero {

	public Knight(IHaveRace race){
		super(race);
	}
	
	
	@Override
	protected void modifyStr() {
		strength = (int)((strength+1)/1.2);
		strength++;
		strength*=1.2;
		
	}

	@Override
	protected void modifyDef() {
		defence = (int)((defence+1)/1.1);
		defence++;
		defence*=1.1;
		
	}

	@Override
	protected void modifyInt() {
		intelligence++;
	}

	@Override
	protected void modifyDex() {
		dextrity = (int)((dextrity+1)/1.05);
		dextrity++;
		dextrity*=1.05;
	}

	@Override
	protected void modifyAgi() {
		agility = (int)((agility+1)/1.02);
		agility++;
		agility*=1.02;
	}

	@Override
	protected void modifySpd() {
		speed = (int)((speed+1)/1.05);
		speed++;
		speed*=1.05;
		
	}


	@Override
	public List<String> getAbilities() {
		List<String> result = race.getAbilities();
		result.add("martial arts");
		result.add("swordmanship");
		result.add("axe fighting");
		result.add("spear fighting");
		return result;
	}
}

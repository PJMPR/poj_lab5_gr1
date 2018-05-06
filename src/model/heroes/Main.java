package model.heroes;

import model.heroes.professions.Archer;
import model.heroes.professions.Knight;
import model.heroes.professions.Mage;
import model.heroes.races.Dwarf;
import model.heroes.races.Elve;
import model.heroes.races.Human;

public class Main {

	public static void main(String[] args) {

		Hero gandalf = new Mage(new Knight(new Human()));
		gandalf.setName("Gandalf");
		Hero legolas = new Archer(new Knight(new Elve()));
		legolas.setName("Legolas");
		Hero gimli = new Knight(new Dwarf());
		gimli.setName("Gimli");
		for(int i=0;i<100;i++){
			gandalf.levelUp();
			gandalf.raiseAgi();
			gandalf.raiseDef();
			gandalf.raiseDex();
			gandalf.raiseInt();
			gandalf.raiseSpd();
			gandalf.raiseStr();
			

			gimli.levelUp();
			gimli.raiseAgi();
			gimli.raiseDef();
			gimli.raiseDex();
			gimli.raiseInt();
			gimli.raiseSpd();
			gimli.raiseStr();
			

			legolas.levelUp();
			legolas.raiseAgi();
			legolas.raiseDef();
			legolas.raiseDex();
			legolas.raiseInt();
			legolas.raiseSpd();
			legolas.raiseStr();
		}
		
		printoutHero(gandalf);
		printoutHero(legolas);
		printoutHero(gimli);
	}
	static void printoutHero(Hero hero){
		System.out.println(hero.getName()+"\t|"
				+ "str: "+hero.getStrength() +"\t|"
				+ "def: "+hero.getDefence() +"\t|"
				+ "dex: "+hero.getDextrity() +"\t|"
				+ "int: "+hero.getIntelligence() +"\t|"
				+ "agi: "+hero.getAgility() +"\t|"
				+ "spd: "+hero.getSpeed() +"\t|");
		System.out.println("Skills: ");
		for(String skill: hero.getAbilities()){
			System.out.println("\t"+skill);
		}
		System.out.println("----------------------------------------------");
		
	}

}

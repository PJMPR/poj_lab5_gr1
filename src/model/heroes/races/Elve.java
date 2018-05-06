package model.heroes.races;

import java.util.ArrayList;
import java.util.List;

import model.heroes.IHaveRace;

public class Elve implements IHaveRace {

	@Override
	public List<String> getAbilities() {

		List<String> result = new ArrayList<String>();

		result.add("dark vision");
		result.add("super agility");
		
		return result;
	}

}

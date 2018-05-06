package model.heroes.races;

import java.util.ArrayList;
import java.util.List;

import model.heroes.IHaveRace;

public class Human implements IHaveRace{

	@Override
	public List<String> getAbilities() {

		List<String> result = new ArrayList<String>();

		result.add("nothing special");
		
		return result;
	}

}

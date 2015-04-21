/**
 * 
 */
package edu.mum.asd.party;

import java.util.ArrayList;

/**
 * @author Prabin
 *
 */
public class PartyManager {

	private ArrayList<IParty> partyList=new ArrayList<IParty>();
	public void addParty(IParty party){
		partyList.add(party);
	}
	public void removeParty(IParty party){
		partyList.remove(party);
	}
	public boolean findParty(String partyName){
		for (IParty iParty : partyList) {
			if(((Party) iParty).getName().equalsIgnoreCase(partyName))
					return true;
		}
		return false;
		
	}


}

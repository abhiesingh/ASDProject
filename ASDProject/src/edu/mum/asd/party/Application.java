package edu.mum.asd.party;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IParty prabin=new Person("Prain", "pabin.adhikari@gmail.com");
		Address praddress=new Address("street", "city", "state", 52557, "Personal");
		((Party)prabin).add(praddress);
		PartyManager p=new PartyManager();
		p.addParty(prabin);
		System.out.println(p.findParty("Prain"));
		

	}

}

package day2;

public class ChocolateFactory {
	
	public static void main(String[] args) {
		Chocolate dairymilk = new Chocolate("dairykmilk","1","12th jan",100.00,20,false);
		Chocolate kitkat = new Chocolate("kitkat","2","14th jan",120.00,20,false);
		Chocolate eclairs = new Chocolate("eclairs","1","12th feb",10.00,2,false);
		Chocolate candyman = new Chocolate("candyman","1","15th sep",10.00,20,false);
		Chocolate perk = new Chocolate("perk","2","16th oct",10.00,100,false);
		Chocolate munch = new Chocolate("munch","2","14th oct",10.00,20,false);
		Chocolate caramel = new Chocolate("caramel","1","18th jan",100.00,20,false);
		Chocolate fivestar = new Chocolate("fivestar","1","30th feb",100.00,20,false);
		Chocolate justjelly = new Chocolate("justjelly","1","14 jan",100.00,20,false);
		Chocolate snickers = new Chocolate("snickers","1","11 apr",100.00,20,false);
		Chocolate milkybar = new Chocolate("milkybar","1","30 mar",100.00,20,false);
		Chocolate galaxy = new Chocolate("galaxy","1","17 jan",100.00,20,false);
		Chocolate twist = new Chocolate("twist","1","30 sep",100.00,20,false);
		Chocolate kacchaam = new Chocolate("kacchaam","1","17 jan",100.00,20,false);
		
		System.out.println(perk);
		System.out.println(perk.hashCode());
		System.out.println(twist);
		System.out.println(twist.hashCode());
		boolean res1,res2;
		
		if(perk instanceof Chocolate && twist instanceof Chocolate)
		{
			res1=perk==twist;
					System.out.println(res1);
		}
		
		Chocolate cake=twist;
		System.out.println(cake.hashCode());
		System.out.println(twist.hashCode());
		res2=cake==twist;
		System.out.println(res2);
		
		
		Chocolate chocks[]=new Chocolate[14];
		chocks[0]=dairymilk;
		chocks[1]=kitkat;
		chocks[2]=eclairs;
		chocks[3]=candyman;
		chocks[4]=perk;
		chocks[5]=munch;
		chocks[6]=caramel;
		chocks[7]=fivestar;
		chocks[8]=justjelly;
		chocks[9]=snickers;
		chocks[10]=milkybar;
		chocks[11]=galaxy;
		chocks[12]=twist;
		chocks[13]=kacchaam;
		
		
		for(int i=0;i<chocks.length;i++)
		{
			System.out.println("chocolate is "+chocks[i]);
		}	
	}

}

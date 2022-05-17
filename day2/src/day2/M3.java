package day2;
import java.util.Arrays;

public class M3 {
	public static void main(String[] args) {
	Chocolate perk = new Chocolate("perk","2","16th oct",10.00,100,false);
	Chocolate munch = new Chocolate("munch","2","14th oct",10.00,20,false);
	Chocolate chocks[]=new Chocolate[2];
	chocks[0]=perk;
	chocks[1]=munch;
	for(int i=0;i<chocks.length;i++)
	{
		System.out.println("chocolate is "+chocks[i]);
	}	
	}
	
	

}

package day2;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Chocolate {
	
	
	
	
	@Setter
	@Getter
	private String description;
	@Setter
	@Getter
	private String pack;
	@Setter
	@Getter
	private String date;
	@Setter
	@Getter
	private double weight;
	@Setter
	@Getter
	private double price;
	@Setter
	@Getter
	private boolean sugarfree;
	
	
}





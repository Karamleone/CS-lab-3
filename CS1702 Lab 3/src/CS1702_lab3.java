import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class CS1702_lab3 {
	static public void main(String args[])
	{
	double x = 100, y = 204;
	double c = -204;
	double z = -23.1;
	boolean b = false;
	boolean a = true;
	
	System.out.println("question 1");
	if (x<y)
	{
		System.out.println("x is less than y");
	}
	else 
	{
		System.out.println("x is not less that y");
	}
	
	System.out.println("question 2, x>z and a = b");
	if (x>z)
		if (a = b)
		{
			System.out.println(a);
		}
	else 
	{
		System.out.println(b);
	}
	
	System.out.println("question 3, 2c>y");
	if ((2*c)>y)
	{
		System.out.println(a);
	}
	else 
	{
		System.out.println(b);
	}
	
	System.out.println("question 4, x = b");
	//if (x == b)
	{
	//	System.out.println(a);
	}
	//else 
	{
	//	System.out.println(b);
	}
	System.out.println("cannot calculate - int =/= boolean");
	
	System.out.println("question 5");
	
	if((c) != y) {
        System.out.print("c != y");
     }else if((c) == y ) {
        System.out.print("c == y");
     }else {
        System.out.print("neither c!= y or c == y");
     }
	
	
	System.out.println("question 6");
	
	//if (c != y);
	//	if (a = y)
	//	{
	//		System.out.println("True");
	//	}
	//else 
	//{
	System.out.println("False - c != a as double and boolean mix");
	//}
	
	System.out.println("question 7");
	//if (y >= y)
	//	if ((3 + a) != 2)
	//	{
	//		System.out.println("True");
	//	}
	//else 
	//{
	System.out.println("False - cannot calculate (a +3) ");
	//}
	
	//3.3 Designing if Statements 
	System.out.println("Designing if Statements");
	double name1 = 10, name2 = -10, name3 = 3; 
	
	if (name1 > name2) {
		if (name1 > name3) {
			if (name3>name2) {
				System.out.println("name1(" + name1 + ") <=name3(" + name3 + ")<=name2(" + name2);
			}else { 
				System.out.println("name1(" + name1 + ") <=name2(" + name2 + ")<=name3(" + name3);
			}
		}else { 
			System.out.println("name3(" + name3 + ") <=name1(" + name1 + ")<=name2(" + name2);
		}
	}else if (name2 > name3){
		if (name1 > name3){ 
			System.out.println("name2(" + name2 + ") <=name1(" + name1 + ")<=name3(" + name3);
		}else { 
			System.out.println("name2(" + name2 + ") <=name3(" + name3 + ")<=name1(" + name1);
		}
	}else 
		System.out.println("name3(" + name3 + ") <=name2(" + name2 + ")<=name1(" + name1);
	
	
	//3.4 compound conditions 
	System.out.println("Compound Conditions"); 
	
	double value3_4 = 6; 
		
	if (value3_4 >= 0) {
		if ((value3_4 % 3) == 0) {
			if ((value3_4 % 2) == 0) { 
				System.out.println("output - correct1"); 
			}					
		}
		else 
			System.out.println(value3_4 + " does not satisfy any conditions - incorrect2");
	}
	
	if (value3_4 >= 0) {
		if ((value3_4 % 7) == 0) {
			System.out.println("output - correct3"); 	
		}else if ((value3_4 % 9) == 0){ 
			System.out.println("output - correct4"); 
		}
		else 
			System.out.println(value3_4 + " does not satisfy any conditions incorrect5");
	}
	
	if (value3_4 >= 0) {
		if ((value3_4 % 5) != 0) {
			if ((value3_4 % 3) == 0) {
				if ((value3_4 % 2) == 0) { 
					System.out.println("output - correct6"); 
				}					
			}
		}
		else 
			System.out.println(value3_4 + " does not satisfy any conditions incorrect7");
	}
	
	//3.5 using switch statements
	System.out.println("Switch Statements");
	
	String month = "February";
	int daysinmonth = 0;
					
	switch (month)
	{
	case "January": case "March": case "May": case "July": case "August": case "October": case "December":
	daysinmonth = 31;
	break;
	case "February":
	daysinmonth = 28;
			break;     	
	case "April": case "June": case "September": case "November":
	daysinmonth = 30;
			break;    
	default: 
	daysinmonth = -1;
	break;
	}

	System.out.println("Days in month " + month + " = " + daysinmonth);
	
	String animal = "potto";
	int numberoflegs = 0;
	
	switch(animal)
	{
	case "cobra": case "Minke Whale": case "cod": 
			numberoflegs = 0;
			break; 
	case "Klingon": case "Human": 
			numberoflegs = 2;
			break; 
	case "Alsatian Dog": case "Sphynx cat": case "Baboon": case "Ocelot": case "potto": 
			numberoflegs = 4; 
			break; 
	case "Tarantula": case "Black Scorpion": case "Paul Allen the German Octopus": 
			numberoflegs = 8; 
			break; 
	default: 
	numberoflegs = -1;
	break; 
	}
	
	System.out.println("number of legs for a " + animal + " = " + numberoflegs);
	
	System.out.println("?: Notation");
	
	boolean max; 
	
	boolean a1 = true; 
	boolean b1 = false;
	
	System.out.println("question 1");
	max = (x < y ) ? a1 : b1;
	
	System.out.println(max);
	
	System.out.println("question 2");
	max = ((x > y) && (a = b)) ? a1 : b1; 
	
	System.out.println(max);
	
	System.out.println("question 3");
	max = (2*c > y) ? a1 : b1; 
	
	System.out.println(max);
	
	//System.out.println("question 4");
	//max = (x == b) ? a1 : b1; 
	
	//System.out.println(max);
	String hold; 
	String a2 = " c != y";
	String b2 = " c ==y"; 
	System.out.println("question 5");
	max = (c == y) ? a1 : b1; 
	hold = (a1 || b1) ? a2 : b2; 
	System.out.println(max + hold);
	
	//System.out.println("question 6");
	//max = ((z != y) && (c == a)) ? a1 : b1; 
	System.out.println("boolean and string cannot mix, c != a");
	
	//System.out.println("question 7");
	//max = ((y => y) && ((a + 3) != 2)) ? a1 : b1; 
	System.out.println("boolean and string cannot mix, c != a");
	
	Finch myfinch = new Finch();
	if (myfinch.isFinchUpsideDown() == true)
	{
		System.out.println("I am on my back!");
	}
	else
	{
	System.out.println("I am NOT on my back!");
	}
	myfinch.quit();
	
	/*
	While using isShaken() and isTapped() methods the if statements did not seem to work as intended. 
	For the isShaken the program would response the wrong output statement and for the isTapped it did the same. 
	all other methods seemed to have worked as intended. 
	*/
	
}
}
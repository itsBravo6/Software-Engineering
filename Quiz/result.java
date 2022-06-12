
public class result {

	int marking(int[]arr)
	{
		int passed = 0; int failed = 0;
		int count = 0; 
		while(count < 10) 
		{ 
			if(arr[count] == 1) 
		{ 
			passed = passed + 1;
		} 
		else 
		{ 
			failed = failed + 1; 
		} 
		count = count + 1; 
		}
		if(passed > 8) 
		{ 
			System.out.println("Bonus to instructor"); 
			System.out.println("Passed Students=" + passed);
			System.out.println("Failed Students=" + failed);
			
		} 
		else
		{
			System.out.println("No Bonus");
			System.out.println("Passed Students=" + passed);
			System.out.println("Failed Students=" + failed);
			
		}
		return passed; 
		}
}

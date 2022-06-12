
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

class testcasesQUIZ {
	
	Scanner s = new Scanner(System.in);
	result Myresult;
	@Test
	@BeforeEach
	
	
	
	
	void constr()
	{
		Myresult= new result();
	}
	
	int arr[]=new int[10];
	@Test
	void check()
	{System.out.println("Input Evaluation Scores");
		for(int i=0;i<10;i++)
		{//for reading array
            arr[i]=s.nextInt();

        }
		int res = Myresult.marking(arr);
		Assertions.assertEquals(res,10);
		
	}
	
	@Test
	void check1()
	{System.out.println("Input Evaluation Scores");
		for(int i=0;i<10;i++)
		{//for reading array
            arr[i]=s.nextInt();

        }
		int res = Myresult.marking(arr);
		Assertions.assertEquals(res,10);
		
	}
	
	@Test
	void check2()
	{System.out.println("Input Evaluation Scores");
		for(int i=0;i<10;i++)
		{//for reading array
            arr[i]=s.nextInt();

        }
		int res = Myresult.marking(arr);
		Assertions.assertEquals(res,10);
		
	}
	
	@Test
	void check3()
	{System.out.println("Input Evaluation Scores");
		for(int i=0;i<10;i++)
		{//for reading array
            arr[i]=s.nextInt();

        }
		int res = Myresult.marking(arr);
		Assertions.assertEquals(res,10);
		
	}
	
	@Test
	void check4()
	{System.out.println("Input Evaluation Scores");
		for(int i=0;i<10;i++)
		{//for reading array
            arr[i]=s.nextInt();

        }
		int res = Myresult.marking(arr);
		Assertions.assertEquals(res,10);
		
	}
}	

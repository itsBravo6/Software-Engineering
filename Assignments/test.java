package projj;



import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class test {

	
	@ParameterizedTest
	@CsvFileSource(files = "F:\\test.csv")
	void testfn(int PersonAge, char PersonGender, Boolean maritalStatus, int points, int expectedOutput)
	{ 
		CarInsurance fst = new CarInsurance();
		int result = fst.CarInsurance(PersonAge, PersonGender, maritalStatus, points);
	Assertions.assertEquals(result, expectedOutput); 
	
	}
	
}

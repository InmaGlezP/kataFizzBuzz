package net.iessanclemente.dapw.katas.fizzbuzz;

public class FizzBuzz {

	/**
	 * Lee un número y lo trata para devolver una "traducción" según un
	 * determinado criterio
	 * 
	 * @param number El número enviado
	 * @return conversion La traducción del número según las normas dadas
	 * 
	 */
	public String convert(int number) {

		String conversion = "";
		String numberString = String.valueOf(number);
		char[] digits = numberString.toCharArray();
		
		if(number % 3 == 0 && number % 5 == 0)
			conversion = "FizzBuzz";
		
		else if(number % 3 == 0)
			conversion= "Fizz";
		
		else if(number % 5 == 0)
			conversion= "Buzz";
		else{
			conversion = numberString;
			for(int i=0; i<digits.length;i++){
				if(digits[i]==51){
					conversion = "Fizz";
				}
			}
		}
		return conversion;
	}
}

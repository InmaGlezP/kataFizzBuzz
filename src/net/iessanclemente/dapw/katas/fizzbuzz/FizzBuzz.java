package net.iessanclemente.dapw.katas.fizzbuzz;

public class FizzBuzz {

	/**
	 * Lee un n�mero y lo trata para devolver una "traducci�n" seg�n un
	 * determinado criterio
	 * 
	 * @param number El n�mero enviado
	 * @return conversion La traducci�n del n�mero seg�n las normas dadas
	 * 
	 */
	public String convert(int number) {

		String numberString = String.valueOf(number);
		char[] digits = numberString.toCharArray();
		
		if(number % 3 == 0 && number % 5 == 0)
			numberString = "FizzBuzz";
		
		else if(number % 3 == 0)
			numberString= "Fizz";
		
		else if(number % 5 == 0)

			numberString= "Buzz";
		else{
			
			for(int i=0; i<digits.length;i++){
				if(digits[i]==51)
					numberString = "Fizz";					
				if(digits[i]==53)
					numberString = "Buzz";							
			}
		}
		
		return numberString;

	}
}

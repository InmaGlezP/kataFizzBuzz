package net.iessanclemente.dapw.katas.fizzbuzz;

public class FizzBuzz {

	/**
	 * Lee un numero y lo trata para devolver una "traduccion" segun un
	 * determinado criterio
	 * 
	 * @param number El n�mero enviado
	 * @return conversion La traduccion del numero segun las normas dadas
	 * 
	 */
	public String convert(int number) {

		String conversion = "";
		if(number % 3 == 0 && number % 5 == 0)
			conversion = "FizzBuzz";
		
		else if(number % 3 == 0)
			conversion= "Fizz";
		
		else if(number % 5 == 0)
			conversion= "Buzz";
		else
			conversion = String.valueOf(number);
		
		return conversion;
	}

}

package arranjo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testArray {

	@Test
	void test() {
		int[] arr = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		arranjo a = new arranjo(arr);
		
		  	assertEquals(510, a.encontrarMenor(), "O menor deve ser 440");
	        
	        assertEquals(940, a.encontrarMaior(), "O maior deve ser 940");
	        
	        assertEquals(7540, a.somarValores(), "A soma deve ser 7040");
	        
	        assertEquals(2, a.contarOcorrencias(940), "O 940 deve aparecer 2 vezes");
		}

}

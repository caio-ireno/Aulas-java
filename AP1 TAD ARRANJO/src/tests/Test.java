package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import source.ArrayIndexList;

class ArrayIndexListTest {
	@Test
	void test() {
		ArrayIndexList<String> A = new ArrayIndexList<String>();
		assertEquals("()", A.toString());
		A.add(0, "caio");
		assertEquals("(caio)", A.toString());
		A.add(1, "nath");
		assertEquals("(caio, nath)", A.toString());

		assertEquals("nath", A.get(1));
		A.add(2, "bruno");
		assertEquals("(caio, nath, bruno)", A.toString());
		assertThrows(IndexOutOfBoundsException.class, () -> {
			A.get(3);
		});
		assertEquals("nath", A.remove(1));
		assertEquals("(caio, bruno)", A.toString());
		A.add(1, "vitoria");
		assertEquals("(caio, vitoria, bruno)", A.toString());
		A.add(3, "daniel");
		assertEquals("(caio, vitoria, bruno, daniel)", A.toString());
		A.add(4, "giovani");
		assertEquals("(caio, vitoria, bruno, daniel, giovani)", A.toString());
		assertEquals("bruno", A.get(2));
		assertEquals("(caio, vitoria, bruno, daniel, giovani)", A.toString());
		assertEquals("daniel", A.set(3, "gustavo"));
		assertEquals("(caio, vitoria, bruno, gustavo, giovani)", A.toString());
	}
}

package gameScore;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Score s = new Score();
		GameEntry ge;
		
		ge = new GameEntry("Caio",1200);
		s.add(ge);
		assertEquals("[(Mike, 1105)]", s.toString(),"Deve sair: [(Mike, 1105)]");

	}

}

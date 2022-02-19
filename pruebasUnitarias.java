import static org.junit.Assert.*;
import org.junit.Test;

public class pruebasUnitarias {
	private PosfixCalc calculadora = new PosfixCalc();
	private Stack pila = new Stack();
	
	@Test
	public void CalcText() {
		assertEquals(3,calculadora.Evaluate("1 2 +"));
	}

	@Test
	public void stackCount() {
		pila.push(3);
		pila.push(5);
		assertEquals(2,pila.count());
	}
	
	@Test
	public void stackEmpty() {
		assertTrue(pila.isEmpty());
	}
	
	@Test
	public void stackPeek() {
		pila.push(5);
		assertSame(1,pila.count());
		assertSame(5,pila.peek());
		assertSame(1,pila.count());
	}
	
	@Test
	public void stackPull() {
		pila.push(3);
		assertSame(1,pila.count());
		pila.pull();
		assertSame(0,pila.count());
	}
	
	@Test
	public void stackPush() {
		pila.push(5);
		assertSame(5,pila.peek());
	}
	
}

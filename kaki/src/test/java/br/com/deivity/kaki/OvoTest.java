package br.com.deivity.kaki;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class OvoTest {

	@Test
	public void fritarCruTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 499; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.CRU, ovo.pegarStatus());
	}
	
	@Test
	public void fritarMeioFritoTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 500; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.MEIOFRITO, ovo.pegarStatus());
	}
	@Test
	public void fritarDeliciaTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 900 ; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.DELICIA, ovo.pegarStatus());
	}
	@Test
	public void fritarMeioQueimadoTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 1150 ; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.MEIOQUEIMADO, ovo.pegarStatus());
	}
	
	@Test
	public void fritarQueimadoTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 1500; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.QUEIMADO, ovo.pegarStatus());
	}
	

	@Test 
	public void fritarNaoQuebradoTest() { 
		Ovo ovo = new Ovo(10); 
		Exception exception = assertThrows(RuntimeException.class, () -> { 
			ovo.fritar(); 
		});
		assertEquals("Ovo nao esta quebrado", exception.getMessage()); 
	}
	 
}
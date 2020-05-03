package ufv.dis.Prebaexamen.guzoexamen;

import static org.junit.Assert.*;

import org.junit.Test;



public class AppTest {

	@Test
	public void instanciarUsuario() {
		Usuario u = new Usuario ("Guzman","Oñate","bla@gmail.com","87237847x","21/03/1996");
		assertEquals("Guzman",u.getName());
	}
	
	@Test
	public void addUsuarioLista() {
		Usuario u = new Usuario ("Guzman","Oñate","bla@gmail.com","87237847x","21/03/1996");
		
		Lista lista = new Lista();
		lista.addUsuario(u);
		
		assertEquals(1,lista.getSize());
	}
	
	@Test
	public void comprobarMayorEdad() {
		Usuario u = new Usuario ("Guzman","Oñate","bla@gmail.com","87237847x","21/03/1996");
		assertEquals(true,u.adulto());		
		
		Usuario u2 = new Usuario ("Guzman","Oñate","bla@gmail.com","87237847x","21/03/2010");
		assertEquals(false,u2.adulto());
	}

}

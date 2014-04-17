package pucrs.alpro2.pdv.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import pucrs.alpro2.pdv.exceptions.PdvException;
import pucrs.alpro2.pdv.model.Cliente;

public class ClienteTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCliente() throws PdvException {
		Cliente cli = new Cliente("026.202.660-09", "email@dom.com");		
	}

}

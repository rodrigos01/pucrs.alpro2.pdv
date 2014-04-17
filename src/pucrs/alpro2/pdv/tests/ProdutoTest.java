package pucrs.alpro2.pdv.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pucrs.alpro2.pdv.exceptions.PdvException;
import pucrs.alpro2.pdv.model.Produto;

public class ProdutoTest {

	@Test
	public void testProduto() throws PdvException {
		Produto prod = new Produto("0923801293823", "839742384", "kg", 124);
	}

}

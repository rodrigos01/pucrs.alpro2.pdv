package pucrs.alpro2.pdv.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import pucrs.alpro2.pdv.model.Produto;

public class Catalogo extends Dicionario<String, Produto> {
	
	public Catalogo() {
		Path path = Paths.get("catalogo.txt");
		try(BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())) {
			String line = null;
			String[] arrProduto;
			while((line = reader.readLine()) != null) {
				arrProduto = line.split(";");
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	
}

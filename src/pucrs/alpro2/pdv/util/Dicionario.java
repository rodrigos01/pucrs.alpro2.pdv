/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pucrs.alpro2.pdv.util;

/**
 *
 * @author rodrigo
 */
public class Dicionario<K,V> {
    
    private K[] chaves;
    private V[] valores;
    private int count = 0, size = 1;
    
    public Dicionario() {
        startArrays();
    }
    
    private void startArrays() {
        chaves = (K[]) new Object[size];
        valores = (V[]) new Object[size];
    }
    
    public void add(K key, V valor) {
        try {
            chaves[count] = key;
            valores[count] = valor;
            count++;
        } catch (ArrayIndexOutOfBoundsException e) {
            K[] oldChaves = chaves;
            V[] oldValores = valores;
            size++;
            startArrays();
            for(int iterator=0;iterator < oldChaves.length; iterator++) {
                chaves[iterator] = oldChaves[iterator];
                valores[iterator] = oldValores[iterator];
            }
            add(key,valor);
        }
    }
    
    public V get(K key) {
        for(int iterator=0;iterator < chaves.length; iterator++) {
            if(chaves[iterator].equals(key)) {
                return valores[iterator];
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public int Size() {
        return size;
    }

    @Override
    public String toString() {
        String retorno = "";
        for(int iterator=0;iterator < chaves.length; iterator++) {
            retorno += iterator+"=> "+chaves[iterator].toString()+": "+valores[iterator].toString()+";\n";
        }
        return retorno;
    }
    
    
    
}

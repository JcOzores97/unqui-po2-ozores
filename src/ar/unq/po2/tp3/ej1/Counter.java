package ar.unq.po2.tp3.ej1;

import java.util.ArrayList;
import java.util.List;



public class Counter {
	
	
	List<Integer> numeros = new ArrayList<Integer>();
	
	
	public Integer cantidadDePares() {
		Integer pares = 0;
		
		for (Integer numero : this.getNumeros()) {
			if (numero % 2 == 0) pares++;
		}
		return pares;
		
		
	}
	public Integer cantidadDeImpares() {
		Integer impares = 0;
		
		for (Integer numero : this.getNumeros()) {
			if (numero % 2 != 0) impares++;
		}
		return impares;
		
		
	}
	public Integer cantidadDeMultiplos(Integer x) {
		Integer multiplos = 0;
		
		for (Integer numero : this.getNumeros()) {
			if (numero % x == 0) multiplos++;
		}
		return multiplos;
		
		
	}
	
	
	


	public List<Integer> getNumeros() {
		return numeros;
	}


	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public void añadirNumero(int i) {
		
		this.numeros.add(i);
		
	}
	
	 public Integer numeroConMayorCantidadDeDigitosPares() {
		
		 Integer numeroConMayorCantidadDePares = 0;
		 Integer cantidadDeDigitosParesDelQuePoseeMas = 0;
		 
		 for (Integer numeroActual : this.getNumeros()) {
			 
				if(this.cantidadDigitosPar(numeroActual) > cantidadDeDigitosParesDelQuePoseeMas) {
					numeroConMayorCantidadDePares = numeroActual;
					cantidadDeDigitosParesDelQuePoseeMas = this.cantidadDigitosPar(numeroActual);
					
				}
			}
		 
		 return numeroConMayorCantidadDePares;
		 
		 
	 }
	 
	 public Integer cantidadDigitosPar(Integer num) {
		 Integer cantidad = 0;
		 Integer numerosRestantes = num;
		 
		 while(numerosRestantes > 0) {	
			int digito = numerosRestantes % 10;
			
			if(digito % 2 == 0) cantidad++;
			
			numerosRestantes /= 10;
		 }
		 
		 return cantidad;
	 }
	 
	 
	 public Integer multiploComunMasAltoMenorAMil(Integer x, Integer y) {
		 
		 Integer nroMasAlto = 1000; 
		 
		 while (nroMasAlto > 0 & (nroMasAlto % x != 0 | nroMasAlto % y != 0) ) {
			 nroMasAlto --;
		 }
		 
		 if(nroMasAlto == 0) {
			 return -1;
		 }else {
			 return nroMasAlto;
		 }
		 
	 }
	 
	 
	 
	 
	 
	
}

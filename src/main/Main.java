package main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import mergesort.MergeSort;
import burbujeo.Burbujeo;

public class Main {

	public static void main(String[] args) {
		Burbujeo bs=new Burbujeo();
		MergeSort ms=new MergeSort();
		
		long time_start, time_end;
		
		int[] toSort10 = new int[10];
		for(int i=0;i<10;i++){
			toSort10[i]=10-i;
		}
		//----------------------------------MERGESORT----------------------------------------
		//inicio de ordenamiento -- obtener hora para comparar cuando termine el ordenamiento
		time_start = System.currentTimeMillis();
		
		System.out.println("ordenamiento de 10 elementos MERGESORT");
		int[] toPrintMs=ms.sort(toSort10);
		//imprime el arreglo ordenado
		for(int j=0;j<toPrintMs.length;j++){
			System.out.print(toPrintMs[j]+" ");
		}
		//fin de ordenamiento -- obtener hora para comparar con la del inicio del ordenamiento
		time_end = System.currentTimeMillis();
		System.out.println("the task  has taken "+ ( time_end - time_start ) +" milliseconds");
		//----------------------------------BUBBLESORT----------------------------------------
		//inicio de ordenamiento -- obtener hora para comparar cuando termine el ordenamiento
		time_start = System.currentTimeMillis();
		System.out.println("ordenamiento de 10 elementos BUBBLESORT");
		int[] toPrintBs=bs.sort(toSort10);
		//imprime el arreglo ordenado
		for(int j=0;j<toPrintBs.length;j++){
			System.out.print(toPrintBs[j]+" ");
		}
		//fin de ordenamiento -- obtener hora para comparar con la del inicio del ordenamiento
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
		
		
		
		int[] toSort100 = new int[100];
		for(int i=0;i<100;i++){
			toSort100[i]=100-i;
		}
		//----------------------------------MERGESORT----------------------------------------
		//inicio de ordenamiento -- obtener hora para comparar cuando termine el ordenamiento
		time_start = System.currentTimeMillis();
		System.out.println("ordenamiento de 100 elementos MERGESORT");
		int[] toPrint100=ms.sort(toSort100);
		//imprime el arreglo ordenado
		for(int j=0;j<toPrint100.length;j++){
			System.out.print(toPrint100[j]+" ");
		}
		//fin de ordenamiento -- obtener hora para comparar con la del inicio del ordenamiento
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
		//----------------------------------BUBBLESORT----------------------------------------
		//inicio de ordenamiento -- obtener hora para comparar cuando termine el ordenamiento
		time_start = System.currentTimeMillis();
		System.out.println("ordenamiento de 100 elementos BUBBLESORT");
		int[] toPrintBs100=bs.sort(toSort100);
		//imprime el arreglo ordenado
		for(int j=0;j<toPrintBs100.length;j++){
			System.out.print(toPrintBs100[j]+" ");
		}
		//fin de ordenamiento -- obtener hora para comparar con la del inicio del ordenamiento
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
	
	
	
		int[] toSort1000 = new int[1000];
		for(int i=0;i<1000;i++){
			toSort1000[i]=1000-i;
		}
		//----------------------------------MERGESORT----------------------------------------
		//inicio de ordenamiento -- obtener hora para comparar cuando termine el ordenamiento
		time_start = System.currentTimeMillis();
		System.out.println("ordenamiento de 1000 elementos MERGESORT");
		int[] toPrint1000=ms.sort(toSort1000);
		//imprime el arreglo ordenado
		for(int j=0;j<toPrint1000.length;j++){
			System.out.print(toPrint1000[j]+" ");
		}
		//fin de ordenamiento -- obtener hora para comparar con la del inicio del ordenamiento
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
		//----------------------------------BUBBLESORT----------------------------------------
		//inicio de ordenamiento -- obtener hora para comparar cuando termine el ordenamiento
		time_start = System.currentTimeMillis();
		System.out.println("ordenamiento de 1000 elementos BUBBLESORT");
		int[] toPrintBs1000=bs.sort(toSort1000);
		//imprime el arreglo ordenado
		for(int j=0;j<toPrintBs1000.length;j++){
			System.out.print(toPrintBs1000[j]+" ");
		}
		//fin de ordenamiento -- obtener hora para comparar con la del inicio del ordenamiento
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
		
		
		int[] toSort10000 = new int[10000];
		for(int i=0;i<10000;i++){
			toSort10000[i]=10000-i;
		}
		//----------------------------------MERGESORT----------------------------------------
		//inicio de ordenamiento -- obtener hora para comparar cuando termine el ordenamiento
		time_start = System.currentTimeMillis();
		System.out.println("ordenamiento de 10000 elementos MERGESORT");
		int[] toPrint10000=ms.sort(toSort10000);
		//imprime el arreglo ordenado
		for(int j=0;j<toPrint10000.length;j++){
			System.out.print(toPrint10000[j]+" ");
		}
		//fin de ordenamiento -- obtener hora para comparar con la del inicio del ordenamiento
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
//		//----------------------------------BUBBLESORT----------------------------------------
//		//inicio de ordenamiento -- obtener hora para comparar cuando termine el ordenamiento
//		time_start = System.currentTimeMillis();
//		System.out.println("ordenamiento de 1000 elementos BUBBLESORT");
//		int[] toPrintBs10000=bs.sort(toSort10000);
//		//imprime el arreglo ordenado
//		for(int j=0;j<toPrintBs10000.length;j++){
//			System.out.print(toPrintBs10000[j]+" ");
//		}
//		//fin de ordenamiento -- obtener hora para comparar con la del inicio del ordenamiento
//		time_end = System.currentTimeMillis();
//		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
		
		//O(n^2)   										 O(n.log2 n)
		//bublesort 10    elementos 0  milisegundos      mergesort 10    elementos 1  milisegundos
		//bublesort 100   elementos 2  milisegundos		 mergesort 100   elementos 2  milisegundos
		//bublesort 1000  elementos 10 milisegundos		 mergesort 1000  elementos 13 milisegundos
		//bublesort 10000 elementos 135milisegundos		 mergesort 10000 elementos 28 milisegundos
	}

}

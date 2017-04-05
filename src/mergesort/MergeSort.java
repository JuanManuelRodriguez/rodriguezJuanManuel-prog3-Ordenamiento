package mergesort;

import burbujeo.Burbujeo;

public class MergeSort {

	private int[] values;
	private int[] aux;
	private int length;
	public MergeSort(){
		
	}
	public int[] sort(int[] values){
		this.values=values;
		this.length=values.length;
		this.aux=new int[length];
		mergesort(0,length-1);
		return this.values;
	}
	private void mergesort(int low, int high) {
		if(low<high){
			int middle=(low+high)/2;
			mergesort(low,middle);
			mergesort(middle+1,high);
			merge(low,middle,high);
		}
	}
	private void merge(int low, int middle, int high) { 
		for(int i=low;i<=high;i++){
			aux[i]=values[i];
		}
		int i=low;
		int j=middle+1;
		int k=low;
		while(i<=middle && j<=high){
			if(aux[i]<=aux[j]){
				this.values[k]=aux[i];
				i++;
			}
			else{
				this.values[k]=this.aux[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			this.values[k]=this.aux[i];
			k++;
			i++;
		}
	}
	public static void main(String[] args) {
		MergeSort ms=new MergeSort();
		int[] toSort = new int[10];
		for(int i=0;i<10;i++){
			toSort[i]=10-i;
		}
		//imprime el arreglo desordenado
		for(int i=0;i<toSort.length;i++){
			System.out.print(toSort[i]+" ");
		}
		System.out.println();
		int[] toPrint=ms.sort(toSort);//ordena el arreglo de mayor a menor
		//imprime el arreglo ordenado
		for(int j=0;j<toPrint.length;j++){
			System.out.print(toPrint[j]+" ");
		}

	}

}

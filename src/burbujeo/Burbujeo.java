package burbujeo;

public class Burbujeo {
	public Burbujeo(){
		
	}
	public int[] sort(int[] bubble){
		int i, j, aux;
		for(i=0;i<bubble.length-1;i++){
			for(j=0;j<bubble.length-i-1;j++){
				if(bubble[j+1]<bubble[j]){
					aux=bubble[j+1];
					bubble[j+1]=bubble[j];
					bubble[j]=aux;
				}
			}
		}
		return bubble;
	}
	public static void main(String[] args) {
		Burbujeo b=new Burbujeo();
		int[] toSort = new int[10];
		for(int i=0;i<10;i++){
			toSort[i]=10-i;
		}
		//imprime el arreglo desordenado
		for(int i=0;i<toSort.length;i++){
			System.out.print(toSort[i]+" ");
		}
		System.out.println();
		int[] toPrint=b.sort(toSort);//ordena el arreglo de mayor a menor
		//imprime el arreglo ordenado
		for(int j=0;j<toPrint.length;j++){
			System.out.print(toPrint[j]+" ");
		}
	}

}

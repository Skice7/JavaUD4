/* 
 
  @author Víctor Castillo

*/
public class Ejercicio5 {

	public static void main(String[] args) {
		
		int A = 10;
		int B = 20;
		int C = 30;
		int D = 40;
		System.out.println("valores iniciales \n");
		System.out.println("A:" + A);
		System.out.println("B:" + B);
		System.out.println("C:" + C);
		System.out.println("D:" + D +"\n");
		
		//Cambiamos los valores
		B = C;
		C = A;
		A = D;
		D = B;

		System.out.println("valores cambiados \n");
		       
		System.out.println("B -> C = "+ C);
		System.out.println("C -> A = "+ A);
		System.out.println("A -> D = "+ D);
		System.out.println("D -> B = "+ B);
	}

}

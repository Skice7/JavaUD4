/* 
 
  @author Víctor Castillo

*/
public class Ejercicio3 {

	public static void main(String[] args) {
		int X = 10;
		int Y = 30;
		double N = 100;
		double M = 10;
		
		System.out.println("El Valor de cada variable( N:"+ N + " M:"+ M + " X:"+ X + " Y:"+ Y+" )");
		System.out.println("Suma = "+(X+Y));
		System.out.println("diferencia = "+ (X-Y));
        System.out.println("producto = "+ (X*Y));
        System.out.println("cociente = "+ (X/Y));
        System.out.println("resto = "+ (X%Y));
        
        System.out.println("suma = "+ (N+M));
        System.out.println("diferencia = "+ (N-M));
        System.out.println("producto = "+ (N*M));
        System.out.println("cociente = "+ (N/M));
        System.out.println("resto = "+ (N%M));
        System.out.println("suma = "+ (X+N));
        System.out.println("cociente = "+ (Y/M));
        System.out.println("resto = "+ (Y%M));

        System.out.println("doble X: "+ (X*2));
        System.out.println("doble Y: "+ (Y*2));
        System.out.println("doble N: "+ (N*2));
        System.out.println("ndoble M: "+ (M*2));
        

        System.out.println("suma de todas las variables: "+ (Y+X+N+M)+"\n");

        System.out.println("producto de todas las variables: "+ (Y*X*N*M)+"\n");
	}

}

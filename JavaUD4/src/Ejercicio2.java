/* 
 
  @author Víctor Castillo

*/
public class Ejercicio2 {

	public static void main(String[] args) {
		int N = 5;
        double A = 4.56;
        char C = 'a';
        
        double suma= N+A;
        double diferencia= A-N;

        int Caracter = Character.getNumericValue(C);

        System.out.println("La Variable N: "+ N);
        System.out.println("La Variable A: "+ A);
        System.out.println("La Variable C: "+ C);
        System.out.println(N+" + "+A+" = "+ suma);
        System.out.println(A+" + "+N+" = "+ diferencia);
        System.out.println("valor numerico del caracter "+C+" = "+ (int)C);
       
	}

}

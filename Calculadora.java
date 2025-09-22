
public class Calculadora{

		public static void main(String [] args){
			
			System.out.println("Ejemplo de suma: "+ suma(2,10));
			System.out.println("Ejemplo de resta: " + restarNumeros(10,5));
			System.out.println("Ejemplo de multiplicacion: "+ multiplicacion(2,5));
			System.out.println("Ejemplo de division: "+division(10,2));
		}
			
		//Implementamos la suma
		public int suma (int a, int b){
		
		return a+b;
		
		}
		
		//Implementación de resta
		public int restarNumeros(int num1, int num2){
        int resultado = num1-num2;
        return resultado;
	}
	
	    //Implementacion de Multiplicacion
	 public int multiplicacion(int num1, int num2){
        int resultado = num1*num2;
        return resultado;
    }
		//Implementacion de division
    public int division(int dividendo, int divisor){
       double resultado = dividendo/divisor;

       return resultado; 
    }
}


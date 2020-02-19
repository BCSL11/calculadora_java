

package Logica;

public class operaciones {
    
    private double numero1;
    private double numero2;
    private String operador3;

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public String getOperador3() {
        return operador3;
    }
    
    

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setOperador3(String operador3) {
        this.operador3 = operador3;
    }
    
    
   
    public static double suma(double numero1,double numero2){
      double resultado = numero1 + numero2;
        return resultado;  
    }
    
     public static double resta(double numero1,double numero2){
      double resultado = numero1 - numero2;
        return resultado;  
    }
     
      public static double multiplicacion(double numero1,double numero2){
      double resultado = numero1 * numero2;
        return resultado;  
    }
      
      public static double div(double numero1,double numero2){
     
          double resultado = numero1 /numero2;
      
        return resultado;  
    }
}

public class DatPrimBool {
public static void main(String[] args) {
     
    boolean b; 

    b = false; 
    System.out.println("b es : "+b);
    
    b = true;
    System.out.println("b es : "+b);
        
     //Un valor booleano puede contralar la sentencia if   
    
if  (b) System.out.println("Esto si se ejecutara");

b=false; 
if  (b)  System.out.println("Esto no se ejecutara.");

 //El resultado de un operador relacional es un valor booleano
    System.out.println("10 > 9 es "+ (10 > 9 ));
}    
}

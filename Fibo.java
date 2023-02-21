import java.util.Scanner;

public class SerieFigonacci{

public static void main(String[] Args){
    
    int n =0;
    Scanner s = new Scanner(System.in);
    system.out.println("Cantidad de elementos para la serie? ");
    n = s.nextInt();
    int a,b,c,d;
    a=0;
    b=1;
    for(i=0;n>i;i++){
 
        system.out.println(a);
        c=a+b;
        a=b;
        b=c;
    }
    System.out.println("El indice apunta a : " + a);
    
}

}


import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
            Scanner sc = new Scanner(System.in);
            double peso, altura;
            System.out.println("Insira seu peso ");
            peso = sc.nextDouble();
            
            System.out.println("Insira sua altura ");
            altura = sc.nextDouble();
             
              
              
            double IMC = (peso / Math.pow(altura,2) * 703);
            System.out.println("Seu IMC é: " + Math.round(IMC));
          
         sc.close();
        }
}

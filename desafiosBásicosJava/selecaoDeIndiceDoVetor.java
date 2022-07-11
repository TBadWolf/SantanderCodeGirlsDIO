import java.io.IOException;
import java.util.Scanner;
 
public class selecaoDeIndiceDoVetor { 
 
    public static void main(String[] args) throws IOException {
            String[] nomes = new String[5];
            Scanner input = new Scanner(System.in);
            
            for (int i = 0; i < nomes.length; i++)
            {
                
             nomes[i] = input.nextLine();
            }
 
            int pos = input.nextInt();
            System.out.println( nomes[pos] );
           
    }
}
import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) throws Exception {
       Scanner terminal = new Scanner (System.in);
       System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o Segundo Paramêtro: 2");
        int parametroDois = terminal.nextInt();

          
        try{
            contar(parametroUm,parametroDois);


        } catch (ParametrosInvalidosException Exception) {
            System.out.println("O Segundo Parâmetro deve ser maior que  o primeiro!");
        }
        terminal.close();
    }
        
        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
            if (parametroUm > parametroDois) {
                 System.out.println("O segundo parametro deve ser maior que o primeiro");
            }
            
            
            for(int i = parametroUm; i <= parametroDois; i++){
                System.out.println("Contando: "+ i );
            }
                
            }
        }   
    
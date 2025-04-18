import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosExeption {
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Informe o primeiro parametro: ");
        int parametro1 = scanner.nextInt();
        System.out.println("Informe o segundo parametro: ");
        int parametro2 = scanner.nextInt();

        try {
            validarParametros(parametro1, parametro2);

            contar(parametro2 - parametro1);
    
        } catch (ParametrosInvalidosExeption e) {

            System.out.println("O segundo parametro precisa ser maior que o primeiro parametro");
        }


    }

    static void contar(int contagem){
        for (int i = 1; i <= contagem; i++ ){
            System.out.println("Imprimindo o numero " + i);
        }
        
    }

    static void validarParametros (int parametro1, int parametro2) throws ParametrosInvalidosExeption{
        if (parametro1> parametro2) {
            throw new ParametrosInvalidosExeption();
            
        }
    }
}

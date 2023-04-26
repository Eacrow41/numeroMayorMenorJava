import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Ingress the primer number: ");
        Integer numero1 = solicitarNumero();

        System.out.println("Ingress the second number: ");
        Integer numero2 = solicitarNumero();

        System.out.println("Ingress the three number: ");
        Integer numero3 = solicitarNumero();

        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
    }

    /**
     * Funcion para el calculo que verifica el numero mayor
     * @param numero1
     * @param numero2
     * @param numero3
     */
    private static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3){
        Integer numeroMayor = numero1;

        if (numero2 > numeroMayor){
            numeroMayor = numero2;
        }
        if(numero3 > numeroMayor){
            numeroMayor = numero3;
        }

        System.out.println("El numero mayor es: " + numeroMayor);
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @param numero3
     */
    private static void calcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3){
        Integer numeroMayor = numero1;

        if (numero2 < numeroMayor){
            numeroMayor = numero2;
        }
        if(numero3 < numeroMayor){
            numeroMayor = numero3;
        }

        System.out.println("El number minor es: " + numeroMayor);
    }

    /**
     *
     * @return
     * @throws IOException
     */
    private static Integer solicitarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}

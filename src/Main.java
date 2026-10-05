public class Main {

    public static int contarBumeranes(int[] numeros) {
        int contador = 0;

        for (int i = 0; i < numeros.length - 2; i++) {

            // Verifica si el primero y el último son iguales
            // y el número del medio es diferente
            if (numeros[i] == numeros[i + 2] &&
                    numeros[i] != numeros[i + 1]) {

                System.out.println("Bumerán: [" +
                        numeros[i] + ", " +
                        numeros[i + 1] + ", " +
                        numeros[i + 2] + "]");

                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        int[] numeros = {2, 1, 2, 3, 3, 4, 2, 4};

        int total = contarBumeranes(numeros);

        System.out.println("Número total de bumeranes: " + total);
    }
}

package binary;

public class BinarySum {
    public static int binarySum(int[] A, int i, int n) {
        // Caso base: se n for igual a 1, retorna o elemento A[i]
        if (n == 1) {
            return A[i];
        }
        
        // Divide o problema em duas partes e chama recursivamente para cada metade
        int mid = n / 2;
        System.out.println(mid);
        return binarySum(A, i, mid) + binarySum(A, i + mid, n - mid);
    }

    public static void main(String[] args) {
        // Exemplo de utilização
        int[] arr = {1, 2, 3, 4, 5,6};
        int n = arr.length;
        int sum = binarySum(arr, 0, n);
        System.out.println("A soma dos elementos é: " + sum);
    }
}

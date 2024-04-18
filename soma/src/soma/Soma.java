package soma;

public class Soma {
    public static int linearSum(int[] A, int n) {
        if (n == 1) {
            System.out.println("Caso BASE" + A[0]);
            return A[0];
        } else {       
        	 System.out.println("Caso recursivo" + A[n-1]);
            return  linearSum(A, n - 1) + A[n - 1];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Chamando linearSum para somar os primeiros " + n + " elementos do arranjo.");
        int result = linearSum(arr, n);
        System.out.println("A soma dos elementos é: " + result);
    }
}

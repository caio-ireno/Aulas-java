package inverterArray;

public class ReverseArray {
    public static void reverseArray(int[] A, int i, int j) {
        // Verifica se i é menor que j, caso contrário, não há elementos para inverter
        if (i < j) {
            // Troca os elementos A[i] e A[j]
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            
            // Chamada recursiva para inverter os elementos restantes
            reverseArray(A, i + 1, j - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        
        System.out.println("Array original:");
        printArray(arr);
        
        // Chamada do algoritmo para inverter o array
        reverseArray(arr, 0, n - 1);
        
        System.out.println("Array invertido:");
        printArray(arr);
    }
    
    // Método auxiliar para imprimir o array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

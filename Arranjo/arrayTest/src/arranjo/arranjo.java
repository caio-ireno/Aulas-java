package arranjo;

public class arranjo {
    private int[] arr;

    public arranjo(int[] arr) {
        this.arr = arr;
    }

   
    public int encontrarMenor() {
        int menor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
            }
        }
        return menor;
    }

   
    public int encontrarMaior() {
        int maior = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maior) {
                maior = arr[i];
            }
        }
        return maior;
    }

  
    public int somarValores() {
        int soma = 0;
        for (int num : arr) {
            soma += num;
        }
        return soma;
    }

   
    public int contarOcorrencias(int numero) {
        int contador = 0;
        for (int num : arr) {
            if (num == numero) {
                contador++;
            }
        }
        return contador;
    }
}

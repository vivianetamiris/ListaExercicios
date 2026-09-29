public class Sorts<T extends Comparable<T>> {

    public void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(T[] array, int inicio, int fim) {
        if (inicio < fim) {
            int p = partition(array, inicio, fim);
            quickSort(array, inicio, p - 1);
            quickSort(array, p + 1, fim);
        }
    }

    private int partition(T[] array, int inicio, int fim) {
        T pivot = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                // troca array[i] e array[j]
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        T temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        return i + 1;
    }

}

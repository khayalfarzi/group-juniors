package az.iktlab.juniors.java_lessons.lesson_17;

import java.time.LocalTime;
import java.util.Random;

public class AlgorithmChecker {

    int count = 0;

    public long checkSortMethod(int[] arr) {

        LocalTime start = LocalTime.now();

        int count = 0;
        LocalTime end = LocalTime.now();
        sortArray(arr);
        return end.getNano() - start.getNano();
    }

    public void sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                counter++;
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    //Parvin
//    public void bubbleSort(int[] num) {
//        int count = 0;
//        for (int i = 0; i < num.length - 1; i++) {
//            boolean flag = true;
//            for (int j = 0; j < num.length - i - 1; j++) {
//                count++;
//                if (num[j] > num[j + 1]) {
//                    flag = false;
//                    int temp = num[j];
//                    num[j] = num[j + 1];
//                    num[j + 1] = temp;
//                }
//            }
//            if (flag) break;
//        }
//        System.out.println(count);
//    }

    // Ulvi and Ilgar
    int counter = 0;

    void countingSort(int array[], int place) {
        int[] output = new int[array.length + 1];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            counter++;
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i)
            count[i] = 0;
        counter++;

        for (int i = 0; i < array.length; i++)
            count[(array[i] / place) % 10]++;
        counter++;
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];
        counter++;

        for (int i = array.length - 1; i >= 0; i--) {
            output[count[(array[i] / place) % 10] - 1] = array[i];
            count[(array[i] / place) % 10]--;
            counter++;
        }

        for (int i = 0; i < array.length; i++)
            array[i] = output[i];
        counter++;
    }

    int getMax(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        counter++;
        return max;
    }

    void radixSort(int array[]) {
        int max = getMax(array);
        for (int place = 1; max / place > 0; place *= 10)
            countingSort(array, place);
    }

    // Nabat and Nadir
    int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            count++;
            if (arr[j] <= pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        int t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;

        return i + 1;
    }

    void sort(int arr[], int low, int high) {
        count++;
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // Ramil and Aisha
    public static void selectionSort(int[] arr) {
        int k = 0;
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int index = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                    k++;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            k++;
        }
        System.out.println(k);
    }
}
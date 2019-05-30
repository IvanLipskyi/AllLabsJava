package ExceptionsTest;

public class ArrayExceptionsTest {
    public static void printArray(int[]a, int start, int end){
        try {for (int i = start; i <= end; i++) {
            System.out.println(a[i]);
        }
        }catch (IndexOutOfBoundsException e){
        System.out.println("Ошибка. Попытка обращение к несуществующему индексу массива. Текущий индекс: " + end + "; Размер массива: " + a.length);
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr = {2,5,9,12,8,16};
            printArray(arr, 2, 8);
    }
}

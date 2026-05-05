import java.util.Arrays;

/**
 * Клас для виконання математичних операцій над матрицями.
 * Містить логіку обчислення без інтерфейсу користувача.
 * 
 * @author Студент
 * @version 1.0
 */
public class MatrixProcessor {

    /**
     * Приватний конструктор для запобігання створенню екземплярів службового класу.
     * Це прибирає попередження Javadoc про відсутність коментаря до конструктора.
     */
    private MatrixProcessor() {
        throw new UnsupportedOperationException("Це службовий клас");
    }

    /**
     * Знаходить індекс рядка матриці з максимальною сумою елементів.
     * Використовує {@link java.util.Arrays#stream} для оптимізації обчислень.
     * 
     * @param matrix Двовимірний масив цілих чисел (N x M).
     * @return Індекс (від 0) рядка з найбільшою сумою елементів.
     * @throws IllegalArgumentException якщо матриця дорівнює null або порожня.
     */
    public static int findMaxSumRowIndex(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Матриця не має даних");
        }

        long maxSum = Long.MIN_VALUE;
        int targetIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            // Оптимізація: обчислення суми рядка без явного внутрішнього циклу
            long currentSum = Arrays.stream(matrix[i]).asLongStream().sum();

            if (currentSum > maxSum) {
                maxSum = currentSum;
                targetIndex = i;
            }
        }
        return targetIndex;
    }
}
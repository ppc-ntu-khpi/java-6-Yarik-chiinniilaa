import java.util.Arrays;

/**
 * Тестовий клас для перевірки роботи MatrixProcessor.
 */
public class Main {

    /**
     * Конструктор за замовчуванням для класу Main.
     * Додано для повної сумісності з вимогами Javadoc.
     */
    public Main() {}

    /**
     * Точка входу в програму. Створює матрицю та виводить результат.
     * 
     * @param args Аргументи командного рядка.
     */
    public static void main(String[] args) {
        // Створення тестової матриці
        int[][] testMatrix = {
            {5, 2, 8},    // Сума 15
            {10, 20, 30}, // Сума 60 (Максимальна)
            {1, 1, 4}     // Сума 6
        };

        try {
            // Виклик методу логіки
            int index = MatrixProcessor.findMaxSumRowIndex(testMatrix);
            
            // Вивід результатів
            System.out.println("Рядок з макс. сумою знайдено за індексом: " + index);
            System.out.println("Дані рядка: " + Arrays.toString(testMatrix[index]));
        } catch (Exception e) {
            // Обробка можливих помилок
            System.err.println("Помилка виконання: " + e.getMessage());
        }
    }
}
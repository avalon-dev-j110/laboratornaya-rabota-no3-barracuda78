package ru.avalon.java.dev.j10.labs;

//Доработать классы в пакете ru.avalon.java.dev.j10.labs.initialization в соответствии с инструкциями.

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

//Доработать классы в пакете ru.avalon.java.dev.j10.labs.sort в соответствии с инструкциями.
//Доработать метод main класса ru.avalon.java.j10.labs.Application в соответствии с инструкциям,
//используя для заполнения массивов классы-инициализаторы из п.1, а для сортировки классы-сортировщики из п.2.

public class Application {
    
    //статический метод нахождения суммы элементов массива
    public static int sum(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[20];

        //Фибоначчи
        new FibonacciInitializer().initialize(array);
        //проверка
        System.out.println("Фибоначчи: " + Arrays.toString(array));
        
        //сумма элементов массива:
        System.out.println("Сумма элементов массива = " + sum(array));
        
        //РАндомная инициализация 1:
        new RandomInitializer(-50, 50).initialize(array);
        //проверка
        System.out.println("Рандом 1 : " + Arrays.toString(array));
        
        //Пузырьковая сортировка:
        new BubbleSort().sort(array);
        //проверка:
        System.out.println("Пузырьковая сортировка: " + Arrays.toString(array));
        
        //РАндомная инициализация 2:
        new RandomInitializer(-50, 50).initialize(array);
        //проверка
        System.out.println("Рандом 2 : " + Arrays.toString(array));
        
        //Сортировка выбором:
        new SelectionSort().sort(array);
        //проверка
        System.out.println("Сортировка выбором: " + Arrays.toString(array));
        
        //РАндомная инициализация 3:
        new RandomInitializer(-50, 50).initialize(array);
        //проверка
        System.out.println("Рандом 3 : " + Arrays.toString(array));
        
        //Сортировка Шелла:
        new ShellSort().sort(array);
        //проверка
        System.out.println("Сортировка Шелла: " + Arrays.toString(array));
        
        
        //
        
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * +++0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * +++1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * +++2. Найти сумму элементов массива.
	     *
	     * +++3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * ++4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
             * +++5. Проинициализировать массив последовательностью
             *    случайных чисел в диапазоне от -50 до 50.
             *
             * +++6. Отсортировать массив с использованием
             *    сортировки выбором.
             *
             * +++7. Проинициализировать массив последовательностью
             *    случайных чисел в диапазоне от -50 до 50.
             *
             * +++8. Отсортировать массив с использованием
             *    сортировки Шелла.
	     */
            
    }
}

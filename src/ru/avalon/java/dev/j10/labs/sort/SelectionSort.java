package ru.avalon.java.dev.j10.labs.sort;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка выбором (англ. selection sort).
 *
 * <p>Алгоритм сортировки. Может быть как устойчивый, так и
 * неустойчивый. На массиве из n элементов имеет время
 * выполнения в худшем, среднем и лучшем случае Θ(n2),
 * предполагая что сравнения делаются за постоянное время.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%BE%D0%BC">Сортировка выбором</a>
 */
public class SelectionSort implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса SelectionSort
         */
//        1.находим номер минимального значения в текущем списке
//        2.производим обмен этого значения со значением первой неотсортированной позиции (обмен не нужен, если минимальный элемент уже находится на данной позиции)
//        3.теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
 
        for (int i = 0; i < array.length - 1; i++) {
            int minimum = i;                                        //это будет индекс элемента с минимальным значением.
            for(int j = minimum + 1; j < array.length; j++){
                minimum = array[j] < array[minimum] ? j : minimum;  //1. если текущий элемент массива (то есть [j]) меньше текушего элемента массива внешнего цикла -  minimum = j;
            }
            //2. делаем замену во внешнем цикле: минимальное значение пишем в первое неотсортированное от начала массива значение.
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
    }
    
    //код для проверки алгоритма:
//    public static void main(String[] args) {
//        int[] array = {20, 15, 8, 16, 4, 3, 0, 1, 3, 2};
//        new SelectionSort().sort(array);
//        System.out.println(Arrays.toString(array));
//    }
}

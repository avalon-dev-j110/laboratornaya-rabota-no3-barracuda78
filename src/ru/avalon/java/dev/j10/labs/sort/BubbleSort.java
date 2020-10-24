package ru.avalon.java.dev.j10.labs.sort;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Пузырьковая сортировка (англ. bubble sort).
 *
 * <p>Простой алгоритм сортировки. Для понимания и
 * реализации этот алгоритм — простейший, но эффективен он
 * лишь для небольших массивов. Сложность алгоритма: O(n^2).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%BF%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC">Пузырьковая сортировка</a>
 */
public class BubbleSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса BubbleSort
         */
        for(int i = array.length-1; i >=0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            } 
        }
        
    }
//код для проверки работоспособности сортировки:  
    
//    public static void main(String[] args) {
//        int[] array = {20, 15, 8, 16, 4, 3, 0, 1, 3, 2};
//        new BubbleSort().sort(array);
//        
//        System.out.println(Arrays.toString(array));
//    }
}

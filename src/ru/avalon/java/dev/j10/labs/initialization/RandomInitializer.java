package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Arrays;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    private int tLeft;
    private int tRight;
    
    public RandomInitializer(int tLeft, int tRight){
        this.tLeft = tLeft;
        this.tRight = tRight;
    }

    public RandomInitializer() {
        throw new UnsupportedOperationException("введите границы числа в качестве параметров конструктора."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    @Override
    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
        Random r = new Random();
        //int random = r.nextInt(tRight - tLeft) + tLeft;
        for (int i = 0; i < array.length; i++) {
            //tLeft - не включен в диапазон согласно условию задания: 
            //"3. Проинициализировать массив последовательностью
	    //случайных чисел в диапазоне от -50 до 50"
            array[i] = r.nextInt(tRight - tLeft) + tLeft;
        }
        
    }
    
    
    //ckecking code:
//    public static void main(String[] args) {
//        int[] array = new int[20];
//        RandomInitializer ri = new RandomInitializer(-50, 50);
//        ri.initialize(array);
//        System.out.println(Arrays.toString(array));
//    }
}

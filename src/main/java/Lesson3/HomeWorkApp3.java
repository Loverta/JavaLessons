package Lesson3;


import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        System.out.println("Инверсия этого массива: " + Arrays.toString(inversionBinArr()));       //вывод инверсии бинарного массива
        System.out.println("-----------------------------------");
        System.out.println("Массив от 1 до 100: ");
        System.out.println(Arrays.toString(createHundredArrAndFillIt()));        //вывод массива на 100 элементов
        System.out.println("-----------------------------------");
        System.out.println("Измененный массив:     " + Arrays.toString(createPreassignedArr()));    //вывод заданного массива
        System.out.println("-----------------------------------");
        twoDimensionArr();                                              //вызов метода, создающего двумерный массив
        System.out.println("-----------------------------------");
        System.out.println("Массив заполненный одинаковыми числами: " + Arrays.toString(createArrWithParameters(5,15))); //вывод массива с переданными параметрами
        System.out.println("-----------------------------------");
        findMaxAndMinInArr();                   //вызов метода, находящего макс. и мин. элемент массива
        System.out.println("-----------------------------------");
        int[] arrForMethod = new int[]{1, 1, 1, 2, 1};
        System.out.println(ifSumLeftEqualsSumRight(arrForMethod));
        System.out.println("-----------------------------------");
        int[] indentArr = new int[10];
        indentValue(-3, indentArr);
    }

    public static int[] createBinArr() {                    //создание бинарного массива
        int[] binArr = new int[10];
        for (int i = 0; i < binArr.length; i++) {
            binArr[i] = (int) (Math.random() * 2);
        }
        return binArr;
    }

    public static int[] inversionBinArr() {                //инверсия бинарного массива
        int[] binArr = createBinArr();
        System.out.println("Первоначальный массив:  " + Arrays.toString(binArr));        //вывод изначального массива(для сравнения)
        for (int i = 0; i < binArr.length; i++) {
            if (binArr[i] == 0) binArr[i] = 1;
            else binArr[i] = 0;
        }
        return binArr;
    }

    public static int[] createHundredArrAndFillIt() {                    //создание и заполнение массива
        int[] hundredArr = new int[100];
        for (int i = 0; i < 100; i++) hundredArr[i] = i + 1;
        return hundredArr;
    }

    public static int[] createPreassignedArr() {                //создание заданного массива и удвоение элементов < 6
        int[] preassignedArr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Первоначальный массив: " + Arrays.toString(preassignedArr));
        for (int i = 0; i < preassignedArr.length; i++) {
            if (preassignedArr[i] < 6) preassignedArr[i] *= 2;
        }
        return preassignedArr;
    }

    public static void twoDimensionArr() {                      //вывод двумерного массива
        int[][] twoDimensionArr = new int[10][10];
        System.out.println("Двумерный массив, закрашенный по диагоналям единицами: ");
        for (int i = 0; i < twoDimensionArr.length; i++) {
            //выбираем строку
            for (int j = 0; j < twoDimensionArr[i].length; j++) {
                //выбираем столбец
                if (i == j) {
                    twoDimensionArr[i][j] = 1;
                    System.out.print(twoDimensionArr[i][j] + " ");
                }
                //если номер столбца и строки совпадает, сохраняем в массив 1 и выводим этот элемент
                else if ( j == ((twoDimensionArr[i].length - 1) - i)) {
                    twoDimensionArr[i][j] = 1;
                    System.out.print(twoDimensionArr[i][j] + " ");
                }
                //если номер столбца равен разности макс. значения и номера строки, то сохраняем в массив 1 и выводим этот элемент
                else System.out.print(twoDimensionArr[i][j] + " ");
                //иначе выводим элемент массива
            }
            System.out.println();
            // переходим на следующую строку, т.к. эта закончилась
        }
    }

    public static int[] createArrWithParameters(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static void findMaxAndMinInArr() {           //нахождение мак. и мин. числа в массиве
        int[] arr = new int[5];
        System.out.print("Заполненный рандомными числами массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Минимальное число = " + min + "; Максимальное число = " + max + ".");
    }


    public static boolean ifSumLeftEqualsSumRight(int[] arrForMethod) { //Считает сумму левых чисел и правых,
        for (int i = 1; i < arrForMethod.length; i++) {                 //выводит true, если есть место в массиве, где эти суммы равны,
            int sumLeft = 0, sumRight = 0;                              //выводит false, если таких мест нет.
            for (int j = i - 1; j >= 0; j--) {
                sumLeft += arrForMethod[j];
            }
            for (int j = i; j < arrForMethod.length; j++) {
                sumRight += arrForMethod[j];
            }
            if (sumLeft == sumRight) {
                System.out.println("Есть место, где сумма левого равна правому ");
                return true;
            }
        }
        System.out.println("Нет такого места ");
        return false;
    }

    public static void indentValue(int n, int[] arr) {      //смещение значений массива на указанное число
        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * 100);
        System.out.println("Созданный массив: " + Arrays.toString(arr));
        if (n > 0) {
            for (; n > 0; n--) {
                int last = arr[arr.length - 1] , first = arr[0];
                for (int i = arr.length - 2; i > 0; i--) {
                    arr[i + 1] = arr [i];
                }
                arr[0] = last;
                arr[1] = first;
            }
        }
        if (n < 0) {
            for (; n < 0; n++) {
                int last = arr[arr.length - 1], first = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[arr.length - 1] = first;
                arr[arr.length - 2] = last;
            }
        }
        System.out.println("Полученный массив со смещением: " + Arrays.toString(arr));
    }

}

//
////--------СТРОКИ и МАССИВЫ (String and Array)--------------------------------------------------------------------------
//
////        МАССИВ - это конечная последовательность упорядоченных элементов одного типа, доступ к каждому элементу
////              в которой осуществляется по его индексу.
////        РАЗМЕР или ДЛИНА массива - это общее количество элементов в массиве. Размер массива задаётся при моздании
////              массива и не может быть изменён в дальнейшем, т.е. нельзя убрать элементы из массива или добавить их
////              туда, но можно в существующие элементы присвоить новые значения.
////        Минимально возможное количество индексов необходимое для точного указания на элемент массива
////              называют РАЗМЕРНОСТЬЮ.
////        Массивы в Java являются ОБЪЕКТАМИ.
//_____________________________________________________________________________________________________________________
////      Тип_данных Название_массива[];
////                  ИЛИ ТАК
////      Тип_данных[] Название массива;
////
////------Например, определим массив чисел:
////          int nums[];             // Объявление массива.
////          int[] nums2;            // Объявление массива.
////
////______ОБЪЯВЛЕНИЕ и ИНИЦИАЛИЗАЦИЯ массива_____________________________________________________________________________
////
////      int nums[];
////      nums = new int[4];          // Массив из 4 чисел. (ИНИЦИАЛИЗАЦИЯ)
////
////      Создание массива производится с помощью следующей конструкции:
////          new Тип_данных[количество_элементов];
////
////      Где, new - ключевое слово, выделяющее память для указанного в скобках количества элементов.
////      Например:
////      nums = new int[4]; - в этом выражении создаётся массив из четырёх элементов int, и каждый элемент будет иметь
////                           значение по умолчанию - число 0.
////
////------Также можно сразу при объявлении массива инициализировать его:
////          int nums[] = new int[4];            // массив из 4 чисел.
////          int[] nums2 = new int[5];           // массив из 5 чисел.
////
////      При подобной инициализации все элементы массива имеют значение по умолчанию. Для числовых типов ( в том числе
////      для типа char) это число 0, для типа boolean это значение false, а для остальных объектов это значение null.
////      Например, для типа int значением по умолчанию является число 0, поэтому выше определённый массив nums будет
////      состоять из четырёх нулей.
////
////------Однако также можно задать конкретные значения для элементов массива при его создании:
////
////// Эти два способа равноценны:
////          int[] nums = new int[] { 1, 2, 3, 5 };
////          int[] nums2 = { 1, 2, 3, 5 };
////
////      Стоит отметить, что в этом случае в квадратных скобках не указывается размер массива, так как он вычисляется
////      по количеству элементов в фигурных скобках.
////_____________________________________________________________________________________________________________________
////
////      После создания массива мы можем обратиться к любому его элементу по индексу, который передается в квадратных
////      скобках после названия переменной массива:
////
////          int[] nums = new int[4];
////      Устанавливаем значения элементов массива
////          nums[0] = 1;
////          nums[1] = 2;
////          nums[2] = 4;
////          nums[3] = 100;
////
////      Получаем значение третьего элемента массива
////          System.out.println(nums[2]);    // 4
////
////      Индексация элементов массива начинается с 0, поэтому в данном случае, чтобы обратиться к четвертому элементу
////      в массиве, нам надо использовать выражение nums[3].
////
////      И так как у нас массив определен только для 4 элементов, то мы не можем обратиться, например, к шестому
////      элементу: nums[5] = 5;. Если мы так попытаемся сделать, то мы получим ошибку.
////
//__________________ ПОЛУЧИТЬ ЗНАЧЕНИЕ ________________________________________________________________________________
//
//        int[] array = new int[]{7,-2,5,6};       // Массив из которого будет взято число по индексу.
//        int temp = array[2];                     // Оператор взятия ПО ИНДЕКСУ.
//        System.out.println(temp);                // Вывод числа.
//
////      При попытке доступа к несуществующему индексу программа прекратит свою работу!!!
//___________________ ОПЕРАТОР ТОЧКА __________________________________________________________________________________
//
//        array.
//        Оператор точка означает – перейди по этой ссылке и обратись к той переменной имя которой идёт после точки.
//
//        Пример:
//        array.length
//
//___________________ ПРО ОБЪЕКТЫ _____________________________________________________________________________________
//
//        int[] array = new int[]{7,-2,5,6};       // Массив.
//        Где:
//        array - ссылка (Эта переменная хранит в памяти одно 64 битное число).
//        Ссылка – это адрес в памяти, где хранится объект.
//        new - Оператор ответственный за создание объекта.
//
//        ОБЪЕКТ – это изолированный участок оперативной памяти, в котором одновременно хранятся данные и ссылки
//                 на методы их обработки.
//        ОБЪЕКТ в java состоит из:
//                                  1.	Заголовок.
//                                  2.	Длинна (устанавливается автоматически).
//
//__________ ССЫЛКИ ___________________________________________________________________________________________________

//      int[] array = new int[12];
//      int[] array1 = new int[]{7,-2,5,6};
//      array = array1;                            // Получаем две ссылки на один объект.

//_____________________________________________________________________________________________________________________

////______ДЛИНА МАССИВА________________________________________________________________________________________________
//
//      Важнейшее свойство, которым обладают массивы, является свойство length, возвращающее длину массива,
//      то есть количество его элементов:
//
//          int[] nums = {1, 2, 3, 4, 5};
//          int length = nums.length;            // 5      Длина массива.
//
//      Нередко бывает неизвестным последний индекс, и чтобы получить последний элемент массива, мы можем
//      использовать это свойство:
//
//          int last = nums[nums.length-1];       // Получить последний индекс.
//_____________________________________________________________________________________________________________________
//______________________________ ДОПОЛНИТЕЛЬНЫЕ ФУНКЦИИ ДЛЯ РАБОТЫ С МАССИВАМИ ________________________________________
//  Для вызова необходимо импортировать - import java.util.Arrays
//
//  Копирование:
//  Arrays.copyOfRange(какой массив копируется, начальный индекс, конечный индекс)
//
//  Копирование и увеличение размера:
//  Arrays.copyOf(какой массив копируется, новый размер)
//
//  Заполнение:
//  Arrays.fill(какой массив заполняется, чем заполняется)
//
//  Сортировка:
//  Arrays.sort(какой массив сортируют)
//  Arrays.sort(какой массив сортируют, начальный индекс, конечный индекс)
//
//  Преобразование:
//  Arrays.toString(какой массив преобразутся)
//_____________________________________________________________________________________________________________________
//__________________ СПЕЦИАЛЬНЫЙ ВИД ЦИКЛА ДЛЯ РАБОТЫ С МАССИВАМИ _____________________________________________________
//  Цикл для прохода по элементам последовательности - foreach
//  Предназначен только для чтения элементов, поменять их он не может.
//
//  Объявление:
//  for( переменная: массив)        // Переменная принимает последовательно значение элементов массива.
//
//      int[] a = {0, 2, 5, 9 , 14};
//      for (int i: a) {                // Цикл foreach. Переменная i по очереди примет значения элементов массива.
//          System.out.print(i + " ");  // 0 2 5 9 14
//      }
//
//  Если в цикле изменить переменную цикла, то на данные массива это не повлияет!!!
//_____________________________________________________________________________________________________________________
//_________________________ ДВУХМЕРНЫЕ МАССИВЫ _________________________________________________________________________
//
//  Объявление:
//  Тип [][] имя = new Тип [строки][столбцы]
//
//  Инициализация:
//  int [][] a = {{1,2,3},{4,5,6},{7,8,9}}
//
//  Примером двухмерного массива является матрица (или морской бой).
//  Первый элемент это номер строки, второй элемент - номер столбца.
//
//________________ Пример объявления, заполнения и вывода на экран 2-х ммерного массива: ______________________________
//      int [][] b = new int[4][5];     // Объявление массива.
//      for(int i=0; i<b; i<b.length; i++){     // Цикл по строкам.
//          for(int j=0; j<b[0].length; j++){   // Цикл по столбцам.
//              b[i][j]=i+j;                    // Заполнение значениями.
//              System.out.print(b[i][j]+" ");  // Вывод на экран.
//          }
//       }
//
//  Количество строк в двумерном массиве - это его длинна
//_____________________________________________________________________________________________________________________
//__________________________ СОЗДАНИЕ "РВАНЫХ" МАССИВОВ _______________________________________________________________
//  При создании 2-х мерных массивов при создании достаточно объявить первый размер, а второй размер
//  объявить динамически.
//
//      int [][] b = new int [8][];
//      for(int i = 0; i<b.length; i++){
//          b[i] = new int[i];
//          for(int j=0; j<b[i].length; j++){
//              b[i][j]=i+j;
//              System.out.print(b[i][j]+"");
//           }
//           System.out.println();
//      }
//
//_____________________________________________________________________________________________________________________
//_________________________________________ СТРОКИ ____________________________________________________________________
//  Строки - это последовательность символов. Последовательность символов - это МАССИВ.
//
//  Объявление строк:
//  String имя = "Текст";
//
//  Конкатенация строк - объединение строк с помощью операции +. Каждая строка дописывается вправо.
//
//  Пример:
//  String s = "Java" + "the" + "best"
//
//  !!! Конкатенация строк возможна с числовыми типами переменных.
//
//__________________ МЕТОД SPLIT ДЛЯ РАБОТЫ СО СТРОКАМИ _______________________________________________________________
//
//  Используется для разбиения строки на части на основе разделителей. В результате получается массив строк.
//
//      String text = "123,345,657";            // Исходная строка.
//      String[] t = text.split("[,]");         // Разбиваем её на части на основе РАЗДЕЛИТЕЛЯ - ",".
//
//      for(String temp : t){
//          System.out.println(temp);           // Выводим получившийся массив на экран с помощью цикла for-each.
//      }

//_____________________________________________________________________________________________________________________
//
//package Exp;
//
//import java.util.Arrays;
//
//
//
//public class Java_Array {
//    public static void main(String[] args) {
//
//////_________________________________ КАК РАБОТАТЬ С ЭЛЕМЕНТАМИ МАССИВА _____________________________________________
//
//        int[] array1 = new int[]{ 7, -2, 5, 6};
//        System.out.println(array1);              // Вывод массива невозможен (array1 - ссылка на массив) // [I@1b28cdfa
//
////___________________________________ Для ВЫВОДА МАССИВА используется цикл FOR ______________________________________
//  Цикл проходит по индексам.
//        int[] array1 = new int[]{ 7, -2, 5, 6};
//        for (int i=0; i< array1.length; i++){
//            System.out.println(array1[i]);  // Вывод элементов массива.
//        }
//_____________________________________ ВЫВОД МАССИВА ЦИКЛОМ Foreach __________________________________________________
//  Цикл проходит по значениям.
//        int[] a = {0, 2, 5, 9 , 14};
//        for (int i: a) {                // Цикл foreach. Переменная i по очереди примет значения элементов массива.
//            System.out.print(i + " ");      // 0 2 5 9 14
//        }

////___________________________________ ИЗМЕНЕНИЕ МАССИВА И ЕГО ВЫВОД _________________________________________________
//        for (int i=0; i< array1.length; i++) {
//            array1[i] = array1[i] + 1;              // Изменение массива пошагово.
//        }
//        for (int i=0; i< array1.length; i++) {
//            System.out.println(array1[i]);  // Вывод ИЗМЕНЕННЫХ элементов массива.
//        }
//______________________________________ ВЫВОД МАССИВА В ВИДЕ СТРОКИ В [квадратных скобках] ___________________________

//        int[] array1 = new int[]{ 7, -2, 5, 6};
//        System.out.println("array1 = " + Arrays.toString(array1));       // array1 = [7, -2, 5, 6]

//______________________________________ КОПИРОВАНИЕ ДАННЫХ ИЗ ОДНОГО МАССИВА В ДРУГОЙ ________________________________
//  Arrays.copyOfRange(какой массив копируется, начальный индекс, конечный индекс).
//        int[] array1 = new int[]{ 7, -2, 5, 6};
//        int [] array2 = Arrays.copyOfRange(array1, 1, 4);
//        System.out.println("array2 = " + Arrays.toString(array2));      // array2 = [-2, 5, 6]

//______________________________________ СОРТИРОВКА МАССИВА ПО ВОЗРАСТАНИЮ ____________________________________________
//  Arrays.sort(какой массив сортируют).
//        int[] array1 = new int[]{ 7, -2, 5, 6};
//        Arrays.sort(array1);
//        System.out.println("array1 = " + Arrays.toString(array1));      // array1 = [-2, 5, 6, 7]

//_______________________________________ ЗАПОЛНЕНИЕ МАССИВА (одним и тем же значением) _______________________________
//  Arrays.fill(какой массив заполняется, чем заполняется);
//        int[] array3;
//        array3 = new int[4];
//        Arrays.fill(array3,7);
//        System.out.println("array3 = " + Arrays.toString(array3));     // array3 = [7, 7, 7, 7]

//_______________________________________ ВЫВОД МАССИВА циклом foreach ________________________________________________

//        int[] a = {0, 2, 5, 9 , 14};
//        for (int i: a) {                // Цикл foreach. Переменная i по очереди примет значения элементов массива.
//            System.out.print(i + " ");      // 0 2 5 9 14
//        }
//_____________________________________________________________________________________________________________________
//    Цикл for который сразу идет по значениям.
//        int[] array1 = new int[]{ 7, -2, 5, 6};
//        for (int element: array1){            // int - переменная цикла того же типа, как и тип данных который хранится в массиве.
//            System.out.println(element);           // element - имя.
//        }
//__________________________________________ ЗАДАЧА 1 _________________________________________________________________
//  Есть массив на 12 элементов.
//  Нужно заполнить эти элементы случайными числами от 20000 до 30000.
//  Вычислить среднемесячную зарплату сотрудника.

//        int[] money = new int[12];
//        for(int i = 0; i < money.length; i++){
//            money[i] = (int)(20000 + Math.random() * 10000);        // Вещественное число приведенное к "инту".
//        }
//        System.out.println(Arrays.toString(money));
//
////  Найти среднее число от общей суммы.
//        int sum = 0;        // Общая сумма.
//        for(int i = 0; i < money.length; i++){
//            sum = sum + money[i];
//        }
//        System.out.println("Average =" +sum/ money.length);
//_____________________________________________________________________________________________________________________
//______________________________________ ДВУХМЕРНЫЙ МАССИВ ____________________________________________________________
//        int [][] b = new int[4][5];
//        for(int i=0; i < b.length; i++){
//            for (int j = 0; j < b[0].length; j++){
//                b[i][j] = i + j;
//                System.out.print(b[i][j] + "");
//            }
//            System.out.println();
//        }
//_______________________________________ СОЗДАНИЕ "РВАНЫХ" МАССИВОВ __________________________________________________
//
//         int [][] b = new int [8][];
//         for(int i = 0; i<b.length; i++){
//             b[i] = new int[i];
//             for(int j=0; j<b[i].length; j++){
//                 b[i][j]=i+j;
//                 System.out.print(b[i][j]+" ");
//             }
//             System.out.println();                      // 1
//         }                                              // 2 3
//                                                        // 3 4 5
//                                                        // 4 5 6 7
//                                                        // 5 6 7 8 9
//                                                        // 6 7 8 9 10 11
//                                                        // 7 8 9 10 11 12 13
//_____________________________________________________________________________________________________________________
//__________________________________ СТРОКИ ___________________________________________________________________________
//_______________ ПРИМЕР РАБОТЫ СО СТРОКАМИ ___________________________________________________________________________

//        String text = "Hello";                      // Создаем строку.
//        String text1 = "World";                     // Создаём 2-ю строку.
//
//        char[] t = text.toCharArray();              // Получаем массив символов из строки.
//        System.out.println(Arrays.toString(t));     // [H, e, l, l, o]
//
//        char l = text.charAt(0);   // Получаем 0-символ из строки.
//        System.out.println(l);     // Вывод значения под нулевым индексом ("H").
//
//        System.out.println(text.equals(text1));     // Сравнение двух объектов.
//
//        int i = text.indexOf("ll");                 // Ищем строку "ll" в строке и получаем индекс.
//        System.out.println(i);
//
//        String subtext = text.substring(0,3);
//        System.out.println(subtext);

//__________________________ МЕТОД SPLIT ДЛЯ РАБОТЫ СО СТРОКАМИ _______________________________________________________
//
//  Используется для разбиения строки на части на основе разделителей. В результате получается массив строк.
//
//        String text = "123,345,657";                  // Исходная строка.
//        String[] t = text.split("[,]");         // Разбиваем её на части на основе РАЗДЕЛИТЕЛЯ - ",".
//
//        for(String temp : t){
//            System.out.println(temp);           // Выводим получившийся массив на экран с помощью цикла for-each.
//        }
//
//
//
//
//
//
//    }
//
//}
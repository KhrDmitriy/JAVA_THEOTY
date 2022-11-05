
//__________________________________ МЕТОДЫ (функции) _________________________________________________________________
//
//  МЕТОД - это именованный обособленный блок кода выполняющий последовательность каких либо операций.
//  Методы - это полные аналоги переменных.
//  Сигнатура метода – тип возвращаемого значения, название метода и список параметров.
//  В теле класса не может быть двух и более методов с одинаковой сигнатурой.
//_____________________________________________________________________________________________________________________
//__________________________________ ПРИМЕНЕНИЕ МЕТОДОВ _______________________________________________________________
//  * Когда нужно разбить задачу на более мелкие подзадачи.
//  * Когда нужно многократно провести один набор операций над исходными данными.
//  * Когда нужно написать и протестировать метод для дальнейшего использования в ваших проектах.
//_____________________________________________________________________________________________________________________
//__________________________________ ОБЪЯВЛЕНИЕ МЕТОДОВ В Java ________________________________________________________
//
//  Тип_возвращаемого_значения имя(тип параметр 1, тип параметр 2, ...){
//      Тело метода
//  }
//_____________________________________________________________________________________________________________________
//  Тип_возвращаемого_значения - любой тип переменных в Java, в теле метода обязательно должно
//                               быть ключевое слово RETURN после которого должна идти переменная
//                               или значение такого же типа.
//
//  !!! МЕТОД может и не возвращать значения, тогда его тип возвращаемого значения - void.
//
//  ИМЯ - имя метода придуманное пользователем (внимание слова зарезервированные в Java использовать нельзя).
//        Желательно что бы имя метода начиналось с маленькой буквы.
//
//  ПАРАМЕТР - любой тип переменных Java
//
//  ТЕЛО МЕТОДА - последовательность операций.
//_____________________________________________________________________________________________________________________
//___________________________________ ОБЪЯВЛЕНИЕ МЕТОДА _______________________________________________________________
//
//  !!! Методы пользовательские описываются в пределах класса , но за пределами главного метода !!!
//
//  Перед типом переменной нужно указать слово static - это только пока не начнёте использовать классы.
//  Методы объявляются вне главного метода, а используются внутри него.
//
//  ПРИМЕР объявления метода:
//      int sum(int a, int b){
//          return a + b;
//      }
//
//  int - Метод возвращает целочисленную переменную.
//  sum - Имя метода.
//  (int a, int b) - Два целочисленных значения - параметры.
//  return - Оператор вернёт целочисленное значение.
//
//  !!! Все переменные, которые объявлены в теле метода существуют только в теле метода.
//_____________________________________________________________________________________________________________________
//_____________________________________ ТРЕБОВАНИЯ К НАПИСАНИЮ МЕТОДОВ: _______________________________________________
//  *   Длинна любого метода не должно превышать 30 строк.
//  *   Метод должен выполнять только одно завершенное логическое действие.
//_____________________________________________________________________________________________________________________
//____________________________________ ПЕРЕДАЧА ПАРАМЕТРОВ В МЕТОДЫ ___________________________________________________
//  В Java все типы данных передаются по значению. Однако есть разница между примитивными и ссылочными типами данных.
//
//  Все примитивные типы передаются по значению (в Java)- т.е. при передаче создаётся локальная копия переменной
//  и в методе используется копия.
//  Т.е. при изменении значение переменной в методе в главном методе её значение не меняется.
//
//  Ссылочные типы также передаются по значению - однако это касается только ссылки (т.е. адресата ссылки
//  сменить нельзя), данные же на которые она ссылается изменить можно.
//
//_____________________ ПРИМЕР МЕТОДА С ПАРАМЕТРОМ ПРИМИТИВНОГО ТИПА __________________________________________________
//    public static void main(String[]args){
//        int a = 5;
//        int b = 3
//
//        System.out.println(a);
//        System.out.println(sum(a,b));
//        System.out.println(a);
//    }
//
//    static int sum(int a, int b){
//        a=a+3;
//        System.out.println(a);
//        return a+b;
//    }
////  !!!   И хотя в этом методе переменная а, меняется это не оказывает влияния на переменную а метода main.
//_____________________________________________________________________________________________________________________
// ______________________ ПРИМЕР МЕТОДА С ПАРАМЕТРОМ ССЫЛОЧНОГО ТИПА __________________________________________________
//    public static void main(String[]args){
//        int[] a = {1, 2, 3, 4, 5, 67, 8};
//        System.out.println(Arrays.toString(a));     // До вызова метода.
//        sum(a);
//        System.out.println(Arrays.toString(a));     // После вызова метода.
//    }
//
//    static void sum(int[] a){
//        a[3] = a[3]+3;
//        System.out.println(Arrays.toString(a));
//    }
////     !!! И хотя ссылка в методе не изменилась, данные по этой ссылке изменить можно.
////         Так по ссылке изменён 3 элемент массива.

//       !!! Значение ссылки поменять нельзя, а значение данных по этой ссылке поменять можно.
//_____________________________________________________________________________________________________________________
//
//
//
//
//
//
//
//






//_____________________________________________________________________________________________________________________
//package Theory_JAVA;
//
//public class Java_Methods {
//_____________________________________________________________________________________________________________________

//    public static void main(String[] args) {
//        Если в теле метода Main видим, какое-то имя, которое не является ключевым словом этого языка после
//        которого идут круглые скобки – это означает, что это вызов какого-то метода.
//
//        int a = 2;
//        int b = 5 + parabola(a);        // Вызов метода parabola. Параметр, который используется при вызове, в
//        // данном случае (a) называется - фактическим.
//        System.out.println(b);
//
//        long result = factorial(5);
//        System.out.println(result);
//
//        result = factorial(10);
//        System.out.println(result);
//
//        drawLine('*', b);
//    }
//_____________________________________________________________________________________________________________________

//    public static void drawLine(char l, int n){
//        for (int i = 0; i < n; i++){
//            System.out.print(l);
//        }
//        System.out.println();
//    }

//_____________________________________________________________________________________________________________________

//    public static int parabola(int x){
//        int result;
//        result=x * x + 5;
//        return result;
//    }

//_____________________________________________________________________________________________________________________
//    public static long factorial(int x){
//        long fact = 1L;
//        for(int i = 2; i <= x; i++){
//            fact = fact * i;
//        }
//        return fact;
//    }
//}
//_____________________________________________________________________________________________________________________
//_____________________________________________________________________________________________________________________
//  Написать метод, который вычислит и вернёт сумму элементов массива целых чисел.
//    public static void main(String[] args) {
//        int[] arr = new int[] {1, 2, 3};
//        System.out.println(sum(arr));
//    }
//    public static int sum (int[] array) {
//        int s = 0;
//        for (int i = 0; i < array.length; i ++){
//            s = s + array[i];
//        }
//        return s;
//    }
////_____________________________________________________________________________________________________________________
//
//
//
//}

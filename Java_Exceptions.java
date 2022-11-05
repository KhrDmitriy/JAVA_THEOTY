
//  Throwable (Бросаемый):
//                        1.1 Error (Ошибка):
//                                            1.1.1 ThreadDeath (Нить смерти).
//                                            1.1.2 Assertion Error (Ошибка утверждения).
//                                            1.1.3 VirtualMachineError (Ошибка виртуальной машины):
//                                                  1.1.3.1 Internal Error (Внутренняя ошибка).
//                                                  1.1.3.2 Unknown Error (Неизвестная ошибка).
//                                                  1.1.3.3 Out Of Memory Error (Ошибка нехватки памяти).
//                                                  1.1.3.4 Stack Overflow Error (Ошибка переполнения стека).
//
//                        1.2 Exceptions (Исключения): Проверяемые.
//                                            1.2.1 Runtime Exceptions (Исключения во время выполнения):
//                                                  1.2.1.1 Arithmetic Exception (Арифметическое исключение).
//                                                  1.2.1.2 Null Pointer Exception (Исключение нулевого указателя).
//                                            1.2.2 IO Exception (Исключение ввода-вывода):
//                                                  1.2.2.1 Object Stream Exception (Исключение потока объектов).
//                                                  1.2.2.2 Invalid Class Exception (Недопустимое исключение класса).
//                                                  1.2.2.3 Invalid Object Exception (Исключение недопустимого объекта).
//
//
//
//
//

//package Theory_JAVA;
//
//public class Java_Exceptions {
//    public static void main(String[] args) {
//        int nums[] = new int[4];    // Массив на 4 элемента
//
//        try {                       // Здесь мы будем проверять на переполнение массива.
//// Внутри блока try будет выполняться код в котором в дальнейшем ищем ошибку(catch).
//            System.out.println("Начало");
//            nums[7] = 10;           // Берем седьмой элемент которого нет и присваиваем ему значение 10.
//        }
//// В блок catch передаётся некий тип ошибки (название ошибки)
//        catch (ArrayIndexOutOfBoundsException exc){
////    ArrayIndexOutOfBoundsException - Выход за пределы массива.
//            System.out.println("О нет у нас ошибка");       // Если подобная ошибка найдётся.
//        }
////    ArithmeticException - Арифметическая ошибка (Например: при делении на 0).
//        catch (ArithmeticException exc){
//            System.out.println("О нет у нас ошибка");
//        }
//// ArrayStoreException - Возникает если пытаться ввести в массив элемент не совместимый с ним по типу.
//// ClassCastException - Недопустимое приведение типов данных.
//// IllegalArgumentException - недопустимый параметр при вызове метода.
//// NegativeArraySizeException
//// NullPointerException
//// TypeNotPresentException
//// UnsupportedOperationException
//// ClassNotFoundException
////
//
//
//
//    }
//}

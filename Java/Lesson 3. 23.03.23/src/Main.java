import java.util.Scanner;
/*План занятия
            ТЕМА - Взаимодействие с пользователем
        1) Повторить
        2) Консольный ввод в Java - класс Scanner
        3) Манипуляции с пользовательским вводом
        4) Переполнение типа
        5) (Усложненное) - глобальные и локальные переменные

        Доп задания (продвинутые)
        1) Перевести из двоичную системы в десятичную
        2) Перевести из десятичной системы в троичную
*/

/*
* Теория
*
* В Java новые блоки задаются фигурными скобками {}. Класс содержит в себе переменные и методы (public static void main(String[] args) {).
* Методов в классе может быть несколько. Как создать переменную, чтобы она была видна в нескольких методах?
* Если переменная декларирована в методе, то она называется локальной, и видна только в методе.
* Если переменная декларирована в классе, она назвается глобальной и видна всем методам этого класса.
* Если метод в своей сигнатуре имеет слово static, то он может вызывать только такие же методы со словом static и использовать
* только такие же переменные со словом static.
*
* -- Static-переменная находится в Metaspace в JVM. --
*
* Перед классом находится импорт библиотек, кот использует класс (import java.util.Scanner;)
*
* String в Java это исключение, т.е другие ссылочные типы создаются по конструкции:
* Тип название переменной = new Тип(); - Конструктор
*
* Scanner - (тут) это тип
*                           параметр
* Scanner sc = new Scanner(System.in);
*
* Scanner - это также и класс для чтения ввода из консоли.
* ______________________________________________________
* ---- Сборка таблиц ----
* System.out.printf("тип и кол-во символов выводимого значения", сами значения); - оператор форматированного вывода.
* \n - инструкция перейти на след строку
 */

/*
 * Заметки
 Main всегда статичесткий. Чтобы иметь доступ к глобальным переменным, мы должны объявлять их статическими.
 *
 * new в Scanner - выделение памяти под объект
 *
 * Static - указание на отношение к классу, а не к объекту
 */


public class Main { // С помощью Main создается точка входа
    static Scanner sc = new Scanner(System.in); // Создаем переменную sc типа Scanner для чтения вывода из консоли
    public static void main(String[] args) { // точка входа. Никогда не меняется название (сигнатура)
        byte b = 5;  // 00100101 -- максимальное значение - 11111111
        //При переполнении он записывает данные в 8 ячеек, и е сли оно не вмещается, система начинает дозаписывать остаток числа с первого
        //символа
        int i = 1000;

        //b = i; -- неявно преобразовать инт в байт нельзя, программа сравнимает объем "контейнеров" и большее в меньшее не впихивает
        b = (byte) i; // преобразование возможно, но ответственность за такое преобразование лежит на пользователе
        System.out.println(b);  // выведет результат -24 -- случай переполнения, когда число не влезло и пошло записываться в
        //отрицательный рейндж

        int d = 120;
        b = (byte)d; // тут все влезло

        // Тип можно переполнить и без преобразования:
        int a = 1000000000 + 2000000000; //  в int не вмещается 3000000000, поэтому происходит переполнение типа
        // и мы получаем отрицательное число
        System.out.println(a);

        //КАК ИЗБЕЖАТЬ ПЕРЕПОЛНЕНИЯ

        long l = 1000000000 + 2000000000; // В этом случае все равно будет отрицательное число, так как Java по умолчанию
        // складывает инты. Нам нужно показать, что это лонг - поставить l в конце каждого числа
        System.out.println(l);

        long l2 = 1000000000l + 2000000000l; // выделяем больше памяти для каждого числа
        System.out.println(l2);

        //____________________________________________________________________

//        System.out.println("Введите строку "); // Вывод приглашения вывести строку
//        String str = sc.nextLine(); // считывание строки
//        System.out.println("Вы ввели " + str); // Вывод введенной строки

//        System.out.println("Введите возраст ");
//        int age = sc.nextInt();
//        System.out.println("Возраст " + age);
        // Это выдаст ошибку, называемую "Трассировка стека" - указание, гда проблема - тут строка 73, ввели буквы вместо чисел

//        System.out.println("Введите вес: ");
//        float weight = sc.nextFloat();
//        System.out.println("Вес " + weight);
//
//        System.out.println("Введите ваш пол ");
//        char gender = sc.next().charAt(0);
//        System.out.println("Ваш пол: " + gender);

//        System.out.println("Введите дату рождения ");
//        String str = sc.next();
//        System.out.println("Дата рождения: " + str);

        // КАК СОБРАТЬ ТАБЛИЧКУ  (ascii-table)
//        System.out.println("Введите возраст ");
//        short age = sc.nextShort();  // вывести первое слово
//        System.out.println("Введите вес ");
//        float weight = sc.nextFloat();
//        System.out.println("Введите имя: ");
//        String name = sc.next();
//        System.out.println("|------|------|------|");
//        System.out.println("|---Имя---|---Вес---|-Возраст-|");
//        System.out.println("|-" + name+"-|---" + weight + "---|---" + age + "---|");
//        System.out.println("|------|------|------|");

        //__________________________________________________________________

//        System.out.println("Таблица, созданная форматированием:");
//        System.out.println("|---------|---------|--------|");
//        System.out.println("|---Имя---|--Вес--|--Возраст--|");
//        System.out.printf("|%10s| %6.2f| %8d|\n", name, weight, age); // %s - хотим вывести строку, %f - для числа с плавающей точкой,
//        // %d - вывесли целое число //%20s выделяет на имя заданное кол-во символов
//        //%5.2f - позволяет округлить дробные части до 2 знаков
//        System.out.println("|---------|---------|--------|");

        // Задача: Сделать расписание: Дисциплина, продолжительность занятия, преподаватель, стоимость

        System.out.println("Введите Дисциплину: ");
        String subj = sc.next();
        System.out.println("Введите Преподавателя: ");
        String teacher = sc.next();
        System.out.println("Введите Продолжительность занятия: ");
        short time = sc.nextShort();
        System.out.println("Введите стоимость ");
        int price = sc.nextInt();

        // РЕШЕНИЕ ЗАДАЧИ С ПОМОЩЬЮ PRINTLN
//        System.out.println("|----------|-----------------|----------------|--------|");
//        System.out.println("|---Урок---|--Преподаватель--|--Длительность--|--Цена--|");
//        System.out.printf("|%10s| %16s| %14d |%8s|\n", subj, teacher, time, price); // %s - хотим вывести строку, %f - для числа с плавающей точкой,
//        // %d - вывесли целое число //%20s выделяет на имя заданное кол-во символов
//        //%5.2f - позволяет округлить дробные части до 2 знаков
//        System.out.println("|----------|-----------------|----------------|--------|");

        // РЕШЕНИЕ ЗАДАЧИ С ПОМОЩЬЮ PRINTF
        System.out.println("|----------|-----------------|----------------|--------|");
        System.out.println("|---Урок---|--Преподаватель--|--Длительность--|--Цена--|");
        System.out.println("|---" + subj + "---|" +"----" + teacher + "----|------" + time + "---------|---" + price + "--|");
        System.out.println("|----------|-----------------|----------------|--------|");

/*
* ДЗ:
* 1) Декларировать все примитивные типы как глобальные переменные и как локальные переменные
* 2) Считать из консоли каждый примитивный тип и присвоить его переменной
* 3) Вывести все типы в таблицу при помощи принтлн и принтф
* */


    }
}
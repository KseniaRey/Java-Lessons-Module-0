/*
 * План занятия:
 * 1) Знакомство с программой
 * 2) Структура программы Java
 * 3) Структура проекта Idea
 * 4) Простейшая программа на Java
 * */
/*
* Теория
* //что написано однажды, работает всегда//
* Любая Java-программа находится в классе. Код класса должен находиться в файле с таким же
* названием, что и файл и расширением java.
* После компиляции* (Компиляция - перевод с языка высокого уровня на язык процессора - в команды компьютера) Java файл с кодом
* преобразуется в файл с расширением class. Этот файл содержит байт-код, пригодный для исполнения JVM.
*   JVM - принимает файл с расширением java, компиллирует его и выдает файл с расширением class. Этот класс пригоден для
*   исполнения JVM (JavaVirtualMachine). JVM исполняет файл и переводит его на язык процессора, таким образом достигается
*   возможность исполнить код Java на абсолютно любом компьютере. (находит общий язык с ОС - Windows, Mac, Linux, Android
*   при условии, что у них есть специальный драйвер)
*
* Точка входа - место, с которого начинается исполнение программы. В Java точкой входа является метод main(), чтобы
* быстро его сгенерировать в Idea достаточно ввести в теле класса psvm и выбрать метод main.
*
* Чтобы вывести что-либо в консоль на Java сущ операторы System.out.print(), System.out.println(),
* System.out.printf()
*
* В Java в отличие от JS строгая статическая типизация, т.е объявляя переменную, мы сразу должны указать на ее тип и в дальнейшем
* мы не можем его изменить.
*
*   Примитивные типы переменных (указание на способ адрессации) - типы с заранее установленным кол-вом памяти, значение
* которых хранится в самой переменной типа
*   Ссылочный тип переменных - хранит ссылку (адрес в оперативной памяти) на объект
* ___________________________________
* В Java 8 примитивных типов переменных - выучить! :
* byte - 8 бит памяти (1 байт)      - Целочисленный тип
* short - 16 бит                    - Целочисленный тип
* int - 32 бита                     - Целочисленный тип
* long - 64 бита                    - Целочисленный тип
* float - 32 бита                   - Число с плавающей точкой - вещественное
* double - 64 бита                  - Число с плавающей точкой - вещественное
* char - 32 бита                    - Символьный тип
* boolean - 32 бита                 - Логический тип
* ________________________________________
*
* Для вывода переменной нужно по аналогии с литералом указать ее в операторе System.out.println()
* Для операций над переменными можно использовать операторы + - *(умножить) /(разделить) ==(логическое сравнение),
* != (отрицание - 2 != 5 - два не равно 5, true)
*
* */
/*
 * Заметки
 * Попробовать написать свой компиллятор - оч полезное упражнение
 * Компиллятор(уровни, как работает компьютер. Компиляция, по сути, процесс сверху вниз):
 * Пользователь - уровень, на кот человек взаимодействует с машиной
 * Операционная система - программа, отвечающая за взаимодействие компа и пользователя.
 * Ассемблер - тут: программа, а не язык, связующее звено между языком процессора и языком программирования высокого уровня (Java)
 * Макроархитектура - Набор команд, которые может выполнить компьютер (Операции с данными, и т.д)
 * Микроархитектура - Физическое устройство компьютера (Расположение вычислительных блоков на плате процессора)
 * Алу - арифметическо-логическое устройство (Расчеты над данными - нулями и единицами)
 *
 * Телом в программировании называется блок кода внутри фигурных скобок - {}
 * Сигнатура метода - первая строчка, название и сопутствующее пояснение к нему
 *
 * Литералы - непосредственно, само значение, например, "Hello, World";
 * Переменная - именнованная область памяти, которая может хранить различные значения (литералы)
 *
 * ______________________________________________________
 *  Для отображения отрицательных чисел выделяется 1 знаковый бит
 * ________________________________________________________
 * Точка указывает на дробную часть
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        byte b = 25;  // объявляем переменную типа byte с именем b
        short c = 1575;
        int d = 1000000;
        long f = 10000000000l; // буква в конце указывает на то, что у нас переменная типа long, а не int
        float l = 25.35f;
        double a = 2.375;
        char u = 'd';  // цифра или символ указывается в одинарных кавычках. Строка - это набор вот этих чаров
        boolean z = true;

        System.out.println(b);
        System.out.print(c);
        System.out.print(d+c);
        System.out.println(b);
        b = (byte) (b + 5); // - ? Операция сложения в Java. По умолчанию он приводит все к инту - как пример нижние строки, там
        //переменная типа инт, следовательно, мы не указываем тип при сложении
        d = 10 + 15;
        System.out.println(d);

        l = (float) (l +10);
        System.out.println(l);

        // Java воспринимает целые числа как инты, а дробные как даблы

        z = false; // изменение значения булевой переменной z
        System.out.println(z);

        System.out.println(2 != 5); // 2 не равно 5, true
    }
}
/*
План занятия
1. Знакомство с классами
2. Знакомство с методами
 */

/*
 * Теория
 * Чтобы создать объект класса (переменную), нужно воспользоваться следующей конструкцией:
 * Book book = new Book(параметры);
 * Сначала указываем класс, потом название переменной, равно, new (new выделяет память) и конструктор
 * ________________________________________________________
 * Метод - часть программы, имеющий свои границы и выполняющий 1 задачу. Чтобы воспользоваться методом, нужно указать его
 * название.
 * В Java можно выделить 3 типа методов:
 * Конструкторы - методы, создающие объект;
 * Процедуры - методы, имеющие в сигнатуре слово void, ничего не возвращающие;
 * Функции - методы, имеющие в сигнатура вместо слова void имеют возвращаемый тип,
 * например:
 *
 * public static int sum(int a, int b) { \\ значение типа int, его название sum
 * return a+b;
 * }  --> такой метод должен вернуть в точку вызова значение указанного в его сигнатуре типа, при помощи return.
 *
 * __________________________________==================================____________________________________
 *                                              КЛАСС Math
 * __________________________________==================================____________________________________
 * Класс Math в Java служет для выполнения математических операций.
 * Методы можно вызывать внутри класса, в кот они определены. Для этого нужно указать имя метода. Можно вызывать
 * через объект (сначала его создать) и, поставив точку, указать имя метода. И можно вызывать через класс,
 * для этого метод должен быть стратическим(static).
 *              Например:
 *              Book book = new Book("История о схождении в ад", "Божественная комедия", "Данте Алигьери",
                "эпос", 500); // создание объекта класса Book
                book.out(); // вызов метода через объект
                *
                * Math.pow(2,2)
 */
 /*
 * Заметки
 * Переменные и методы называем с маленькой буквы, классы - с большой
 *  **РАСШИФРОВКА СИГНАТУРЫ МЕТОДА**
 * public void
 */
public class Test { // это главная часть программы, точка входа, запуск всегда будет происходить из нее
    public static void main(String[] args) {
        Book book = new Book("История о схождении в ад", "Божественная комедия", "Данте Алигьери",
                "эпос", 500); // создание объекта класса Book
        book.out(); // вызов метода объекта
        sayHello(); // вывод метода

        //___________________________________

        int a = 2;
        int b = 3;
        int sum = sum(a, b);
        System.out.println(sum);
        System.out.println(sub(10,3));
        System.out.println(div(10,3)); // вызов метода деления
        System.out.println(mul(20, 15)); // вызов метода умножения

        //___________________________________
        System.out.println(Math.pow(2, 3));
        System.out.println(absolute(-30));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(4));
        System.out.println(randomInRange(5, 12));
    }

    public static int sum(int a, int b) { // создаем ф-ю, кот возвращает сумму двух чисел типа int
        return a + b;
    }
    public static int sub(int a, int b){ //создаем ф-ю типа int, кот возвращает разность двух чисел
        return a - b;
    }
    public static void sayHello() { // создание метода, которые ничего не возвращают (процедуры)
        System.out.println("Hello");
    }
    public static float div(int c, int d){ // метод деления.
        return (float)  c/d; // тут необходимо выполнить приведение, так как в строке выше метод принимает инты, инты и делит.
    }
    public static double mul(double s, double z){
        return s*z;
    }

    public static int absolute(int num){ // тут прямо в методе говорим, что нужно вернуть. Также можно написать Math и в выводе в консоль
        return Math.abs(num);
    }

    public static double sqr(double x, double y){
        return Math.sqrt(x);
    }
//________________________________________________________________________

    /**
     * Метод для генерации числа в диапазоне. Для понимания попробовать руками просчитать, какие числа он может вернуть:
     * @param min начало диапазона
     * @param max конец диапазона
     * @return само число в диапазоне
     */
    public static int randomInRange(int min, int max){
        return (int) (Math.random() * ((max - min) + 1)) + min; // с пом + min получим минимум 3
    }               //возьми рандомное число, умножь его на разницу максимального и минимального ренжа(прописываем в выводе)
    // и добавь минимальное значение, чтобы получилось минимум 3

   

}
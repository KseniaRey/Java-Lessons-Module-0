import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    /*Теория
    * Условный оператор - способ указать действия в зависимости от условия(ветвление):
    * else-if
    * switch - case
    * Цикл:
    * for()
    * while
    * do-while
    * Если в языке есть условные операторы и циклы, этот язык является языком программирования (алгоритмический язык
    * программирования - АЯП). Циклы и условные операторы являются необходимым условием для полноты по Тьюрингу,
    * т.е на таком языке возможно выполнять любые вычисления.
    *
    * Метод - часть программы, которая имеет свои границы и выполняет, как правило, только одну задачу. Чтобы вызвать
    * метод, нужно взять его название.
    * Антипаттерн - "Божественный(всемогущий) метод" - метод, выполняющий больше 1 задачи. Так делать нельзя.
    * Правило: один метод выполняет 1 задачу - отсылка к принципу SOLID(ПОЧИТАТЬ!).
    *
    * Полиморфизм - одно действие, используемое в разных методах
    *
    * Класс - шаблон(тип) для описания объектов какой-либо сущности. Эти описания могут иметь данные и методы(операции над
    * данными)
    *
    * Архитектура Фон Неймана - подразумевает использование данных и команд в одной форме в одной области памяти. Таким
    * образом можно кодировать  данные и команды не различая их для компьютера - можно в тип(класс) добавить не только
    * данные для этого типа, но и операции над этим типом(ПОЧИТАТЬ!)
    *
    * Объект - экземпляр класса. Область памяти, которая содержит переменные, объявленные в классе (поля класса)
    * Разница между классом и объектом:
    * Объект - конкретный представитель класса.
    * Пример:
    * Есть класс человек, тогда читатель этого предложения является объектом этого класса, также как и автор этого
    * предложения является другим объектом этого класса. Класс для них общий, а объекты разные.
    *
    * В Java есть примитивные типы:
    * byte, -- 8 бит -- от -128 до 127
    * short, -- 16 бит -- от -32768 до 32767
    * int, -- 32 бит -- от -2147483648 до 2147483647
    * long, -- 64 бит -- от -9223372036854775808L до 9223372036854775807L
    * char, -- 16 бит -- беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)
    * float, -- 32 бит -- от 1.4e-45f до 3.4e+38f
    * double, -- 64 бит -- от 4.9e-324 до 1.7e+308
    * boolean  --> 8 в массивах, 32 не в массивах
    *
    * Ссылочные типы -- в отличие от примитивных хранит не значение переменной, а ссылку в область памяти (кучу),
    * в кот она хранится. Как правило, переменные в Java являются ссылочными. При работе с объектами мы всегда
    * работаем с ссылочными типами, то есть, в переменных объекта хранится ссылка на него.
    *
    * Три основных области памяти JVM:
    * Стеки -- управление программой(примитивные данные, вызовы функций, и так далее)
    * Куча -- объекты
    * Метаспейс -- классы
    *
    * Работа со строками:
    * В Java есть 3 класса для работы со строками:
    * String, -- заменяет строку, immutable, можно использовать и в однопоточном и многопоточном, неизменяемый
    * StringBuilder, -- изменяемый класс и непотокобезопастный (unsynchronized)
    * StringBuffer, -- изменяемый класс и потокобезопасный (synchronized)
    * Строка = набо чаров
    *
    * Массив(Array) -- структура данных для одного типа, которая подразумевает выделение сплошной области памяти
    * и последовательное расположение элементов в этой памяти.
    *
    * Связанные списки (ПОЧИТАТЬ) - каждый элемент в одной записи имеет сам элемент и ссылку на след элемент. Удобнее массивов
    * с точки зрения удаления и добавление, но неудобнее с точки зрения доступа к конкретному элементу. Для
    * этого придется пройти весь список сначала и пройтись по всем ссылкам.
    *
    * !!!ПОЧИТАТЬ!!! В Java существуют коллекции - набор классов для реализации классических структур данных и алгоритмов, в
    *
    *
    * Низкоуровневый язык программирования -- ЯП, не имеющий компиллятора.
    *
    * Хэш - ф-я, возвращающая численное представление -- жрет память*/

    public static void main(String[] args) {
//        System.out.println("Hello world!");           Пример низкоуровневой работы с массивом
//        int[] arr = new int[10];
//        for (int i = 0; i < 11; i++) {
//            arr[i] = i;
//        }
//        arr[5] = 1;

        ArrayList<Integer> arrayList = new ArrayList<>();       // Высокоуровневое создание массива
        for (int i = 0; i < 10; i++){                           // Не нужно выделять память, сам подстроится автоматически
            arrayList.add(i);
            System.out.println(arrayList.get(i));
        }
        LinkedList<Integer> LinkesList = new LinkedList<>();
        // Написать свои классы для работы с линкед лист, аррей лист, хеш и тд. Для всего, в чем нужно подробно разобраться
    }
}
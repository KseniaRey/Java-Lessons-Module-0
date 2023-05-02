public class Main {

    /*
    План занятия:
    * 1. Классы
    * 2. Класс Object
    * 3. Массивы
    * 4. Повторение*/

    /*
    Теория
    * ООП - объектно-ориентированное программирование - самая популярная и мощная из всех
    парадигм программирования. Парадигм (комплекс представлений о чем-то) существует множество.
    ООП подразумевает наличие типа(класса), на основе которго по шаблону мы решаем задачи. В типе могут храниться
    данные, например, возраст, рост, вес, и тд, а также операции, например: вывод данных на консоль, изменение данных и тд.
    В ООП существует 4 основных приема (принципа):
    инкапсуляция, --> изоляция данных внутри класса;
    полиморфизм, --> многоформие, возможность создавать методы с одинаковыми названиями, но разными параметрами,
    чтобы решать похожих, но не идентичных задач;
    наследование, --> возможность передать свойство класса от родительского элемента дочернему.
    абстракция --> (от латинского - экстракт - выжимка, абстракт - что-то обратное, расширение) способ представления
    в коде объектоа реального мира. Например, у человека существует много параметров и функций, но в нашей программе
    нужны только 3 его параметра и 1 функция: вес, имя, рост и хождение, поэтому мы абстрактно запрограмируем человека
    только с этим набором атрибутов.

    //--------------------------_________________________________________---------------------------------
                                               Класс Object
    //--------------------------_________________________________________---------------------------------
    Вопрос на собеседовании - зачем нужен класс обдж?
    Для наследования. Любой класс, кот мы создаем, наследуется от класс Object. ВВ этом классе есть набор опций,
    кот может исп для наследования. Класс обж - неявный потомок

    В Java существует класс Object --> класс, кот является родителем для всех Java-классов. Таким образом, разработчики
    языка гарантировали наличие определенного функционала у любого программиста
                --> В коде нет необходимости указывать наследование от класса Object, любой класс по умолчанию
                является его потомком, и изменить это нельзя.

    Если возникает ситуация, когда мы получили метод по наследству, на нам нужно изменить его поведение, в таком случае
    в своем классе нужно просто написать имя метода и требуемый функционал. Для нашего класса поведение метода
    изменится. Это называется ПЕРЕОПРЕДЕЛЕНИЕМ.
    ПЕРЕОПРЕДЕЛЕННЫЕ МЕТОДЫ принято помечать аннотацией @Override. На данный момент можно рассматривать их как
    комментарий, указывающий на то, что метод был переопределен.

        //--------------------------_________________________________________---------------------------------
                 Что делать, если в массиве выпадаем за границы памяти? (больше эл чем есть памяти)
        //--------------------------_________________________________________---------------------------------
        Реализация выделения динамической памяти.
    Не менее 5 циклов перезаписи, чтобы гарантировать полное уничтожение информации из памяти.
    Стирание - Стирание данных и перезаписывание ячеек памяти, в кот они лежали.
    Удаление - удаление якорных точек в памяти, которые резервируют память под данные. При этом сама инфа остается,
    просто система понимает, что эти ячейки памяти потенциально свободные. Такие данные можно вытащить.

    * */

    /*
    Заметки
    @Deprecated --> метка, означающая "не рекомендуется к использованию".
    *
    * */

    /*Продвинутые задачи:
    * 1. Сделать свою реализацию методов ArrayList - динамическое выделение памяти*/


    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*Разработать класс для управления массивом. Реализовать методы удаления, вставки, сортировки и поиска по массиву
        *
        * Решение: создадим класс
        * создадим массив из 10 элементов
        * создадим переменную для счета уже добавленных элементов*/

        /**
         * создание объекта ArrayWorking
         */

        ArrayWorking array = new ArrayWorking(); // если не определен конструктор в классе, то Java вызовет пустой конструктор
        array.insert(1);
        array.insert(2);
        array.insert(3);
        System.out.println(array.toString());
        array.delete(1);
        System.out.println(array.toString());

        System.out.println(array.find(3));
        array.sort();
        System.out.println(array.toString());

        System.out.println("Массив после удаления");
        array.clear();
        System.out.println(array.toString());

        System.out.println("Массив после взлома");
        array.hack();
        System.out.println(array.toString());

        System.out.println("Массив после стирания");
        array.erase();
        System.out.println(array.toString());


    }
}
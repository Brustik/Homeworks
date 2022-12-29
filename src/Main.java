import ObjectsAndClass.Author;
import ObjectsAndClass.Book;

public class Main {
    //        Задание
//        Напишите небольшой библиотечный справочник, где хранится информация о книгах.
//
//        Рекомендуем создать отдельный класс, например с именем Main или App — в нем объявить метод main и в нем протестировать работу вашего кода.
//
//        Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги. Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
//                Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
//                Напишите конструкторы для обоих классов, заполняющие все поля.
//        Создайте геттеры для всех полей автора и всех полей книги.
//        Создайте сеттер для поля «Год публикации» у книги.
//        В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
//        Метод main не должен находиться в классах Book и Author.
//
//        Создайте отдельный класс для запуска приложения и объявите метод main в нем.
//
//        В том же методе main измените год публикации одной из книг с помощью сеттера.
//        Так как вы изучили геттеры и сеттеры, оставлять поля открытыми, без модификатора доступа private, недопустимо.
    public static void main(String[] args) {

        Author murakami = new Author("Харуки", "Мураками");
        Author pavic = new Author("Милорад", "Павич");

        Book khazarDictionary = new Book(pavic, "Хазарский словарь", 1984);
        Book pinball = new Book(murakami, "Пинбол", 1973);

        System.out.println("murakami.getNameAuthor() = " + murakami.getNameAuthor());
        System.out.println("murakami.getSurnameAuthor() = " + murakami.getSurnameAuthor());
        System.out.println("pinball.getTitle() = " + pinball.getTitle());
        System.out.println("pinball.getYearPublication() = " + pinball.getYearPublication());
        System.out.println("pavic.getNameAuthor() = " + pavic.getNameAuthor());
        System.out.println("pavic.getSurnameAuthor() = " + pavic.getSurnameAuthor());
        System.out.println("khazarDictionary.getTitle() = " + khazarDictionary.getTitle());
        System.out.println("khazarDictionary.getYearPublication() = " + khazarDictionary.getYearPublication());

        pinball.setYearPublication(1974);
        System.out.println("pinball.getYearPublication() = " + pinball.getYearPublication());


    }
}
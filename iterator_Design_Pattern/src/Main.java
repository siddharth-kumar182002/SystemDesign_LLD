import aggregate.Library;
import items.Book;
import iterator.Iterator;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
List<Book> booksList = Arrays.asList(
        new Book(100,"Science"),
        new Book(200,"Maths"),
        new Book(300,"Biology"),
        new Book(400,"Physics")
);

Library lib = new Library(booksList);
        Iterator iterator =lib.createIterator();

        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
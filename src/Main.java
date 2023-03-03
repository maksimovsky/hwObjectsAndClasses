public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author bulgakov = new Author("Михаил", "Булгаков");

        Book onegin = new Book("Евгений Онегин", pushkin, 1833);
        Book masterIMargarita = new Book("Мастер и Маргарита", bulgakov, 1928);

        System.out.println(onegin);
        System.out.println(masterIMargarita);

        masterIMargarita.setPublishingYear(1940);

        System.out.println(masterIMargarita);

        //////////////////////////////////////////////////////////

        System.out.println("\nЗадача среднего уровня");

        Book[] arr = new Book[10];

        arr[0] = onegin;
        arr[1] = masterIMargarita;

        Book capitanskayaDochka = new Book("Капитанская дочка", pushkin, 1836);
        Book borisGodunov = new Book("Борис Годунов", pushkin, 1824);
        Book sobacheSerdce = new Book("Собачье сердце", bulgakov, 1925);

        addBookToArray(arr, capitanskayaDochka);
        addBookToArray(arr, borisGodunov);
        addBookToArray(arr, sobacheSerdce);

        printBookArray(arr);


        //////////////////////////////////////////////////////////

        System.out.println("\nЗадача сложного уровня");
        Library library = new Library(10);

        Author dostoevsky = new Author("Федор", "Достоевский");
        Book prestINakaz = new Book("Преступление и наказание", dostoevsky, 1866);

        library.addBookToLibrary(onegin);
        library.addBookToLibrary(masterIMargarita);
        library.addBookToLibrary(capitanskayaDochka);
        library.addBookToLibrary(borisGodunov);
        library.addBookToLibrary(sobacheSerdce);
        library.addBookToLibrary(prestINakaz);
        library.printInfoByTitle("Преступление и наказание");

        library.changePublishingYearByTitle("Преступление и наказание", 1871);

        System.out.println();
        System.out.println(library);
    }

    // Для задачи среднего уровня
    public static void addBookToArray(Book[] arr, Book book) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = book;
                break;
            } else if (i == arr.length - 1) {
                System.out.println("\nМесто в массиве кончилось!\n");
            }
        }
    }

    public static void printBookArray(Book[] arr) {
        for (Book book : arr) {
            if (book != null) {
                System.out.println(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() +
                        ": " + book.getTitle() + ": " + book.getPublishingYear());
            }
        }
    }
}

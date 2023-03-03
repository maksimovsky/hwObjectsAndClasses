import java.util.Arrays;

public class Library {
    private final Book[] arr;

    public Library(int arraySize) {
        this.arr = new Book[arraySize];
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("Library:\n");
        for (int i = 0; i < arr.length && arr[i] != null; i++) {
            out.append(arr[i].toString()).append("\n");
        }
        return out.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(arr, library.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    public void addBookToLibrary(Book book) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = book;
                break;
            } else if (i == arr.length - 1) {
                System.out.println("\nМесто в библиотеке кончилось!\n");
            }
        }
    }

    public void printInfoByTitle(String title) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && title.equals(arr[i].getTitle())) {
                System.out.println("Книга " + arr[i].getTitle() +
                        " автора " + arr[i].getAuthor().getFirstName() + " " + arr[i].getAuthor().getLastName() +
                        " опубликована в " + arr[i].getPublishingYear() + " году");
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Такой книги не найдено! Либо проверьте правильность написания");
            }
        }
    }

    public void changePublishingYearByTitle(String title, int year) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && title.equals(arr[i].getTitle())) {
                arr[i].setPublishingYear(year);
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Такой книги не найдено! Либо проверьте правильность написания");
            }
        }
    }
}


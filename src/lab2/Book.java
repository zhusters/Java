package lab2;


import java.util.Scanner;

public class Book {


    private String author;
    private int year;
    private int pages;
    private static int size;
    private static Book arr[];

    public Book() {
    }

    public Book(String author, int year, int pages) {
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public void setAuthor() {
        System.out.println("введите имя автора - ");
        Scanner sc = new Scanner(System.in);
        author = sc.nextLine();
    }

    public void setPages() {
        System.out.println("введите кол во страниц - ");
        Scanner sc = new Scanner(System.in);
        pages = sc.nextInt();
    }

    public void setYear() {
        System.out.println("введите год публикации - ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public static void ShowInfoByAuthor(Book author) {
        System.out.println(author.getAuthor());
        System.out.println(author.getYear());
        System.out.println(author.getPages());
    }

    public static void Author(int a, String b, Book c) {
        System.out.println("Измениние автора - ");
        c.author = b;
    }

    public static void Pages(int a, Book c) {
        System.out.println("Измениние страниц - ");
        c.pages = a;
    }

    public static void Year(int a, Book c) {
        System.out.println("Измениние года - ");
        c.year = a;
    }

    public static void Author(Book b) {
        System.out.println("введите автора - ");
        Scanner sc = new Scanner(System.in);
        b.author = sc.nextLine();

    }

    public static void Pages(Book c) {
        System.out.println("введите страницы - ");
        Scanner sc = new Scanner(System.in);
        c.pages = sc.nextInt();
    }

    public static void Year(Book c) {
        System.out.println("введите год - ");
        Scanner sc = new Scanner(System.in);
        c.year = sc.nextInt();
    }

    public static void CreateBook(Book a) {
        a.setAuthor();
        a.setPages();
        a.setYear();
    }

    public static void CreateArr() {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите кол во книг - ");
        size = sc.nextInt();
        arr = new Book[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Book();
            CreateBook(arr[i]);
        }
    }

    public static void Find(String b, Book arr[]) {

        System.out.println("Поиск книги по названию:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].author.equals(b)) {
                System.out.println( arr[i].year);
                System.out.println( arr[i].pages);
                System.out.println( arr[i].author);
            }

        }

    }


}

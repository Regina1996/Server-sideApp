public class testBook {
    private static testBook tc;
    private Book[] bookArray = new Book[3];

    public static void  main(String[] args){

        testBook tb = new testBook();

        tb.bookArray[0]  = new Book(001,
                "Война и мир",
                "Толстой Л.Н",
                "Типография Т.Рысъ",
                1869,
                1300,
                5000,
                "твердый");
        tb.bookArray[1]  = new Book(002,
                "Идиот",
                "Достоевский Ф.М",
                "ACT",
                2015,
                640,
                4500,
                "Мякгий");
        tb.bookArray[2]  = new Book(003,
                "Мастер и Маргарита",
                "Булгаков М.А",
                "Азбука",
                1966,
                416,
                2300,
                "КШС");

        System.out.println("Заданный автор");
        tb.getBookAuthor("Булгаков М.А");

        System.out.println("Заданный издатель");
        tb.getBookPublish("Азбука");

        System.out.println("Книги после заданного года");
        tb.getBookYear(1869);

    }


    private void getBookAuthor(String avthors){
        for (Book Book:bookArray) {
            if (Book.getAvthor() == avthors)
                System.out.println(avthors);

        }

    }
    private void getBookPublish(String publish){
        for (Book Book:bookArray){
            if (Book.getPublish() == publish)
                System.out.println(publish);
        }
    }
    private void getBookYear(int year){
        for (Book Book:bookArray){
            if(Book.getYear() >= year)
                System.out.println(year);
        }
    }
}

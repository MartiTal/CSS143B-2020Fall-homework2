package Problem3;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        // homework
        // tip: use the 'super' keyword
        super(title, author);
        this.genres = genres;
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        // homework
        // tip: use the 'super' keyword
        super(anotherBook);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        int fees = numOfDaysPastDue * lateFeePerDayInDollar;
        if (fees > 0) {
            return fees;
        } else {
            return 0;
        }
    }
}

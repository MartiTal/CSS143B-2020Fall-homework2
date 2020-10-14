package Problem3;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieComedy(MovieComedy anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super(anotherMovie);
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

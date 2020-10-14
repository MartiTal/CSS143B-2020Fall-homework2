package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
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
        if (numOfDaysPastDue < 5) {
            fees = (numOfDaysPastDue * lateFeePerDayInDollar);
        } else {
            fees = 2 * (numOfDaysPastDue * lateFeePerDayInDollar);
        }
        if (fees > 0) {
            return fees;
        } else {
            return 0;
        }
    }
}

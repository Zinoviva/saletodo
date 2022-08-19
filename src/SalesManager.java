public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        int max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = 0;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    //Способ получения среднего значения
    public double avgExcludingMinMax() {
        int max = sales[0];
        int min = sales[0];
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            if (sales[i] > max) {
                max = sales[i];
            }
            if (sales[i] < min) {
                min = sales[i];
            }
        }
        double total = ((sum - max - min) / (sales.length - 2));

        return total;
    }

}
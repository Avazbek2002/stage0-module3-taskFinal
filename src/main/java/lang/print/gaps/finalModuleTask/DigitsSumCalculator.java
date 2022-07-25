package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        System.out.println((number % 10) + ((number % 100) - number % 10)/10 + ((number % 1000) - number % 100)/100 + number / 1000);
    }

}

public class MathOperations {

    double firstDouble;
    double secondDouble;

    public MathOperations(double firstDouble, double secondDouble) {
        this.firstDouble = firstDouble;
        this.secondDouble = secondDouble;
    }
// Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,
    void mathOperationsOnDoubles(){
        System.out.println("Addition is equal to:" + (firstDouble + secondDouble));
        System.out.println("Subtraction is equal to:" + (firstDouble - secondDouble));
        System.out.println("Multiplication is equal to:" + (firstDouble / secondDouble));
    }
}

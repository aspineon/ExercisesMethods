public class IsEven {

    int number;

    public IsEven(int number) {
        this.number = number;
    }
// Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta
    boolean checkIfItsEven(){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

}

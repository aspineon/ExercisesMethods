public class Division {

    int number;

    public Division(int number) {
        this.number = number;
    }
// Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5
    boolean division(){
        if (number % 3 == 0 && number % 5 == 0){
            return true;
        } else {
            return false;
        }
    }

}

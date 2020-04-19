public class PythagoreanTheorem {

    double legA;
    double legB;
    double hypotenuse;

    public PythagoreanTheorem(double legA, double legB, double hypotenuse) {
        this.legA = legA;
        this.legB = legB;
        this.hypotenuse = hypotenuse;
    }

// Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny
    boolean isPythagoreanTheoremTroueForThisTriangle(){
        if (legA * legA + legB * legB == hypotenuse * hypotenuse){
            return true;
        }
        else {
            return false;
        }
    }

}

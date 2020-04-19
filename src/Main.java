public class Main {

    public static void main(String[] args) {

        Age age = new Age(21);
        Name name = new Name("Bartosz");
        MathOperations someMathOperations = new MathOperations(12, 4);
        IsEven isReallyEven = new IsEven(10);
        IsEven anohterNumberToCheck = new IsEven(5);
        Division division = new Division(15);
        Division anotherDivision = new Division(12);
        Cube cube = new Cube(3);
        SquareRoot squareRoot = new SquareRoot(144);
        PythagoreanTheorem firstTriangle = new PythagoreanTheorem(5, 12, 13);
        PythagoreanTheorem secondTriangle = new PythagoreanTheorem(3, 5, 7);

        System.out.println("I am " + age.myAge() + " years old" );
        System.out.println("My name is: " + name.myName());
        someMathOperations.mathOperationsOnDoubles();
        System.out.println(isReallyEven.checkIfItsEven());
        System.out.println(anohterNumberToCheck.checkIfItsEven());
        System.out.println(cube.cubeOfNumber());
        System.out.println(division.division());
        System.out.println(anotherDivision.division());
        System.out.println(squareRoot.squareRooting());
        System.out.println(firstTriangle.isPythagoreanTheoremTroueForThisTriangle());
        System.out.println(secondTriangle.isPythagoreanTheoremTroueForThisTriangle());

    }

}

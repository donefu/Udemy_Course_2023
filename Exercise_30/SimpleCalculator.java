package Exercise_30;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    // Getter and Setter

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // METHOD

    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }

    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            return (firstNumber / secondNumber);
        }
    }

}

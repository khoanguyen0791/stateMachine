package state;

public class MinusState implements OperatorStateInterface {

  public MinusState() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public double calculate(double previousTotal, double numberInput) {
    return previousTotal - numberInput;
  }

  @Override
  public void getMessage() {
    System.out.println("Minus state.");

  }

}

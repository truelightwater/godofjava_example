package f.lambda;

public abstract class CalculateSample implements Calculate {

  public static void main(String[] args) {
    CalculateSample sample = new CalculateSample() {
      @Override
      public int operationAdd(int a, int b) {
        return a+b;
      }
    };
    System.out.println(sample.operationAdd(1,2));

    sample.calculateLambda();
  }
  private void calculateLambda() {
    Calculate calculateAdd = (a, b) -> a+b;
    System.out.println(calculateAdd.operationAdd(1,2));

    Calculate calculateSubtract = (a, b) -> a-b;
    System.out.println(calculateSubtract.operationAdd(5,3));
  }

}

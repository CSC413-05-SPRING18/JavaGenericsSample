import java.util.Stack;

public class JavaIncludedGenerics {

  public static void main(String args[]) {
    Stack<JavaIncludedGenerics> aStack = new Stack<>();
    Stack<Integer> intStack = new Stack<>();
    Stack<Float> floatStack = new Stack<>();

    aStack.push(new JavaIncludedGenerics());
    intStack.push(4);
    floatStack.push(9.0f);
  }
}

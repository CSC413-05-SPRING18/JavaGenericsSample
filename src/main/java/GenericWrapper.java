class SomeClass{

}

public class GenericWrapper<Type> {

  // An object of type T is declared
  Type objectA;
  Type objectB;
  Type objectC;

  GenericWrapper() {
  }

  public void setObjectA(Type o) {
    this.objectA = o;
  }

  public void setObjectB(Type o) {
    this.objectB = o;
  }

  public void setObjectC(Type o) {
    this.objectC = o;
  }

  public Type getObjectA() {
    return this.objectA;
  }

  public Type getObjectB() {
    return this.objectB;
  }

  public Type getObjectC() {
    return this.objectC;
  }

  public static void main(String args[]){
    GenericWrapper<Integer> genA = new GenericWrapper<Integer>();
    genA.setObjectA(4);
    genA.setObjectB(4);
    genA.setObjectC(4);

    GenericWrapper<SomeClass> genB = new GenericWrapper<SomeClass>();
    genB.setObjectA(new SomeClass());
    genB.setObjectB(new SomeClass());
    genB.setObjectC(new SomeClass());
  }
}

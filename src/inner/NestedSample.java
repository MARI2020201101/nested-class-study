package inner;

public class NestedSample {
    public static void main(String[] args) {
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.setValue(10);
        System.out.println("staticNested.getValue()) :" + staticNested.getValue());

    }
}

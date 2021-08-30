package inner;

public class InnerSample {
    public static void main(String[] args) {
        InnerSample sample = new InnerSample();
        sample.makeInnerObject();
    }

    private void makeInnerObject() {
        OuterOfInner outerOfInner = new OuterOfInner();
        OuterOfInner.Inner inner = outerOfInner.new Inner();
        inner.setValue(10);
        System.out.println(inner.getValue());


    }
}

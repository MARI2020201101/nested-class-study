package inner;

public class ReferenceAtNestedSample {
    public static void main(String[] args) {
        ReferenceAtNestedSample sample = new ReferenceAtNestedSample();
        OuterOfStatic outerOfStatic = new OuterOfStatic();
        outerOfStatic.callNestedclass();
    }
}

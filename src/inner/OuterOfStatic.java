package inner;

public class OuterOfStatic {

    public void callNestedclass(){
        StaticNested staticNested = new StaticNested();
        staticNested.privatePrint();
        staticNested.defaultPrint();
        staticNested.publicPrint();
    }
    static class StaticNested{
        private int value;
        public int getValue(){
            return this.value;
        }
        public void setValue(int value){
            this.value = value;
        }
        private void privatePrint(){
            System.out.println("I'm static nested class private");
        }
        void defaultPrint(){
            System.out.println("I'm static nested class default");
        }
        public void publicPrint(){
            System.out.println("I'm static nested class public");
        }

    }
}

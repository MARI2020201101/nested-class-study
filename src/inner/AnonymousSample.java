package inner;

public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListener4();
    }

    /**
     * 방법 1) interface 직접 구현
     */
    private void setButtonListener() {
        MagicButton magicButton = new MagicButton();
        MyEventListener listener = new MyEventListener() {
            @Override
            public void onClick() {
                System.out.println("button pressed 1...");
            }
        };
        magicButton.setListener(listener);
        magicButton.onClickPress();

    }
    /**
     * 방법 2) 익명클래스 구현
     */
    private void setButtonListener2() {
        MagicButton magicButton = new MagicButton();
        magicButton.setListener(new MyEventListener() {
            @Override
            public void onClick() {
                System.out.println("button pressed 2....");
            }
        });
        magicButton.onClickPress();

    }
    /**
     * 방법 3) 람다식 이용
     */
    private void setButtonListener3() {
        MagicButton magicButton = new MagicButton();
        magicButton.setListener(()-> System.out.println("button pressed 3...."));
        magicButton.onClickPress();

    }

    /**
     * 방법 4) 메소드 참조 이용
     */
    private void setButtonListener4() {
        MagicButton magicButton = new MagicButton();
        magicButton.setListener(this::printSometing);
        magicButton.onClickPress();

    }

    private void printSometing(){
        System.out.println("button pressed 4....");
    }
}

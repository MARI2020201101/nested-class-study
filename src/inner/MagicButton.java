package inner;


public class MagicButton {
    public MagicButton(){
        
    }
    private MyEventListener listener;
    public void setListener(MyEventListener listener){
        this.listener = listener;
    }
    public void onClickPress(){
        if(listener!=null){
            listener.onClick();
        }
    }
}

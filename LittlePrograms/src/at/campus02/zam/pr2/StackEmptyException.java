package at.campus02.zam.pr2;

public class StackEmptyException extends Exception {
    public StackEmptyException(){}
    public StackEmptyException(String msg){
        super(msg);
    }
}

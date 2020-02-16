package cn.principle.openclose;

/**
 * 按钮
 *
 * 此设计违反了开闭原则，当我们需要按钮支持星号(*)和井号(#)的时候，我们必须修改Button类代码
 * 当我们想要用这个按钮控制一个密码锁而不是拨号器的时候，因为按钮关联了拨号器，所以仍然要修改Button代码
 * 当我们想要按钮控制多个设备时，还是要修改Button代码
 *
 * 当我们在代码中看到else或者switch/case关键字的时候，基本可以判断违反开闭原则了
 */
public class Button {
    public final static int SEND_BUTTON = -99;
    private Dialer dialer;
    private int token;

    public Button(int token,Dialer dialer){
        this.token = token;
        this.dialer = dialer;
    }

    public void press(){
        switch (token){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                dialer.enterDigit(token);
                break;
            case SEND_BUTTON:
                dialer.dial();
                break;
            default:
                throw new UnsupportedOperationException("unknown button pressed : token="+token);
        }
    }
}

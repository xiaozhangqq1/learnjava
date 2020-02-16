package cn.principle.openclose;

/**
 * 将ObserveButton和ObserveDialer组合成电话
 */
public class ObservePhone {
    private ObserveDialer dialer;
    private ObserveButton[] digitButtons;
    private ObserveButton sendButton;

    public ObservePhone(){
        dialer = new ObserveDialer();
        digitButtons = new ObserveButton[10];
        for(int i = 0;i<digitButtons.length;i++){
            digitButtons[i] = new ObserveButton();
            final int digit = i;
            digitButtons[i].addListener(token -> dialer.enterDigit(digit));
        }
        sendButton = new ObserveButton();
        sendButton.addListener(token -> dialer.dial());
    }

    public static void main(String[] args) {
        ObservePhone phone = new ObservePhone();
        phone.digitButtons[9].press();
        phone.digitButtons[1].press();
        phone.digitButtons[1].press();
        phone.sendButton.press();
    }
}

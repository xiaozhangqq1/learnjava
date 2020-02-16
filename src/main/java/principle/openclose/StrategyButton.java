package cn.principle.openclose;

/**
 * 策略模式的按钮
 */
public class StrategyButton {
    private ButtonServer buttonServer;
    private int token;

    public StrategyButton(ButtonServer buttonServer, int token) {
        this.buttonServer = buttonServer;
        this.token = token;
    }

    public void press() {
        buttonServer.buttonPressed(token);
    }
}

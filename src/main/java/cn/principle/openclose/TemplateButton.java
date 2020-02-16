package cn.principle.openclose;

import java.util.LinkedList;
import java.util.List;

/**
 * 模板方法模式
 */
public abstract class TemplateButton {
    abstract void onPress();

    private List<ButtonListener> listeners;

    public TemplateButton() {
        this.listeners = new LinkedList<>();
    }

    public void addListener(ButtonListener listener) {
        assert listener != null;
        listeners.add(listener);
    }

    public void press() {
        onPress();
        for (ButtonListener listener : listeners) {
            listener.buttonPressed(2);
        }
    }
}

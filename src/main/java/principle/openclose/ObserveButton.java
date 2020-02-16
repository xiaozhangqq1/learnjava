package cn.principle.openclose;

import java.util.LinkedList;
import java.util.List;

/**
 * 观察者模式按钮
 */
public class ObserveButton {
    private List<ButtonListener> listeners;
    public ObserveButton(){
        this.listeners = new LinkedList<>();
    }
    public void addListener(ButtonListener listener){
        assert listener!=null;
        listeners.add(listener);
    }

    public void press(){
        for (ButtonListener listener:listeners){
            listener.buttonPressed(2);
        }
    }
}

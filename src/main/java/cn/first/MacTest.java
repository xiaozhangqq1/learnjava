package cn.first;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class MacTest {
    public static List<String> getMacAddr() {
        try {
            List<String> list = new ArrayList<>();
            Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
            while (networks.hasMoreElements()) {
                StringBuilder stringBuilder = new StringBuilder();
                NetworkInterface network = networks.nextElement();
                if (network != null) {
                    byte[] macAddr = network.getHardwareAddress();
                    if (macAddr != null) {
                        for (int i = 0; i < macAddr.length; i++) {
                            stringBuilder.append(String.format("%02X%s", macAddr[i], (i < macAddr.length - 1) ? "-" : ""));
                        }
                        list.add(stringBuilder.toString());
                    }
                }
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException("get mac addr error", e);
        }
    }

    public static void main(String[] args) {
        System.out.println(getMacAddr());
    }
}

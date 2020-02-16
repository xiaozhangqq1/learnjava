package javaGuide;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP {
    public static String getIP() {
        String ip = null;
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ip;
    }

    public static void setIP(String newIP) throws Exception {
        Runtime.getRuntime().exec("netsh interface ip set address \"本地连接\" static " +
                "192.168." + newIP + "." + getIP().split("\\.")[3] + " 255.255.255.0 " + " 192.168." + newIP + ".1");
    }

    public static void main(String[] args) {
        System.out.println(getIP());
        System.out.println("192.168." + "102." + getIP().split("\\.")[3]);
        try {
            setIP("102");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //netsh interface ip set address "本地连接" static 192.168.103.107 255.255.255.0 192.168.103.1
}

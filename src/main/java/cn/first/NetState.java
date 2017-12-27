package cn.first;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Created by zhangxuelong on 2017/12/21
 */
public class NetState {

    private boolean isConnect1(){
        boolean connect = false;
        Runtime runtime = Runtime.getRuntime();
        Process process;
        try {
            process = runtime.exec("ping " + "www.baidu.com");
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            is.close();
            isr.close();
            br.close();

            if (!sb.toString().equals("")) {
                connect = sb.toString().indexOf("TTL") > 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connect;
    }

    private boolean isNetConnect(){
        boolean connect = true;
        try{
            URL url = new URL("http://dev-api.vivedu.com:80/api/classroom/courseware");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            String code = String.valueOf(connection.getResponseCode());
            System.out.println(code);
            if (code.equals("")) {
                connect = false;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return connect;
    }

    private boolean isConnect() {
        boolean status;
        try {
             status = InetAddress.getByName("dev-api.vivedu.com").isReachable(5000);
        } catch (Exception e){
            status = false;
        }
        return status;
    }

    public static void main(String[] args) throws IOException {
        NetState netState = new NetState();
//        System.out.println(netState.isConnect1());
//        System.out.println(netState.isNetConnect());
        System.out.println(netState.isConnect());
    }
}

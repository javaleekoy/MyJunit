package com.peramdy;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by peramdy on 2017/7/4.
 */
public class FcmTest {

    public final static String AUTH_KEY_FCM="AIzaSyBroCeoX2vUqEPkd_Pb39xEORTIhf9eprY";

    public final static String API_URL_FCM="https://fcm.googleapis.com/fcm/send";


    public static void pushFCMNotification() {
        try {
            URL url = new URL(API_URL_FCM);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setUseCaches(false);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization","key="+AUTH_KEY_FCM);
            conn.setRequestProperty("Content-Type","application/json");//不设置默认发送文本格式。设置就是json

            JSONObject json = new JSONObject();
            json.put("to","368735ad817162da");//推送到哪台客户端机器，方法一推一个token,
            //方法二，批量推送 ，最多1000个token ，此处的tokens是一个token JSONArray数组json.put("registration_ids", tokens);
            JSONObject info = new JSONObject();
            info.put("title","Notification Tilte");
            info.put("body", "Hello Test notification");
            info.put("icon", "myicon");
            json.put("notification", info);//json 还可以put其他你想要的参数

            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(json.toString());
            wr.flush();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = null;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
            wr.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

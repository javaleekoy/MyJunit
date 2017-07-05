package com.peramdy;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by peramdy on 2017/7/4.
 */
public class HttpClientTest {

    public static void apacheHttpClientPost(){

        CloseableHttpClient client= HttpClients.createDefault();



        HttpPost post=new HttpPost("https://www.baidu.com/");
        post.setHeader("Authorization","AIzaSyBroCeoX2vUqEPkd_Pb39xEORTIhf9eprY");
        post.setHeader("Content-Type","application/json");
        JSONObject info=new JSONObject();
        JSONObject data=new JSONObject();
        info.put("to","1:769094006249:android:368735ad817162da");
        data.put("title","testFireBase");
        data.put("body","hello jack");
        info.put("data",data);
        StringEntity entity=new StringEntity(info.toString(),"utf-8");
        post.setEntity(entity);
        try {
            CloseableHttpResponse response=client.execute(post);
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void apacheCommonHttpClientPost(){
        HttpClient httpClient=new HttpClient();
//        httpClient.set

        PostMethod postMethod=new PostMethod("https://www.baidu.com/");
        postMethod.setRequestHeader("Content-Type","application/json");
        postMethod.setRequestHeader("Authorization","AIzaSyCYmpB1vusSl1GaqxnLujMs3XUqfCCKhIA");
        JSONObject info=new JSONObject();
        JSONObject data=new JSONObject();
        info.put("to","1:769094006249:android:368735ad817162da");
        data.put("title","testFireBase");
        data.put("body","hello jack");
        info.put("data",data);

        StringRequestEntity stringRequestEntity= null;
        try {
            stringRequestEntity = new StringRequestEntity(info.toString(),"application/json","utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        postMethod.setRequestEntity(stringRequestEntity);
        try {


            Integer respond= httpClient.executeMethod(postMethod);
            if(respond==HttpStatus.SC_MOVED_TEMPORARILY  || respond==HttpStatus.SC_MOVED_PERMANENTLY){//重定向
                return ;
//                Header locationHeader = postMethod.getResponseHeader("location");
//                String newURI=locationHeader.getValue();
//                PostMethod rePostMethod=new PostMethod(newURI);
//                rePostMethod.setRequestHeader("Authorization","AIzaSyBroCeoX2vUqEPkd_Pb39xEORTIhf9eprY");
//                rePostMethod.setRequestHeader("Content-Type","application/json;charset=UTF-8");
//                int respondCode= httpClient.executeMethod(rePostMethod);
//                System.out.println(respondCode);
            }
            System.out.println(respond);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void apacheCommonHttpClientGet(){
        HttpClient httpClient=new HttpClient();
        GetMethod getMethod=new GetMethod("https://www.baidu.com/");
        getMethod.setRequestHeader("Content-Type","application/json");
        try {
            Integer respond= httpClient.executeMethod(getMethod);
            System.out.println(respond);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

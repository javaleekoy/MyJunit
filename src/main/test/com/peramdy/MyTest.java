package com.peramdy;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Peramdy on 2016/12/10.
 */
public class MyTest {

    @Test
    public void dateTestOne() {
        Date now = new Date();
        String strTime = DateTest.test24H(now);
        System.out.println(strTime);
    }

    @Test
    public void dateTestTwo() {
        Date now = new Date();
        String strTime = DateTest.test12H(now);
        System.out.println(strTime);
    }

    @Test
    public void fileTestOne() {
        String filePath = "C:\\Users\\Peramdy\\Documents\\搜索引擎get请求.txt";
        String strFile = FileTest.readFileToString(filePath);
        System.out.println(strFile);
    }


    @Test
    public void cachedThreadTest() {
        ThreadPoolTest.testCachedThread();
    }

    @Test
    public void fixThreadTest() {
        ThreadPoolTest.testFixThread();
    }

    @Test
    public void agentInActiveDays() {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(1);
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(3);
        list3.add(2);
        list3.add(1);

        agentTest.agentInActiveDadys(list1, list2, list3);
    }

    @Test
    public void getAddDaysTest() {
        String str = DateTest.getAddDay(1);
        System.out.println(str);
    }


    @Test
    public void sendFcmMessage() {
        FcmTest.pushFCMNotification();
        System.out.printf("send end!!!");
    }

    @Test
    public void apacheCommonHttpClientPost() {
        HttpClientTest.apacheCommonHttpClientPost();
    }

    @Test
    public void apacheHttpClientPost() {
        HttpClientTest.apacheHttpClientPost();
    }


    @Test
    public void apacheCommonHttpClientGet() {
        HttpClientTest.apacheCommonHttpClientGet();
    }


    @Test
    public void testSalt() {

        try {
            String password = SaltUtil.getEncryptedPwd("0x570xff");
            System.out.println("--------------------------------------");
            System.out.println(password);
            System.out.println("--------------------------------------");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testOne() {
        Date now = new Date();
        Long timeStamp = now.getTime() / 1000;

        String salt = timeStamp.toString();
        System.out.println(salt);

        SaltTest encoderMd5 = new SaltTest(salt, "MD5");
        String encode = encoderMd5.encode("0x570xff");
        System.out.println(encode);
    }

    @Test
    public void testTwo() {

        Date now = new Date();
        System.out.println(now.getTime());
        System.out.println(now.getTime() / 1000);

    }

}

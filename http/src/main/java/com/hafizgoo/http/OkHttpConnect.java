package com.hafizgoo.http;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class OkHttpConnect {


    public  static OkHttpClient client=new OkHttpClient();


    public  static String doGet(String url)throws  IOException{
        Request request=new Request.Builder().url(url).build();
        try(Response response=client.newCall(request).execute()){
                return response.body().toString();
        }


    }

    public static void main(String[] args) throws Exception {

        String url = "http://localhost:8081";
        String text = OkHttpConnect.doGet(url);
        System.out.println("url: " + url + " ; response: \n" + text);
        OkHttpConnect.client = null;
    }
}

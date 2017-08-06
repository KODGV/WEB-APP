package com.example.administrator.appweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import org.apache.http.util.EncodingUtils;

import java.io.FileInputStream;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final String baiduwangpanloginurl = readFileData("loginFile");


        Button button1 = (Button) findViewById(R.id.meituan);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("data", "http://meituan.com/");
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.dazhong);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("data", "https://www.dianping.com/");
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.baiduwangpan);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                if (baiduwangpanloginurl == null || baiduwangpanloginurl == "")
                    intent.putExtra("data", "https://pan.baidu.com/");
                else {
                    intent.putExtra("data", baiduwangpanloginurl);
                }
                startActivity(intent);
            }
        });
        Button button4 = (Button) findViewById(R.id.taobao);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("data", "https://www.taobao.com/");
                startActivity(intent);
            }
        });
        Button button5 = (Button) findViewById(R.id.xiecheng);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("data", "http://www.ctrip.com/");
                startActivity(intent);
            }
        });
        Button button6 = (Button) findViewById(R.id.baiduditu);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("data", "http://ditu.baidu.com/");
                startActivity(intent);
            }
        });
        Button button7 = (Button) findViewById(R.id.bilibili);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("data", "http://m.bilibili.com/index.html");
                startActivity(intent);
            }
        });
        Button button8 = (Button) findViewById(R.id.qqyouxiang);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("data", "https://ui.ptlogin2.qq.com/cgi-bin/login?style=9&appid=522005705&daid=4&s_url=https%3A%2F%2Fw.mail.qq.com%2Fcgi-bin%2Flogin%3Fvt%3Dpassport%26vm%3Dwsk%26delegate_url%3D%26f%3Dxhtml%26target%3D&hln_css=http%3A%2F%2Fmail.qq.com%2Fzh_CN%2Fhtmledition%2Fimages%2Flogo%2Fqqmail%2Fqqmail_logo_default_200h.png&low_login=1&hln_autologin=记住登录状态&pt_no_onekey=1");
                startActivity(intent);
            }
        });
        Button button9 = (Button) findViewById(R.id.zhihu);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("data", "https://www.zhihu.com/");
                startActivity(intent);
            }
        });
        Button button10 = (Button) findViewById(R.id.zhihuribao);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("data", "http://zhihudaily.me/");
                startActivity(intent);
            }
        });
    }

    public String readFileData(String fileName) {

        String res = "";

        try {

            FileInputStream fin = openFileInput(fileName);

            int length = fin.available();

            byte[] buffer = new byte[length];

            fin.read(buffer);

            res = EncodingUtils.getString(buffer, "UTF-8");

            fin.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return res;

    }
}

package com.example.ykai.test;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Android多线程与界面交互的方法
 * 　　*Activity.runOnUIThread(Runnable)
 * 　　*View.post(Runnable)，View.postDelay(Runnable,long)
 * 　　*Handler
 * 　　*AsyncTask
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// 方法一：  Activity.runOnUIThread(Runnable)
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getId());
////                try {
////                    Thread.sleep(5000);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Toast.makeText(MainActivity.this, "UI操作...", Toast.LENGTH_SHORT).show();
//                    }
//                });
//            }
//        }).start();

//         方法二：  View.post(Runnable)，View.postDelay(Runnable,long)
//              findViewById(R.id.tv).postDelayed(new Runnable() {
//                  @Override
//                  public void run() {
//                      Toast.makeText(MainActivity.this, "UI操作...", Toast.LENGTH_SHORT).show();
//                  }
//              },5000);

        //方法3
        new Handler().postDelayed(new Runnable() {
            public void run() {
                //execute the task
                Toast.makeText(MainActivity.this, "UI操作...", Toast.LENGTH_SHORT).show();
            }
        }, 5000);

//        方法四
//        AsyncTask

        //方法5
//        TimerTask task = new TimerTask(){
//            public void run(){
//                //execute the task
//                Log.e("_tag","这不是UI线程");
//            }
//        };
//        Timer timer = new Timer();
//        timer.schedule(task, 5000);


    }


}

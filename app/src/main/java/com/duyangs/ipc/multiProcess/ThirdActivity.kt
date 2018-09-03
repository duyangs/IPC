package com.duyangs.ipc.multiProcess

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.duyangs.ipc.R


/**
 * "" IPC
 * create by DuYang
 * e-mail:duyangs1994@gmail.com
 * update time 2018/9/3.
 */
class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        title = "Multi Process"
    }
}
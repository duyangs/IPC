package com.duyangs.ipc.multiProcess

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.duyangs.ipc.R
import kotlinx.android.synthetic.main.activity_first.*


/**
 * "" IPC
 * create by DuYang
 * e-mail:duyangs1994@gmail.com
 * update time 2018/9/3.
 */
class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        initView()
    }

    private fun initView(){
        title = "Multi Process"
        btn_to_second.setOnClickListener { startActivity(Intent(this@FirstActivity,SecondActivity::class.java)) }
    }
}
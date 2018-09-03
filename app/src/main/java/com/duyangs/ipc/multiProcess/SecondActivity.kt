package com.duyangs.ipc.multiProcess

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.duyangs.ipc.R
import kotlinx.android.synthetic.main.activity_second.*


/**
 * "" IPC
 * create by DuYang
 * e-mail:duyangs1994@gmail.com
 * update time 2018/9/3.
 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }

    private fun initView(){
        title = "Multi Process"
        btn_to_third.setOnClickListener { startActivity(Intent(this@SecondActivity,ThirdActivity::class.java)) }
    }
}
package com.duyangs.ipc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.duyangs.ipc.multiProcess.FirstActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView(){
        btn_to_first.setOnClickListener { startActivity(Intent(this@MainActivity,FirstActivity::class.java)) }
    }
}

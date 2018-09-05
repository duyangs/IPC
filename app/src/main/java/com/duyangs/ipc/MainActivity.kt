package com.duyangs.ipc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.duyangs.ipc.multiProcess.FirstActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView(){
        btn_to_first.setOnClickListener { startActivity(Intent(this@MainActivity,FirstActivity::class.java)) }
    }

    private fun initData(){

        //序列化
        val commodity = Commodity("001","pen","10")
        val out = ObjectOutputStream(FileOutputStream("test.txt"))
        out.writeObject(commodity)
        out.close()

        //反序列化
        val input = ObjectInputStream(FileInputStream("test.txt"))
        val newCommodity = input.readObject() as Commodity
        input.close()

    }
}

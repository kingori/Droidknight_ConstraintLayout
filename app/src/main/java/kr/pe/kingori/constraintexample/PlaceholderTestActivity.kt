package kr.pe.kingori.constraintexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.placeholder_runtime.*

class PlaceholderTestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.placeholder_runtime)

        btn_apply.setOnClickListener { ph_1.setContentId(R.id.btn) }
    }

}

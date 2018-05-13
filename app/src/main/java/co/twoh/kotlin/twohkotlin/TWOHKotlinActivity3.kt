package co.twoh.kotlin.twohkotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class TWOHKotlinActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout3)
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, TWOHKotlinActivity3::class.java)
        }
    }
}
package co.twoh.kotlin.twohkotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class TWOHKotlinActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout1)
        button = findViewById(R.id.button1)
        button.setOnClickListener{
            startActivity(Intent(this, TWOHKotlinActivity2::class.java))
        }
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, TWOHKotlinActivity::class.java)
        }
    }
}
package co.twoh.kotlin.twohkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    /**
     * inisialisasi null
     */
    var button1: Button? = null

    /**
     * inisialisasi dengan lazy init
     */
    private lateinit var button2: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.bt_1) as Button
        button2 = findViewById(R.id.bt_2)

        button1?.setOnClickListener {
            Toast.makeText(this, "Clicked "+button1?.text, Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener{
            Toast.makeText(this, "Clicked "+button2.text, Toast.LENGTH_LONG).show()
        }
    }
}
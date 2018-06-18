package co.twoh.kotlin.twohkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    /**
     * inisialisasi null
     */
    var button1: Button? = null

    /**
     * inisialisasi dengan lazy init
     */
    private lateinit var button2: Button

    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Find view menggunakan as Button
         */
        button1 = findViewById(R.id.bt_1) as Button

        /**
         * Find view secara langsung
         */
        button2 = findViewById(R.id.bt_2)

        button3 = findViewById(R.id.bt_3)

        /**
         * setOnClickListener kemungkinan variable null
         */
        button1?.setOnClickListener {
            startActivity(TWOHKotlinButton.newIntent(this))
        }

        /**
         * setOnClickListener variable tidak mungkin null
         */
        button2.setOnClickListener{
            startActivity(TWOHKotlinActivity.newIntent(this))
        }

        button3.setOnClickListener{
            startActivity(TWOHKotlinActivity3.newIntent(this))
        }


    }
}
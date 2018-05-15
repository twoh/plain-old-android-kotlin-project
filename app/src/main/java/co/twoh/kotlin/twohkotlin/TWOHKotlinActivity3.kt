package co.twoh.kotlin.twohkotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class TWOHKotlinActivity3 : AppCompatActivity() {

    private lateinit var etData1 : EditText
    private lateinit var etData2 : EditText
    private lateinit var btSubmit : Button
    private lateinit var btSubmitIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout3)

        etData1 = findViewById(R.id.et_data1)
        etData2 = findViewById(R.id.et_data2)
        btSubmit = findViewById(R.id.bt_submit)
        btSubmitIntent = findViewById(R.id.bt_submitintent)

        btSubmit.setOnClickListener {

            /**
             * Move ke activity selanjutnya dengan
             * passing data menggunakan Bundle
             */
            val bundle = Bundle()
            bundle.putString("data1", etData1.text.toString())
            bundle.putString("data2", etData2.text.toString())

            val intent = Intent(this, TWOHKotlinActivity4::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btSubmitIntent.setOnClickListener{
            /**
             * Move ke activity selanjutnya dengan
             * passing data menggunakan Intent
             */
            val intent = Intent(this, TWOHKotlinActivity4::class.java)
            intent.putExtra("data1", etData1.text.toString())
            intent.putExtra("data2", etData2.text.toString())
            startActivity(intent)
        }

    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, TWOHKotlinActivity3::class.java)
        }
    }


}
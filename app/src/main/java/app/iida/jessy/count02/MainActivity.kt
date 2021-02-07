package app.iida.jessy.count02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int = 0
        var plusButton = findViewById<Button>(R.id.plusButton)
        var numberTextView = findViewById<TextView>(R.id.numberTextView)



        numberTextView.text = "0"

        plusButton.setOnClickListener{
            number = number + 1
            numberTextView.text = number.toString()
        }
    }
}
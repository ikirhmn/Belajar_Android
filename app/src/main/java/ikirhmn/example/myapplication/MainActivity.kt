package ikirhmn.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputanTeks: TextInputEditText = findViewById(R.id.inputanTeks)  // Ambil dari TextInputEditText
        val buttonHello: Button = findViewById(R.id.buttonHello)
        val tvHello: TextView = findViewById(R.id.tvHello)

        buttonHello.setOnClickListener {
            val str: String = inputanTeks.text.toString()
            tvHello.text = str
        }
    }
}
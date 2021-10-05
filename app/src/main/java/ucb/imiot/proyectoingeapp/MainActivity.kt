package ucb.imiot.proyectoingeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var firstButton : Button
    lateinit var secondButton : Button
    lateinit var thirdButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstButton = findViewById(R.id.firstButton)
        secondButton = findViewById(R.id.secondButton)
        thirdButton = findViewById(R.id.thirdButton)

        firstButton.setOnClickListener{startActivity(Intent(this,form::class.java))}
        secondButton.setOnClickListener{startActivity(Intent(this,converter::class.java))}
        thirdButton.setOnClickListener{startActivity(Intent(this,bluetoothControls::class.java))}

    }



}
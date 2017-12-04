package ar.com.bhstudio.activitiespermisoslists.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import ar.com.bhstudio.activitiespermisoslists.R
import kotlinx.android.synthetic.main.activity_kotlin_android_extensions.*

class KotlinAndroidExtensionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_android_extensions)

        val btnById = findViewById<Button>(R.id.buttonById)

        btnById.setOnClickListener {
            Toast.makeText(this, "Click by findViewById", Toast.LENGTH_LONG).show()
        }

        buttonByKat.setOnClickListener {
            Toast.makeText(this, "Click by Kotlin Android Extensions!!!!!!!", Toast.LENGTH_LONG).show()
        }
    }
}

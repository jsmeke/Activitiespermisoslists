package ar.com.bhstudio.activitiespermisoslists.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import ar.com.bhstudio.activitiespermisoslists.R

class ClickEventsActivity : AppCompatActivity(), View.OnLongClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_events)

        clickInLine()

        val btnMulti1 = findViewById<Button>(R.id.buttonClickMulti1)
        val btnMulti2 = findViewById<Button>(R.id.buttonClickMulti2)
        val btnMulti3 = findViewById<Button>(R.id.buttonClickMulti3)

        btnMulti1.setOnLongClickListener(this)
        btnMulti2.setOnLongClickListener(this)
        btnMulti3.setOnLongClickListener(this)
    }

    fun xmlClick(view: View) {
        Toast.makeText(this, "Click by XML", Toast.LENGTH_SHORT).show()
    }

    private fun clickInLine() {
        val btnClickinLine = findViewById<Button>(R.id.buttonClickInLine)

        btnClickinLine.setOnClickListener {
            Toast.makeText(this, "Click in Line", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onLongClick(view: View): Boolean {
        when (view.id) {
            R.id.buttonClickMulti1 -> Toast.makeText(this, "Click in Multi 1!", Toast.LENGTH_SHORT).show()
            R.id.buttonClickMulti2 -> Toast.makeText(this, "Click in Multi 2!", Toast.LENGTH_SHORT).show()
            R.id.buttonClickMulti3 -> Toast.makeText(this, "Click in Multi 3!", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}

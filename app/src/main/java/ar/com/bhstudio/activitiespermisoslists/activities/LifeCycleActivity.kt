package ar.com.bhstudio.activitiespermisoslists.activities

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import ar.com.bhstudio.activitiespermisoslists.R

class LifeCycleActivity : LifeCycleEventsActivity() {

    private var exitEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    override fun onBackPressed() {
        if (exitEnabled) {
            super.onBackPressed()
        }
        exitEnabled = true
        Toast.makeText(this,"Presiona el boton atras nuevamente para salir",Toast.LENGTH_LONG).show()
        Handler().postDelayed(Runnable { exitEnabled=false }, 2000)
    }
}

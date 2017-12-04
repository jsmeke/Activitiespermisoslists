package ar.com.bhstudio.activitiespermisoslists.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ar.com.bhstudio.activitiespermisoslists.R
import kotlinx.android.synthetic.main.activity_intents.*

class IntentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        btnIntentWithExtras.setOnClickListener{goIntentExtras()}
        btnIntentWithFlags.setOnClickListener{goIntentFlags()}
        btnIntentWithObject.setOnClickListener{goIntentObject()}
    }

    private fun goIntentExtras(){
        val intent = Intent(this, IntentExtrasActivity:: class.java)
        startActivity(intent)
    }
    private fun goIntentFlags(){
        val intent = Intent(this, IntentExtrasActivity:: class.java)
        startActivity(intent)
    }
    private fun goIntentObject(){
        val intent = Intent(this, IntentExtrasActivity:: class.java)
        startActivity(intent)
    }
}

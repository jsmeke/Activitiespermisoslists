package ar.com.bhstudio.activitiespermisoslists.activities

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import ar.com.bhstudio.activitiespermisoslists.R
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_picasso.*


class PicassoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso)

        btnLoader.setOnClickListener { loadImages() }

        Picasso.with(this).load("https://static.pexels.com/photos/288264/pexels-photo-288264.jpeg").fetch()
    }

    private fun loadImages() {
        Picasso
                .with(this)
                .load("https://static.pexels.com/photos/288264/pexels-photo-288264.jpeg")
                .resize(300, 300)
                .centerCrop()
                .into(imageViewTop)

//        Picasso
//                .with(this)
//                .load("https://static.pexels.com/photos/288929/pexels-photo-288929.jpeg")
//                .fit()
//                .into(imageViewBottom)

//        Picasso
//                .with(this)
//                .load("https://static.pexels.com/photos/288929/pexels-photo-288929.jpeg")
//                .fit()
//                .transform(CircleTransform())
//                .into(imageViewBottom)

        val context: Context = this


        Picasso.with(this)
                .load("https://static.pexels.com/photos/288929/pexels-photo-288929.jpeg")
                .fetch(object : Callback {
                    override fun onSuccess() {
                        imageViewBottom.alpha = 0f
                        Picasso.with(context)
                                .load("https://static.pexels.com/photos/288929/pexels-photo-288929.jpeg")
                                .fit()
                                .into(imageViewBottom)
                        imageViewBottom.animate().setDuration(1300).alpha(1f).start()
                    }

                    override fun onError() {
                        Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
                    }

                })

    }
}

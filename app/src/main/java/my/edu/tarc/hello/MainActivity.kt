package my.edu.tarc.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Load UI to memory
        setContentView(R.layout.activity_main)

        // Add UI handler
        val textViewName: TextView = findViewById(R.id.textViewName)
        val imageViewQrCode: ImageView = findViewById(R.id.imageViewQrCode)
        val buttonShow: Button = findViewById(R.id.buttonShow)
        val buttonHide: Button = findViewById(R.id.buttonHide)

        buttonShow.setOnClickListener {
            textViewName.visibility = View.VISIBLE
            imageViewQrCode.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener {
            textViewName.visibility = View.INVISIBLE
            imageViewQrCode.visibility = View.INVISIBLE
        }
    }
}
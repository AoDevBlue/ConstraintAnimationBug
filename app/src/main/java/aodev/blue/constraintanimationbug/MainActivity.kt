package aodev.blue.constraintanimationbug

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        val helloButtonContainer: ViewGroup = findViewById(R.id.hello_button_container)
        val toggleButton: Button = findViewById(R.id.toggle_button)

        toggleButton.setOnClickListener {
            val isVisible = helloButtonContainer.visibility == View.VISIBLE
            helloButtonContainer.visibility = if (isVisible) View.GONE else View.VISIBLE
        }
    }
}

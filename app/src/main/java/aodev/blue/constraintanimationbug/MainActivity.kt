package aodev.blue.constraintanimationbug

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        val rootContainer: ViewGroup = findViewById(R.id.root_view)
        val toggleButton: Button = findViewById(R.id.toggle_button)
        val infoTextView: TextView = findViewById(R.id.info_text)

        toggleButton.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootContainer)
            infoTextView.toggleVisibility()
        }
    }

    private fun View.toggleVisibility() {
        val isVisible = visibility == View.VISIBLE
        visibility = if (isVisible) View.GONE else View.VISIBLE
    }
}

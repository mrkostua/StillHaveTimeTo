package mr.kostua.youstillhavetimeto.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mr.kostua.youstillhavetimeto.ui.start.StartActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initLoads()
        launchStartActivity()

        finish()
    }

    private fun initLoads() {

    }

    private fun launchStartActivity() {
        val startIntent = Intent(this@SplashActivity, StartActivity::class.java)
        startActivity(startIntent)
    }
}
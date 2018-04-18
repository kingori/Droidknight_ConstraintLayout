package kr.pe.kingori.constraintexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placeholder_orientation)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.run {
            add(0,0,1, "ConstraintSet")
            add(0,1,2,"Placeholder")
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when(item?.itemId) {
            0 -> {
                startActivity(Intent(this@MainActivity, ConstraintSetTestActivity::class.java))
                true
            }
            1 -> {
                startActivity(Intent(this@MainActivity, PlaceholderTestActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
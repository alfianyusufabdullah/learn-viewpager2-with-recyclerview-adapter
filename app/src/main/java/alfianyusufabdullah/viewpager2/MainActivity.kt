package alfianyusufabdullah.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texts = listOf("Page 1", "Page 2", "Page 3")

        val adapter = MainAdapter(texts) {
            if (mainViewPager.orientation == ViewPager2.ORIENTATION_VERTICAL) {
                mainViewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
            } else {
                mainViewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
            }
        }

        mainViewPager.adapter = adapter
    }
}

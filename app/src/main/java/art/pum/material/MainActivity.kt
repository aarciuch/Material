package art.pum.material

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import art.pum.material.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val nav = this.findNavController(R.id.navController)
        NavigationUI.setupActionBarWithNavController(this, nav)

        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.jedenFragment -> {
                    findNavController(R.id.navController).navigate(R.id.jedenFragment)
                    true
                }
                R.id.dwaFragment -> {
                    findNavController(R.id.navController).navigate(R.id.dwaFragment)
                    true
                }
                R.id.trzyFragment2 -> {
                    findNavController(R.id.navController).navigate(R.id.trzyFragment2)
                    true
                }
                else -> false
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return this.findNavController(R.id.navController).navigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, this.findNavController(R.id.navController))
                ||super.onOptionsItemSelected(item)
    }
}
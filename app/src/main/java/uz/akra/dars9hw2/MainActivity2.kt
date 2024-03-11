package uz.akra.dars9hw2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.akra.dars9hw2.databinding.ActivityMain2Binding
import uz.akra.dars9hw2.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        if (!binding.swKok.isChecked && !binding.swQizil.isChecked) {

            binding.swYashil.setOnCheckedChangeListener { _, b ->
                ColorData.color = Color.GREEN
            }
        }

        binding.swKok.setOnCheckedChangeListener { _, b ->
            ColorData.color = Color.BLUE
        }

        binding.swQizil.setOnCheckedChangeListener { _, b ->
            ColorData.color = Color.RED
        }
    }
}
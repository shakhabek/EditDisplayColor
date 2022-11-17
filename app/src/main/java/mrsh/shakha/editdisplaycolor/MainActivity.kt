package mrsh.shakha.editdisplaycolor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mrsh.shakha.editdisplaycolor.databinding.ActivityMainBinding
import mrsh.shakha.editdisplaycolor.fragments.BlankFragment2

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
package ir.radindev.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.radindev.sharedpreferences.databinding.ActivityMain2Binding
import ir.radindev.sharedpreferences.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        sharedPreferences= getSharedPreferences("data",Context.MODE_PRIVATE)

        binding.btnSubmit.setOnClickListener {
            val name = binding.edtName.text.toString()
            sharedPreferences.edit().putString("name", name).apply()
            val email = binding.edtEmail.text.toString()
            sharedPreferences.edit().putString("emaiil", email).apply()
        }
        val name = sharedPreferences.getString("namee","")
        val email= sharedPreferences.getString("email","")


        binding.edtName.setText(name)
        binding.edtEmail.setText(email)

    }
}
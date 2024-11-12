package br.edu.fatecpg.sistemaconsulta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.sistemaconsulta.databinding.ActivityMainBinding
import br.edu.fatecpg.sistemaconsulta.intent.medico.ui.login.MedicoLoginActivity
import br.edu.fatecpg.sistemaconsulta.intent.paciente.ui.login.PacienteLoginActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnPaciente = findViewById<Button>(R.id.btnPaciente)
        val btnMedico = findViewById<Button>(R.id.btnMédico)

        btnPaciente.setOnClickListener {
            val intent = Intent(this, PacienteLoginActivity::class.java)
            startActivity(intent)
        }

        btnMedico.setOnClickListener{
            val intent = Intent(this, MedicoLoginActivity::class.java)
            startActivity(intent)

        }

    }
}


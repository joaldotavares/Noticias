package br.com.joaldo.news.activity.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import br.com.joaldo.news.R
import br.com.joaldo.news.activity.home.HomeActivity
import com.google.android.material.textfield.TextInputEditText
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.button)
        val username = findViewById<TextInputEditText>(R.id.activity_login_username)
        val password = findViewById<TextInputEditText>(R.id.activity_login_password)

        loginViewModel.verifyViewModel.observe(this, Observer {
            if (it) {
                nextScreen()
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Login Failed")
                builder.setMessage("Usuário ou senha inválidos")
                builder.setPositiveButton("OK") { _, _ -> }
                val alert = builder.create()
                alert.show()
            }
        })

        btnLogin.setOnClickListener {
            loginViewModel.verifyLoginUser(username.text.toString(), password.text.toString())
        }
    }

    private fun nextScreen() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()

    }
}
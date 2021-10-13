package br.com.joaldo.news.activity.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.joaldo.news.R
import br.com.joaldo.news.activity.home.HomeActivity
import br.com.joaldo.news.repository.mock.LoginDataSourceImpl
import com.google.android.material.textfield.TextInputEditText
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {
    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.button)
        val username = findViewById<TextInputEditText>(R.id.login_username)
        val password = findViewById<TextInputEditText>(R.id.login_password)

        loginViewModel.verifyViewModel.observe(this, Observer {
            if (it) {
                nextScreen()
            } else {
                Toast.makeText(this, "Login ou senha inválido", Toast.LENGTH_LONG).show()
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
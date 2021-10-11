package br.com.joaldo.news.activity.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.joaldo.news.R
import br.com.joaldo.news.activity.home.HomeActivity
import br.com.joaldo.news.repository.mock.LoginDataSourceImpl
import br.com.joaldo.news.repository.network.API_KEY
import br.com.joaldo.news.repository.network.Repository
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.*
import java.lang.Exception

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel
    private lateinit var factory: LoginViewModel.LoginViewModelProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btnLogin = findViewById<Button>(R.id.button)
        val username = findViewById<TextInputEditText>(R.id.activity_login_username)
        val password = findViewById<TextInputEditText>(R.id.activity_login_password)

        factory = LoginViewModel.LoginViewModelProvider(LoginDataSourceImpl())
        viewModel = ViewModelProvider(this, factory).get(LoginViewModel::class.java)
        viewModel.verifyViewModel.observe(this, Observer {
            if (it) {
                nextScreen()
            }else{
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Login Failed")
                builder.setMessage("Usuário ou senha inválidos")
                builder.setPositiveButton("OK"){_, _ ->}
                val alert = builder.create()
                alert.show()
            }
        })

        btnLogin.setOnClickListener {
            viewModel.verifyLoginUser(username.text.toString(), password.text.toString())
        }
    }

    private fun nextScreen() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()

    }
}
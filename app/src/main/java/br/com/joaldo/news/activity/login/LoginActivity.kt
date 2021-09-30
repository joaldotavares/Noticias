package br.com.joaldo.news.activity.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.joaldo.news.R
import br.com.joaldo.news.activity.news.NewsActivity
import br.com.joaldo.news.repository.UserDataSource
import br.com.joaldo.news.repository.UserDataSourceImpl
import br.com.joaldo.news.user.User
import br.com.joaldo.news.user.UserDao
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel
    private lateinit var factory: LoginViewModel.LoginViewModelProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.button)
        val username = findViewById<TextInputEditText>(R.id.login_textedit)
        val password = findViewById<TextInputEditText>(R.id.login_passwortd_textedit)

        factory = LoginViewModel.LoginViewModelProvider(UserDataSourceImpl())
        viewModel = ViewModelProvider(this, factory).get(LoginViewModel::class.java)

        viewModel.verifyViewModel.observe(this, Observer {
            if (it) {
                nextScreen()
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Login failed")
                builder.setMessage("Usuario ou senha inválido")
                builder.setPositiveButton("Ok") { _, _ -> {} }
                val alert = builder.create()
                alert.show()
            }
        })

        btnLogin.setOnClickListener {
            viewModel.verifyLoginUser(username.text.toString(), password.text.toString())
        }
    }

    private fun nextScreen (){
        val intent = Intent(this, NewsActivity::class.java)
        startActivity(intent)
        finish()
    }
}
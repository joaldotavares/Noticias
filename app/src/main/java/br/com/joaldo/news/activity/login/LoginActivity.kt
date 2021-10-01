package br.com.joaldo.news.activity.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.joaldo.news.R
import br.com.joaldo.news.activity.home.HomeActivity
import br.com.joaldo.news.user.User
import br.com.joaldo.news.user.UserDao
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.button)
        val username = findViewById<TextInputLayout>(R.id.activity_login_username)
        val password = findViewById<TextInputLayout>(R.id.activity_login_password)

        val user = UserDao.inserir()

        btnLogin.setOnClickListener {
            validateLogin(username, password, user)
        }
    }

    private fun validateLogin(
        username: TextInputLayout,
        password: TextInputLayout,
        user: User
    ) {
        val userLogin = username.editText as EditText
        val userPassword = password.editText as EditText
        if (user.username == userLogin.text.toString() && user.password == userPassword.text.toString()) {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
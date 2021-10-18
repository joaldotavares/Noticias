package br.com.joaldo.news.activity.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.joaldo.news.repository.mock.LoginDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginViewModel(
    private val repository: LoginDataSource
) : ViewModel() {
    private val _verifyViewModel = MutableLiveData<Boolean>()
    val verifyViewModel: LiveData<Boolean> get() = _verifyViewModel

    fun verifyLoginUser(username: String, password: String) {
        viewModelScope.launch {
            try {
                val isvalid = withContext(Dispatchers.Default) {
                    repository.verifyLogin(username, password)
                }
                withContext(Dispatchers.Main) {
                    _verifyViewModel.value = isvalid
                }
            } catch (e: Exception) {
                Log.e("LoginViewModel Erro", e.message.toString())
            }
        }
    }

//    class LoginViewModelProvider(
//        private val repository: LoginDataSource
//    ): ViewModelProvider.Factory{
//        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//            if(modelClass.isAssignableFrom(LoginViewModel::class.java)){
//                return LoginViewModel(repository) as T
//            }else{
//                throw IllegalArgumentException("Unknown ViewModel Class")
//            }
//        }
//
//    }
}

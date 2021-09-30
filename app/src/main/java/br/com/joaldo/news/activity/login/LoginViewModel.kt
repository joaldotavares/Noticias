package br.com.joaldo.news.activity.login

import android.util.Log
import androidx.lifecycle.*
import br.com.joaldo.news.repository.UserDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginViewModel(
    private val repository: UserDataSource
): ViewModel() {
    private val _verifyViewModel = MutableLiveData<Boolean>()
    val verifyViewModel: LiveData<Boolean> get() = _verifyViewModel

    fun verifyLoginUser(username: String, password: String){
        viewModelScope.launch {
            try {
                val isValid = withContext(Dispatchers.IO){
                    repository.verifyLogin(username, password)
                }
                withContext(Dispatchers.Main){
                    _verifyViewModel.value = isValid
                }
            }catch (e: Exception){
                Log.e("Erro", e.message.toString())
            }
        }
    }

    class LoginViewModelProvider(private val repository: UserDataSource): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if(modelClass.isAssignableFrom(LoginViewModel::class.java)){
                return LoginViewModel(repository) as T
            }else{
                throw IllegalArgumentException("Unknown ViewModel class")
            }
        }

    }

}
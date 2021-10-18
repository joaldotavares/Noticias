package br.com.joaldo.news.support

data class Resources<T>(val status: Status, val data: T?, val message: String?) {

    companion object{
        fun <T>success(data: T?): Resources<T> = Resources(Status.SUCCESS, data, null)
        fun <T>erro(data: T?, message: String): Resources<T> = Resources(Status.ERRO, data, message)
        fun <T>loading(data: T?): Resources<T> = Resources(Status.LOADING, data, null)
    }
}

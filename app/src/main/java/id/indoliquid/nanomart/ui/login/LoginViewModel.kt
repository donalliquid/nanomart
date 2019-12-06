package id.indoliquid.nanomart.ui.login

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        val TAG:String = this::class.java.simpleName
    }

    var nanomartId = MutableLiveData<String>()
    var password = MutableLiveData<String>()
    private val sp: SharedPreferences = getApplication<Application>().getSharedPreferences("Nanomart", Context.MODE_PRIVATE)

    init {
        nanomartId.value = sp.getString("NanomartID","")
        password.value = sp.getString("Password","")
        nanomartId.value
    }

    fun loginBtnOnClick(view:View) {

    }

}

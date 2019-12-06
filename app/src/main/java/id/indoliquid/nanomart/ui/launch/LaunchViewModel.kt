package id.indoliquid.nanomart.ui.launch

import android.app.Application
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class LaunchViewModel(application: Application) : AndroidViewModel(application) {

    companion object{
        val TAG: String = this::class.java.simpleName
    }

    var launchStatus = MutableLiveData<String>()
    val connectUHFR2000 = MutableLiveData<Boolean>()

    init {
        launchStatus.value = "Launching..."
    }

    fun connectAndroidOnClick(view:View) {

    }

    fun getDoorStatusOnClick(view:View){

    }

    fun lockOnClick(view:View){

    }

    fun unlockOnClick(view:View){

    }

    fun onClickRFIDConnect(){

    }

    fun nextOnClick(view:View){

    }

    fun nextNoUsbDebugOnClick(view:View){

    }
}

package id.indoliquid.nanomart

import android.app.Application
import android.content.Context
import io.github.inflationx.calligraphy3.CalligraphyConfig
import io.github.inflationx.calligraphy3.CalligraphyInterceptor
import io.github.inflationx.viewpump.ViewPump

var mContext: Context? = null
fun getContext(): Context? {
    return mContext
}

class NanomartApplication : Application() {
    var noUsbDebugMode = false
    var currentCustomerPhone = ""

    override fun onCreate() {
        super.onCreate()
        ViewPump.init(
            ViewPump.builder()
                .addInterceptor(
                    CalligraphyInterceptor(
                        CalligraphyConfig.Builder()
                            .setDefaultFontPath("fonts/Muli-Regular.ttf")
                            .setFontAttrId(R.attr.fontPath)
                            .build()
                    )
                )
                .build())
        mContext = this
    }
}


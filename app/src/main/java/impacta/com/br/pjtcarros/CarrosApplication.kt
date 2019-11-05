package impacta.com.br.pjtcarros

import android.app.Application
import android.util.Log

class CarrosApplication : Application() {
    private  val TAG = "CarrosApplication"

    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object{
        private var appInstance : CarrosApplication? = null

        fun getInstance () :CarrosApplication {
            if(appInstance == null){
                throw IllegalStateException("Configure a classe de application no androidManifest.xml")
            }
                return appInstance!!
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG,"CarrosApplication.onTerminate()")
    }
}
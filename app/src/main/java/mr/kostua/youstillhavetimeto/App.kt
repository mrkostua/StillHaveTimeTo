package mr.kostua.youstillhavetimeto

import android.app.Application
import mr.kostua.youstillhavetimeto.util.appModule
import mr.kostua.youstillhavetimeto.util.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initDependenciesInjection()
        initTimber()
    }

    private fun initDependenciesInjection() {
        startKoin {
            androidContext(this@App)
            modules(modules = listOf(viewModelModule, appModule))
        }
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            //TODO: implement logging to Crashlytics events
        }
    }
}
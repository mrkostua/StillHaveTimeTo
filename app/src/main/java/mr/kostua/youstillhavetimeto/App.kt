package mr.kostua.youstillhavetimeto

import android.app.Application
import mr.kostua.youstillhavetimeto.util.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        initDependenciesInjection()
    }

    private fun initDependenciesInjection() {
        startKoin{
            androidContext(this@App)
            modules(modules = listOf(viewModelModule))
        }
    }
}
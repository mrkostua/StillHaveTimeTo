package mr.kostua.youstillhavetimeto.util

import mr.kostua.youstillhavetimeto.data.AppPreferences
import mr.kostua.youstillhavetimeto.ui.start.age.AgeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {
    viewModel { AgeViewModel() }
}

val appModule: Module = module {
    single { AppPreferences(androidContext()) }
}
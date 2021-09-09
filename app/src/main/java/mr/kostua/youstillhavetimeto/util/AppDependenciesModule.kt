package mr.kostua.youstillhavetimeto.util

import mr.kostua.youstillhavetimeto.ui.start.age.AgeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {
    viewModel { AgeViewModel() }
}
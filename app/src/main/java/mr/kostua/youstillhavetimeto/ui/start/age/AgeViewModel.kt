package mr.kostua.youstillhavetimeto.ui.start.age

import androidx.lifecycle.MutableLiveData
import mr.kostua.youstillhavetimeto.util.BaseViewModel

class AgeViewModel : BaseViewModel<AgeEvents>() {
    val name = MutableLiveData<String>()

    init {
        name.value = "Chess rules"
    }
}
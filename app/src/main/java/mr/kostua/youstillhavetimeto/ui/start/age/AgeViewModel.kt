package mr.kostua.youstillhavetimeto.ui.start.age

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AgeViewModel : ViewModel() {
    val name = MutableLiveData<String>()

    init {
        name.value = "Chess rules"
    }
}
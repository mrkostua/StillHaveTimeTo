package mr.kostua.youstillhavetimeto.util

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mr.kostua.youstillhavetimeto.util.event.Event
import mr.kostua.youstillhavetimeto.util.event.SpecificEvent

abstract class BaseViewModel<T : SpecificEvent> : ViewModel() {
    private val mEvent: MutableLiveData<Event<T>> = MutableLiveData()
    val event: LiveData<Event<T>> = mEvent

    fun sendEvent(event: T) {
        mEvent.value = Event(event)
    }
}
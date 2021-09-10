package mr.kostua.youstillhavetimeto.util.event

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

inline fun <T : Any, L : LiveData<Event<T>>> LifecycleOwner.observeEvent(liveData: L, crossinline body: (T?) -> Unit) {
    liveData.observe(this, Observer { body(it.getContentIfNotHandled()) })
}

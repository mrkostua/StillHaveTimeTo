package mr.kostua.youstillhavetimeto.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore(name = "YouStillHaveYourTime")

class AppPreferences(val context: Context) {
    companion object {
        val USE_AGE_KEY = intPreferencesKey("USE_AGE_KEY")
    }

    val age: Flow<Int> = context.dataStore.data.map { it[USE_AGE_KEY] ?: -1 }

    suspend fun storeAge(age: Int) {
        context.dataStore.edit {
            it[USE_AGE_KEY] = age
        }
    }
}